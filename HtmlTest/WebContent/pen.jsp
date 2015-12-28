<%@page import="java.util.Random"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

PrintWriter outttt = response.getWriter();
	
HashSet<Integer> hs = new HashSet<Integer>();
Random rdm = new Random();
while (hs.size() < 10) {
	int num = rdm.nextInt(10 + 1 - 1) + 1;
	hs.add(num);
	
}
while
outttt.print(hs.);
%>
</body>
</html>