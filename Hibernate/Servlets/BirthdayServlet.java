package com.jwt.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BirthdayServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//set response content type
		response.setContentType("text/html");
		
		Print.Writer out = response.getWriter();
		String title = "Using GET method to read form data";
		String docType =
			"<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		
		out.Println(docType +
			    "<html>\n" +
            			"<head><title>" + title + "</title></head>\n" +
            			"<body bgcolor = \"#f0f0f0\">\n" +
               				"<h1 align = \"center\">" + title + "</h1>\n" +
               				"<ul>\n" +
                  		           "  <li><b>Birth Day</b>: "
                 			   + request.getParameter("birth_day") + "\n" +
                 			   "  <li><b>Birth Month</b>: "
                			   + request.getParameter("birth_month") + "\n" +
			    		   "  <li><b>Birth Year</b>: "
                			   + request.getParameter("birth_year") + "\n" +
              			        "</ul>\n" + 	
            			"</body>
         		    </html>"
      			);
  		}

   // Method to handle POST method request.
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      doGet(request, response);
	}
}
