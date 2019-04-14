import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class submitFormServletPOSTmethod extends HttpServlet 
{
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
    {
		String textValue = request.getParameter("userName");
		response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

		System.out.println("spk inside doPost");
		
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html><html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\" />");

        String title = "spk Title";
        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
		out.println("Inside doPost method of the servlet.<br>");
		out.println("Received text : "+textValue);
		out.println("</body>");
        out.println("</html>");
    }
}
