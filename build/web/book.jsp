<%-- 
    Document   : book
    Created on : Jul 8, 2019, 9:12:36 AM
    Author     : Madhushanka
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
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Library Management</title>
        <link rel="stylesheet" href="style.css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <%@include file="header.jsp" %>

        <div class="leftcolumn">
            <h1><u>Add a book</u></h1><br>
            <div class="book-info">
                <form action="insert.jsp">
                    <table align="center">
                        <tr>
                            <td align="right"><font color="gray"><b>Isbn number : </b></font></td>
                            <td><input type="text" class="form-control col-md-8" name="isbnNumber" placeholder="Isbn number" size="35"></td>
                        </tr>
                        <tr>
                            <td align="right"><font color="gray"> <b>Description : </b></font> </td>
                            <td><input type="text" class="form-control col-md-8" name="description" placeholder="Short Desc" size="35"></td>
                        </tr>
                        <tr>
                            <td align="right"><font color="gray"> <b>Price : </b></font> </td>
                            <td><input type="text" class="form-control col-md-8" name="price" placeholder="Price" size="35"></td>
                        </tr>
                        <tr>
                            <td colspan="2" style="text-align: center"> <input type="submit" value="Add Book" class="btn btn-primary mt-2" ></td> 
                        </tr>
                    </table>
                </form>

            </div>

        </div>

        <div class="rightcolumn">
            <h1><u>Library Book List</u></h1><br>
            <div class="show-books">
                <form method="post" action="delete.jsp">
                    <table class="table table-striped table-dark">
                        <thead>
                            <tr>
                                <th scope="col">Isbn_no</th>
                                <th scope="col">Short description</th>
                                <th scope="col">Price</th>
                                <th scope="col">Del.</th>
                            </tr>
                        </thead>
                        <%try {
                                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "");
                                statement = connection.createStatement();
                                String sql = "SELECT * FROM booklist";

                                resultSet = statement.executeQuery(sql);
                                int i = 0;
                                while (resultSet.next()) {
                        %>
                        <tbody>
                        <td><%=resultSet.getString("isbn_no")%></td>
                        <td><%=resultSet.getString("description")%></td>
                        <td><%=resultSet.getString("price")%></td>

                        <td><input type="checkbox" name="check<%=i%>" value=<%= resultSet.getString("isbn_no")%>></td>
                        </tbody>
                        <%
                                    i++;
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        %>
                    </table>
                    <center>  <input type="submit" class="btn btn-danger" value="Delete Book(s)" class="btn btn-primary mt-2" ></center>
                </form>
            </div>

        </div>    

        <%@include file="footer.jsp" %>       

    </body>



</html>

