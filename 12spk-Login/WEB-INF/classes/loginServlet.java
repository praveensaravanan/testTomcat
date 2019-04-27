import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class loginServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		System.out.println("spk loginServlet doGet method starts");
		String userName =request.getParameter("userName");
		String userPwd =request.getParameter("userPwd");
		if(userName!=null && userName.equals(userPwd))
		{
			HttpSession session = request.getSession();
			session.setAttribute("isValidLogin",true);
			RequestDispatcher rd = request.getRequestDispatcher("successfullyLoggedIn");
			rd.forward(request, response);
			return;
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}
}
