package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoimpt.UserDaoImpl;
import vo.ResultVO;
import vo.UserVO;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
	UserDaoImpl daoImpl = new UserDaoImpl();
	ResultVO rvo = new ResultVO();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
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
		// TODO Auto-generated method stub
		try {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("phone");
			String city = request.getParameter("city");
			String gender = request.getParameter("gender");
			String password = request.getParameter("password");
			
			UserVO uvo = new UserVO();
			uvo.setName(name);
			uvo.setEmail(email);
			uvo.setContact(contact);
			uvo.setCity(city);
			uvo.setGender(gender);
			uvo.setPassword(password);
			
			rvo = daoImpl.dataInsert(uvo);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/newlink.jsp");
			rd.include(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
