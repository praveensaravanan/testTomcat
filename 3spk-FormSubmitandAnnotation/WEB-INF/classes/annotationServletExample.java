import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import javax.servlet.annotation.WebServlet;

@WebServlet("/servletWithAnnotation")
public class annotationServletExample extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("Congrats!!! You are redirected to servlet without entry in web.xml.You dont use form submit also.<br><br> You are redirected to doGet method of the servlet<br><br> "+
		"Even we have a folder servletWithAnnotation , we are redirected to the servlet and not to the servletWithAnnotation\\index.jsp<br><br>"+
		"If you remove this class file from the classes folder, then you will be redirected to servletWithAnnotation\\index.jsp");
	}
	
	// It is a dummy method.
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		doGet(request,response);
	}
}
