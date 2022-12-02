package perform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EOcheck
 */
@WebServlet("/EOcheck")
public class EOcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EOcheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=null;
		try {
			out=response.getWriter();
			int n=Integer.parseInt(request.getParameter("t1"));
			out.println("<center>");
			if(n%2==0)
				out.println("<font color=blue>"+n+" is even number</font>");
			else
				out.println("<font color=red>"+n+" is odd Number</font>");			
			
		}
		catch (Exception e){
			out.println("Error :"+e.getMessage());
		}
		
		finally {
			out.println("<br><br>");
			out.print("To go to main page <a href=login.html>CLICK HERE</a>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}