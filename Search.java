package com.myserv.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myserv.dao.ProductDao;


@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prodName=(request.getParameter("prodName"));
	       PrintWriter out= response.getWriter();
	       
	response.setContentType("text/html");
	ProductDao dao=new ProductDao();
	dao.searchproductbyname(prodName);
	}	
	
	}


