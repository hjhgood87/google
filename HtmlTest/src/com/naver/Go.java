package com.naver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */

public class Go extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Go() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		String id= request.getParameter("id");
		String passwd= request.getParameter("pssswd");
		String name= request.getParameter("name");
		
//		id=URLDecoder.decode(id, "UTF-8");
//		id=URLDecoder.decode(id, "UTF-8");
		//name=URLDecoder.decode(name, "euc-kr");
		//name=URLEncoder.encode(name, "euc-kr");
		
		
		
		out.print("ID: "+id +"<br>pass: "+ passwd+"<br>name: "+ name);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String id= request.getParameter("id");
		String passwd= request.getParameter("pssswd");
		String name= request.getParameter("name");
		out.print("ID: "+id +"<br>pass: "+ passwd+"<br>name: "+ name);
		
		doGet(request, response);
	}

}
