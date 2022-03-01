<%@ page
language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"


buffer="12kb"
autoFlush="false"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	//int i=1/0;
%>
	<%
		String name=request.getParameter("uname");
		out.println("Welcome....:"+name);	
	%>
	
	<%=application.getRealPath("") %>
	
	<%!
		int i;
		public void met(){
			System.out.println("welcome to JSP");
		}
	%>
	
	<%
		for(int i=0;i<200;i++)
		{
			out.println("अलमामैटर में आपका स्वागत है");
			out.println("அல்மாமட்டருக்கு வரவேற்கிறோம்");
		}
	%>
</body>
</html>