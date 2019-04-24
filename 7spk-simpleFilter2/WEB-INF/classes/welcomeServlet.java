import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class welcomeServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		System.out.println("spk welcomeServlet doGet method starts");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		pw.println("Welcome "+name);
		pw.println("<br><a href=\"dummyJSPHTML/index.jsp\">click here</a> and watch the filter");
		System.out.println("spk welcomeServlet doGet method ends");
	}
}
