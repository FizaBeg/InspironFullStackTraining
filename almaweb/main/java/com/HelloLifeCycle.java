package com;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class HelloLifeCycle
 */
@WebServlet(
			//loadOnStartup = 1,
			urlPatterns = {"/blabla","*.do","/Hello"},
			initParams = {
					@WebInitParam(name="mykey",value="my value....."),
					@WebInitParam(name="mykey2",value="my value.22222222222222222222....")
			}
		)
public class HelloLifeCycle extends HttpServlet {
		@Override
		public void init(ServletConfig config) throws ServletException {
			System.out.println("init called..of alma life cycle servlet called....");
			String mykeyvalue=config.getInitParameter("mykey");
			System.out.println(mykeyvalue);
			String mykeyvalue2=config.getInitParameter("mykey2");
			System.out.println(mykeyvalue2);
		}
		
		
		@Override
		public void destroy() {
			System.out.println("destroy called...");
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	//	response.getWriter().append("Served at: ").append("hai...................");
		ServletOutputStream out=response.getOutputStream();
		out.println("welcome................."+request.getParameter("uname"));
		System.out.println("do get called....");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}