package com.example.servlet;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/AttendanceServlet")
public class AttendanceServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Author: RISHI KUMAR | UID: 23BCS14134

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String studentId = request.getParameter("studentId");
        String date = request.getParameter("date");
        String status = request.getParameter("status");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/your_database_name", "your_username", "your_password");

            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO Attendance (StudentID, Date, Status) VALUES (?, ?, ?)");
            ps.setString(1, studentId);
            ps.setString(2, date);
            ps.setString(3, status);

            int rows = ps.executeUpdate();
            conn.close();

            if (rows > 0) {
                response.sendRedirect("success.jsp");
            } else {
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h3>Failed to record attendance.</h3>");
                out.close();
            }

        } catch (Exception e) {
            throw new ServletException("DB Error: " + e.getMessage());
        }
    }
}
