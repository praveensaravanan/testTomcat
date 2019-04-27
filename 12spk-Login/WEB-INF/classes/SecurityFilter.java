import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;


public class SecurityFilter implements Filter
{
	public void  init(FilterConfig config) throws ServletException
	{
		// Called once
		System.out.println("spk Inside SecurityFilter init method.");
	}
   
	public void  doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws java.io.IOException, ServletException
	{
		// Called per request which satisfies the url-pattern for this filter.
		System.out.println("spk Inside SecurityFilter doFilter() starts ");
		HttpSession session = ((HttpServletRequest)request).getSession();
		Object isValidLogin = session.getAttribute("isValidLogin");
		String servletPath = ((HttpServletRequest)request).getServletPath().toString();
		System.out.println("spk Inside SecurityFilter doFilter() servletPath = "+servletPath);
		if(isValidLogin != null && servletPath.equalsIgnoreCase("/index.jsp"))
		{
			System.out.println("spk Inside SecurityFilter doFilter(). As you already have a session,you will be logged in by default even when you try to access login page.");
			request.getRequestDispatcher("successfullyLoggedIn").forward(request, response);
			return;
		}
		if(isValidLogin == null && !servletPath.equalsIgnoreCase("/login") && !servletPath.equalsIgnoreCase("/index.jsp"))
		{
			System.out.println("spk Inside SecurityFilter doFilter(). Going to redirect to the login Page. ");
			PrintWriter out = response.getWriter();
			out.println("<font color=red>You dont have a valid session.Please Login.</font> <BR>");
			//request.getRequestDispatcher("index.jsp").forward(request, response);
			request.getRequestDispatcher("index.jsp").include(request, response);
			return;
		}
		Cookie[] cookies = ((HttpServletRequest)request).getCookies();
        for (int i = 0; cookies!=null && i < cookies.length; i++)
		{
            Cookie cookie = cookies[i];
			System.out.println("cookie: "+cookie.getName()+" = "+cookie.getValue());
        }
		
		System.out.println("spk Inside SecurityFilter doFilter(). Before doFilter ");
		// Pass request back down the filter chain and to the servlet. FilterChain is must even if you have 1 filter.
		filterChain.doFilter(request,response);
		System.out.println("spk Inside SecurityFilter doFilter(). After doFilter ");
	}

	public void destroy( )
	{
		// Called before the Filter instance is removed from service by the web container
		System.out.println("spk Inside SecurityFilter destroy method.");
	}
}