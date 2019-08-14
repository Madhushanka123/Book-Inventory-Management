<%-- 
    Document   : insert
    Created on : Jul 8, 2019, 10:47:13 PM
    Author     : Madhushanka Chithrananda
    Index      :BSC-UGC-SE-16.1-002
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" %>
<%@ page import="java.lang.*" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%

try {
Class.forName("com.mysql.jdbc.Driver");
} 
catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<%--
I used javascript code to reload the page named as book.jsp
So, Please Enable Javascript on your browser before run this application.

--%>
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--
         Insert data into database
         --%>
             <%
             String number=request.getParameter("isbnNumber");
             String desc=request.getParameter("description");
             String price=request.getParameter("price");
             
             
                try {
                     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                     statement=connection.createStatement();
                     String query="INSERT INTO booklist(isbn_no, description, price) VALUES ('"+number+"', '"+desc+"', '"+price+"')";
                     statement.executeUpdate(query);
                   
                    
                    connection.close();
                    } 
                catch (Exception ex) {
                    out.print(ex.getMessage());
                    }
             
             %>
            
             <script type="text/javascript">
                 window.location.reload="book.jsp"    ;
                 
              </script>
                 
                 
    </body>
</html>
