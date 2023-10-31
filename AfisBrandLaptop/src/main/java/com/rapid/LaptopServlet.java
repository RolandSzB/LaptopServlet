package com.rapid;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class LaptopServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String laptopBrand = req.getParameter("brand");
		 int brandLength = laptopBrand.length();
		 
		 if(brandLength % 2 ==0 ) {
			 String r="par";
			 req.setAttribute("paritate", r);
		 } else {
			 String r="impar";
			 req.setAttribute("paritate", r);
		 }
		 
		 
		req.setAttribute("laptopAlias", laptopBrand);
		
		req.setAttribute("brandLength", brandLength);
		
           
		
		req.getRequestDispatcher("length.jsp").forward(req, res);
		
	}

}