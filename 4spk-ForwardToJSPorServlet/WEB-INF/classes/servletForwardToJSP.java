import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class servletForwardToJSP extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
    {
		Boolean JSPfromRootContext = Boolean.valueOf(request.getParameter("JSPfromRootContext"));
		Boolean forwardToAnotherServlet = Boolean.valueOf(request.getParameter("forwardToAnotherServlet"));
		System.out.println("Inside servletForwardToJSP JSPfromRootContext = "+JSPfromRootContext+" forwardToAnotherServlet = "+forwardToAnotherServlet);

		if(JSPfromRootContext)
		{
			request.getRequestDispatcher("/JSPResultPage2.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("JSPResultPage2.jsp").forward(request, response);
		}
    }
}
