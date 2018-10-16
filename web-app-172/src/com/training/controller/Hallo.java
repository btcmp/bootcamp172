package com.training.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Hallo extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hallo java servlet");
		//show to browser / html
		PrintWriter outputHTML = resp.getWriter();
		try {
			outputHTML.println("hallo java servlet html");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
