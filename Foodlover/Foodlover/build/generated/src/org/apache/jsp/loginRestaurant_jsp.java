package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public final class loginRestaurant_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html PUBLIC>\n");
      out.write("<html lang=\"de\">\n");
      out.write("<head>\n");
      out.write("    <title>FOODLOVER - LOGIN</title>\n");
      out.write("    <meta charset=\"ISO-8859-1\">\n");
      out.write("    <link href=\"stylelogin.css\" rel=stylesheet type=\"text/css\">\n");
      out.write("</head> \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            try {
            String name = request.getParameter("Benutzer");
            String küche = request.getParameter("küche");
            String straße = request.getParameter("straße");
            String telefon = request.getParameter("telefon");
            String öffnung = request.getParameter("zeit");
            String website = request.getParameter("website");
            String password = request.getParameter("Passwort");
            String email = request.getParameter("Email");
            //String again = request.getParameter("password_again");
            
            String sql ="Insert into Restaurant(Name,Küche,Straße,Telefonnummer,Email,Öffnungszeiten,Website,Passwort) values (?,?,?,?,?,?,?,?  )";         
 			String connectionURL = "jdbc:mysql://gauss.wi.hm.edu:3070/se1_foodlover?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
 			Connection connection = null;
 			Class.forName("com.mysql.cj.jdbc.Driver");
 			connection=DriverManager.getConnection(connectionURL,"hashemi","Said.96");
           
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,küche);
            ps.setString(3,straße);
            ps.setString(4,telefon);
            ps.setString(5,email);
            ps.setString(6,öffnung);
            ps.setString(7,website);
            ps.setString(8,password);
            ps.executeUpdate();
            
            out.println("Du hast dich erfolgreich registriert!");
            
            
            
        } catch (ClassNotFoundException ex ) {
            ex.printStackTrace();
          
        }
        
      out.write("  \n");
      out.write("        \n");
      out.write("    <th> <img src=\"logo.PNG\" alt=\"logo.PNG\"/></th>\n");
      out.write("    <br><br>\n");
      out.write("           <a href=\"index.jsp\"><button>Home</button></a>\n");
      out.write("           <a href=\"restaurants.jsp\"><button>Restaurants</button></a>\n");
      out.write("           <a href=\"kontakt.jsp\"><button>Kontakt</button></a>\n");
      out.write("           <a href=\"reg.jsp\"><button>Registrierung</button></a>\n");
      out.write("           <a href=\"login2.jsp\"><button>Login</button></a>\n");
      out.write("           \n");
      out.write("    <br><br>\n");
      out.write("    <form action=\"LogSuccessR.jsp\" method=\"post\">\n");
      out.write("        \n");
      out.write("            <p>\n");
      out.write("            Benutzername: <input type=\"text\" name=\"Benutzer\" required=\"required\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("            Passwort:<input type=\"password\" name=\"Passwort\" required=\"required\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("            <a href=\"reg.jsp\">Passwort vergessen?</a>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <a href=\"login2.jsp\"><button>Log dich ein!</button></a>\n");
      out.write("            \n");
      out.write("            </p>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            </p>\n");
      out.write("        \n");
      out.write("            <p>\n");
      out.write("            <a href=\"index.jsp\">Oder direkt zu den Besten Restaurants der Stadt?</a>\n");
      out.write("            </p>\n");
      out.write("    </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
