package com.naver;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;




/**
 * Servlet implementation class Test8
 */

public class Test9 extends HttpServlet {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	DataSource ds;

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Test9() {
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
		getprint(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DDDD");
		// TODO Auto-generated method stub
		getprint(request, response);
		MemberBean memberBean = new MemberBean();
		boolean result=false;
		memberBean.setName(request.getParameter("name"));
		memberBean.setId(request.getParameter("id"));
		memberBean.setPw(request.getParameter("pw"));
		memberBean.setArea(request.getParameter("area"));
		memberBean.setHobby(request.getParameter("hobby"));
		
		System.out.println("DB");
		joinMemner(memberBean);
		System.out.println("DDDD");
	}

	protected void getprint(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String paramString = (String) names.nextElement();
			String val = request.getParameter(paramString);
			// out.println(paramString+"="+val+"<br>");
			String[] arr = request.getParameterValues(paramString);
			for (String string : arr) {
				out.println(paramString + "->" + string + "<br>");
			}
		}
	}

	public boolean joinMemner(MemberBean memberBean) {
		try {
			Context init = new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/Member");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String sql = "insert into member2 (id,pw,name, hobby,area,JOINDATE) " + "values(?,?,?,?,?,sysdate)";
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			System.out.println(sql);
			ps.setString(1, memberBean.getId());
			ps.setString(2, memberBean.getPw());
			ps.setString(3, memberBean.getName());
			ps.setString(4, memberBean.getHobby());
			ps.setString(5, memberBean.getArea());
			ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			try {

				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return true;
	}

}
