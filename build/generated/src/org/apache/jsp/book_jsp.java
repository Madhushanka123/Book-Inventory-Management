package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


    try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Library Management</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">   \n");
      out.write("             <h1><b>Book Inventory Control</b></h1>\n");
      out.write("             <hr>\n");
      out.write("         </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"leftcolumn\">\n");
      out.write("            <h1><u>Add a book</u></h1><br>\n");
      out.write("            <div class=\"book-info\">\n");
      out.write("                <form action=\"insert.jsp\">\n");
      out.write("                    <table align=\"center\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td align=\"right\"><font color=\"gray\"><b>Isbn number : </b></font></td>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control col-md-8\" name=\"isbnNumber\" placeholder=\"Isbn number\" size=\"35\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td align=\"right\"><font color=\"gray\"> <b>Description : </b></font> </td>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control col-md-8\" name=\"description\" placeholder=\"Short Desc\" size=\"35\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td align=\"right\"><font color=\"gray\"> <b>Price : </b></font> </td>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control col-md-8\" name=\"price\" placeholder=\"Price\" size=\"35\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" style=\"text-align: center\"> <input type=\"submit\" value=\"Add Book\" class=\"btn btn-primary mt-2\" ></td> \n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"rightcolumn\">\n");
      out.write("            <h1><u>Library Book List</u></h1><br>\n");
      out.write("            <div class=\"show-books\">\n");
      out.write("                <form method=\"post\" action=\"delete.jsp\">\n");
      out.write("                    <table class=\"table table-striped table-dark\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"col\">Isbn_no</th>\n");
      out.write("                                <th scope=\"col\">Short description</th>\n");
      out.write("                                <th scope=\"col\">Price</th>\n");
      out.write("                                <th scope=\"col\">Del.</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        ");
try {
                                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "");
                                statement = connection.createStatement();
                                String sql = "SELECT * FROM booklist";

                                resultSet = statement.executeQuery(sql);
                                int i = 0;
                                while (resultSet.next()) {
                        
      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("isbn_no"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("description"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("price"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td><input type=\"checkbox\" name=\"check");
      out.print(i);
      out.write("\" value=");
      out.print( resultSet.getString("isbn_no"));
      out.write("></td>\n");
      out.write("                        </tbody>\n");
      out.write("                        ");

                                    i++;
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    <center>  <input type=\"submit\" class=\"btn btn-danger\" value=\"Delete Book(s)\" class=\"btn btn-primary mt-2\" ></center>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>    \n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>footer Page</title>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    <center>\n");
      out.write("       \n");
      out.write("        <p>Status on ");
      out.print( new java.util.Date() );
      out.write("</p>\n");
      out.write("        <p>Developer :Madhushanka Chithrananda.</p>\n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("       \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
