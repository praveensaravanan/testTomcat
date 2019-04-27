import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;


public class LogFilter implements Filter
{
	public void  init(FilterConfig config) throws ServletException
	{
		// Called once
		System.out.println("spk Inside LogFilter init method.");
		String filterParamValue = config.getInitParameter("spk-initial-filter-param"); 
		String filterParam2Value = config.getInitParameter("spk-initial-filter-param2"); 

		System.out.println("filterParamValue = " + filterParamValue+" filterParam2Value = "+filterParam2Value);
   }
   
	public void  doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws java.io.IOException, ServletException
	{
		// Called per request which satisfies the url-pattern for this filter.
		System.out.println("spk Inside LogFilter doFilter() starts. ");
		String ipAddress = request.getRemoteAddr();
		String contextPath = ((HttpServletRequest)request).getContextPath();
		System.out.println("IP "+ ipAddress + ", Time " + new Date().toString()+"  contextPath = "+contextPath);

		System.out.println("spk Inside LogFilter doFilter(). Before doFilter ");
		// Pass request back down the filter chain and to the servlet. FilterChain is must even if you have 1 filter.
		filterChain.doFilter(request,response);
		System.out.println("spk Inside LogFilter doFilter(). After doFilter ");
	}

	public void destroy( )
	{
		// Called before the Filter instance is removed from service by the web container
		System.out.println("spk Inside LogFilter destroy method.");
	}
}