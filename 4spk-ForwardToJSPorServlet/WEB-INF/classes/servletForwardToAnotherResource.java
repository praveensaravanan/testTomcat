import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class servletForwardToAnotherResource extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
    {
		Boolean JSPfromRootContext = Boolean.valueOf(request.getParameter("JSPfromRootContext"));
		Boolean forwardToAnotherServlet = Boolean.valueOf(request.getParameter("forwardToAnotherServlet"));
		System.out.println("Inside servletForwardToAnotherResource JSPfromRootContext = "+JSPfromRootContext+" forwardToAnotherServlet = "+forwardToAnotherServlet);
		//forward request to another servlet.
		if(forwardToAnotherServlet)
		{
			System.out.println("Going to forward to another servlet (servletForwardToJSP)");
			request.getRequestDispatcher("servletForwardToJSP").forward(request, response);
		}
		//forward request to JSP.
		if(JSPfromRootContext)
		{
			request.getRequestDispatcher("/JSPResultPage.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("JSPResultPage.jsp").forward(request, response);
		}
    }
}
