package com;

import java.io.IOException;
import java.rmi.Naming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rmipack.Stock;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Alma Servlet called....");
		try {
		Stock stock =(Stock)Naming.lookup("rmi://localhost:2000/mystockserver");
		
		System.out.println(stock.getStockPrice("wipro"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		}

	

}
