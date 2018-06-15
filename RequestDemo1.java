package cn.tedu.day11.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//GET������HTTP��Ĭ������ʽ
		//getRequestURL����--���ؿͻ��˷�����������URL
		String url = req.getRequestURL().toString();
		System.out.println("url="+url);
		//getRequestURI����--�����������е���Դ������
		String uri = req.getRequestURI();
		System.out.println("uri="+uri);
		//getQueryString����--�����������еĲ�������
		String qs = req.getQueryString();
		System.out.println("queryString="+qs);
		//getRemoteAddr����--���ط�������Ŀͻ�����IP��ַ
		String ra = req.getRemoteAddr();
		System.out.println("remoteAddr="+ra);
		//getMethod����--���ؿͻ���������ʽ
		String method = req.getMethod();
		System.out.println("method="+method);
		//getContextPath����--��õ�ǰwebӦ�õ�����Ŀ¼����
		String cp = req.getContextPath();
		System.out.println("contextPath="+cp);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
