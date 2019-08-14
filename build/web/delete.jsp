<%-- 
    Document   : delete
    Created on : Jul 8, 2019, 11:25:31 PM
    Author     : Madhushanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<%String id[]= new String[10];
for(int i=0;i<10;i++){
id[i]=request.getParameter("check"+i);
out.println(id[i]);
}
%>


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

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
    </head>
    <body>
        <%
                try {
                     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                     statement=connection.createStatement();
                     for(int a=0;a<10;a++){
                     statement.executeUpdate("delete from booklist where isbn_no='"+id[a]+"'");
                     }
                     
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
