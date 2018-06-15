package cn.tedu.day11.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//GET请求是HTTP的默认请求方式
		//getRequestURL方法--返回客户端发出请求完整URL
		String url = req.getRequestURL().toString();
		System.out.println("url="+url);
		//getRequestURI方法--返回请求行中的资源名部分
		String uri = req.getRequestURI();
		System.out.println("uri="+uri);
		//getQueryString方法--返回请求行中的参数部分
		String qs = req.getQueryString();
		System.out.println("queryString="+qs);
		//getRemoteAddr方法--返回发出请求的客户机的IP地址
		String ra = req.getRemoteAddr();
		System.out.println("remoteAddr="+ra);
		//getMethod方法--返回客户机的请求方式
		String method = req.getMethod();
		System.out.println("method="+method);
		//getContextPath方法--获得当前web应用的虚拟目录名称
		String cp = req.getContextPath();
		System.out.println("contextPath="+cp);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
