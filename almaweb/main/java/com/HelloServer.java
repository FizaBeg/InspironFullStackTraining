package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServer")
public class HelloServer extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get - service method of servlet called...");
		System.out.println("logic of servlet will always go here....");
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		
		//ServletOutputStream out=response.getOutputStream();
		//out.println(uname+":"+upass); //data printing or output on browser
		request.setAttribute("problem", "the problem is bla bla bla....");
		
		if(uname.equals("almamatter")) {//page navigation
			response.sendRedirect("welcome.jsp");;
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
		System.out.println("do post - service method of servlet called...");
	}
}