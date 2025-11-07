package com.example.servlet;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Author: RISHI KUMAR | UID: 23BCS14134

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String empIdParam = request.getParameter("empid");

        try {
            // Load JDBC driver and connect to database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/your_database_name", "your_username", "your_password");

            Statement stmt = conn.createStatement();
            ResultSet rs;

            if (empIdParam != null && !empIdParam.isEmpty()) {
                // Search by Employee ID
                rs = stmt.executeQuery("SELECT * FROM Employee WHERE EmpID = '" + empIdParam + "'");
                out.println("<h2>Employee Details</h2>");
            } else {
                // Display all employees
                rs = stmt.executeQuery("SELECT * FROM Employee");
                out.println("<h2>All Employee Records</h2>");
            }

            out.println("<table border='1'>");
            out.println("<tr><th>EmpID</th><th>Name</th><th>Salary</th></tr>");

            boolean found = false;
            while (rs.next()) {
                found = true;
                out.println("<tr><td>" + rs.getString("EmpID") + "</td><td>" +
                            rs.getString("Name") + "</td><td>" +
                            rs.getDouble("Salary") + "</td></tr>");
            }

            out.println("</table>");

            if (!found) {
                out.println("<p>No employee found with ID: " + empIdParam + "</p>");
            }

            conn.close();
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }

        out.close();
    }
}
