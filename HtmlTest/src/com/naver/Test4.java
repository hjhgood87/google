package com.naver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test5
 */

public class Test4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Test4() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		response.setContentType("text/html;charset=utf-8");
//		request.setCharacterEncoding("UTF-8");
//		
//		
//		PrintWriter out = response.getWriter();
//		String id = request.getParameter("id");
//		String passwd = request.getParameter("pssswd");
//		String name = request.getParameter("name");
//		out.print("<!DOCTYPE html><head><meta charset='utf-8'></head>");
//		Enumeration<String> names=request.getParameterNames();
//		while (names.hasMoreElements()) {
//			String paramString = (String) names.nextElement();
//			String val=request.getParameter(paramString);
//			out.println(paramString+"="+val+"<br>");
//		}
//		
		
		
//		id=URLDecoder.decode(id, "UTF-8");
//		id=URLDecoder.decode(id, "UTF-8");
		//name=URLEncoder.encode(name, "euc-kr");
		//name=URLDecoder.decode(name, "utf-8");
		//name=URLEncoder.encode(name, "utf-8");
		//name=URLDecoder.decode(name, "euc-kr");
		//out.println("ID: " + id + "<br>pass: " + passwd + "<br>name: " + name+"</html>");
		//out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String passwd = request.getParameter("pssswd");
		String name = request.getParameter("name");
		Enumeration<String> paramName=request.getParameterNames();
		while (paramName.hasMoreElements()) {
			String string = (String) paramName.nextElement();
			String val=request.getParameter(string);
			out.println(string + " = " + val+"<br>");
			
		}
		//doGet(request, response);
	}

}
