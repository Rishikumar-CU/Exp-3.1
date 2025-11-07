package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Hardcoded credentials
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("<p>Login successful.</p>");
        } else {
            out.println("<h2>Login Failed</h2>");
            out.println("<p>Invalid username or password.</p>");
        }

        out.close();
    }
}
