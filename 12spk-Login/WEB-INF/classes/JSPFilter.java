import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;


public class JSPFilter implements Filter
{
	public void  init(FilterConfig config) throws ServletException
	{
		// Called once
		System.out.println("spk Inside JSPFilter init method.");
	}
   
	public void  doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws java.io.IOException, ServletException
	{
		// Called per request which satisfies the url-pattern for this filter.
		
		System.out.println("spk Inside JSPFilter doFilter(). Before doFilter ");
		// Pass request back down the filter chain and to the servlet. FilterChain is must even if you have 1 filter.
		filterChain.doFilter(request,response);
		System.out.println("spk Inside JSPFilter doFilter(). After doFilter ");
	}

	public void destroy( )
	{
		// Called before the Filter instance is removed from service by the web container
		System.out.println("spk Inside JSPFilter destroy method.");
	}
}