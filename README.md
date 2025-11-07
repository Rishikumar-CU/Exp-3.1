# Web Applications Using Servlets and JSP

Author: RISHI KUMAR  
UID: 23BCS14134

This repository contains three Java web applications demonstrating user input handling, dynamic content generation, and database integration using Servlets, JSP, and JDBC.

---

## 📌 Part A: User Login Using Servlet and HTML Form

### Objective
To develop a Java Servlet that accepts user credentials through an HTML form and displays a personalized welcome message upon successful login.

### Features
- HTML form for username and password
- Servlet handles POST request and validates credentials
- Personalized welcome message on successful login
- Error message on invalid credentials

### Technologies
- Java Servlet API
- HTML
- Apache Tomcat

### How to Run
1. Deploy the project to a servlet container (e.g., Tomcat).
2. Access `login.html` in your browser.
3. Enter credentials and submit the form.

---

## 📌 Part B: Display Employee Records with JDBC and Servlet Integration

### Objective
To create a Java Servlet that integrates with a database using JDBC and displays a list of employees. Includes a search feature to fetch employee details by ID.

### Features
- JDBC connection to MySQL database
- Servlet displays all employee records in an HTML table
- Search form to filter employee by ID
- Dynamic HTML generation using Java

### Technologies
- Java Servlet API
- JDBC
- MySQL
- HTML

### How to Run
1. Set up a MySQL database with an `Employee` table (`EmpID`, `Name`, `Salary`).
2. Update DB credentials in the servlet.
3. Deploy to Tomcat and access the search form.
4. View all employees or search by ID.

---

## 📌 Part C: Student Attendance Portal Using JSP and Servlet

### Objective
To develop a student attendance portal using JSP for the frontend and a Servlet for handling form submissions and saving attendance data to a database.

### Features
- JSP page with attendance form (Student ID, Date, Status)
- Servlet processes form data and inserts into database
- Confirmation message or success page on submission
- Real-time form submission and storage

### Technologies
- JSP
- Java Servlet API
- JDBC
- MySQL

### How to Run
1. Create a MySQL `Attendance` table (`StudentID`, `Date`, `Status`).
2. Update DB credentials in the servlet.
3. Deploy to Tomcat and access `attendance.jsp`.
4. Submit attendance and view confirmation.

---

## 🛠️ Requirements

- Java JDK 11+
- Apache Tomcat
- MySQL
- JDBC Driver
- Servlet API

---

## 📂 Folder Structure

WebAppProjects/ ├── PartA_LoginServlet/ ├── PartB_EmployeeRecords/ └── PartC_AttendancePortal/
Each folder contains its own HTML/JSP files, servlet classes, and configuration.
