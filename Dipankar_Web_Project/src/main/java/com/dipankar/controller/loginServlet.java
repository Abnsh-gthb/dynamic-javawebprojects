package com.dipankar.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dipankar.daoimpl.UserDaoImpl;
import com.dipankar.vo.ResultVO;
import com.dipankar.vo.UserVO;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	UserDaoImpl daoImpl = new UserDaoImpl();
	ResultVO rvo = new ResultVO();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Writer out = null;
			PrintWriter pw = new PrintWriter(out);
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			UserVO uvo=new UserVO();
			uvo.setEmail(email);
			uvo.setPassword(password);
			
			if(daoImpl.userlogin(uvo)) {
				HttpSession session = request.getSession();
				session.setAttribute("email", email);
				response.sendRedirect("home.jsp");
			}
			
			else {
				HttpSession session = request.getSession(); 
				pw.println("Wrong Info");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
