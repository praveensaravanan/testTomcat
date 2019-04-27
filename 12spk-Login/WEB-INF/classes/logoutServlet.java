import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class logoutServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		System.out.println("spk logoutServlet doGet method starts");
		
		HttpSession session = request.getSession();
		session.invalidate();
			
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}
}
