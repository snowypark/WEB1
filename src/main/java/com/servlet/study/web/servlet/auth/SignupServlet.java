package com.servlet.study.web.servlet.auth;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/auth/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public SignupServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Get 요청?");
		
	}


	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, 
	IOException {
		
	System.out.println("Post 요청?");
		
	}

}
