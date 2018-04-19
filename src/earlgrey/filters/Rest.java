package earlgrey.filters;


import java.io.IOException;
import java.io.InputStream;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import earlgrey.core.Gear;
/**
 * Servlet Filter implementation class Angular
 */
@WebFilter("/api/*")
public class Rest extends Apicore implements Filter {

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		this.ApiEngine(request, response, chain);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	protected void GET(HttpServletRequest request, HttpServletResponse response){
		Gear engine = new Gear(request,response);
		engine.get(false);
	}
	protected void POST(HttpServletRequest request, HttpServletResponse response){
		Gear engine = new Gear(request,response);
		engine.post(false);
	}
	protected void PUT(HttpServletRequest request, HttpServletResponse response){
		Gear engine = new Gear(request,response);
		engine.put(false);
	}
	protected void DELETE(HttpServletRequest request, HttpServletResponse response){
		Gear engine = new Gear(request,response);
		engine.delete(false);
	}
	protected void PATCH(HttpServletRequest request, HttpServletResponse response){
		Gear engine = new Gear(request,response);
		engine.patch(false);
	}
	protected void OPTIONS(HttpServletRequest request, HttpServletResponse response){
		Gear engine = new Gear(request,response);
		engine.options(false);
	}

}
