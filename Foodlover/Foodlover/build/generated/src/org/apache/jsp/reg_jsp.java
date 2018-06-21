package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>FOODLOVER - REGISTRIERUNG</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\">\n");
      out.write("    <th> <img src=\"logo.PNG\" alt=\"logo.PNG\"/></th>\n");
      out.write("    <br>\n");
      out.write("         \n");
      out.write("           <a href=\"index.jsp\"><button>Home</button></a>\n");
      out.write("           <a href=\"restaurants.jsp\"><button>Restaurants</button></a>\n");
      out.write("           <a href=\"kontakt.jsp\"><button>Kontakt</button></a>\n");
      out.write("           <a href=\"reg.jsp\"><button>Registrierung</button></a>\n");
      out.write("           <a href=\"login2.jsp\"><button>Login</button></a>\n");
      out.write("    \n");
      out.write("    <br><br/>\n");
      out.write("        <th> <img src=\"NochKeinFoodlover.PNG\" alt=\"logo.PNG\"/></th>\n");
      out.write("        <h4>Jetzt schnell und einfach loslegen! </h4>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"login.jsp\" method=\"post\">\n");
      out.write("            Benutzername: <input type=\"text\" name=\"Benutzer\" required=\"required\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            E-Mail-Adresse: <input type=\"email\" name=\"Email\" required=\"required\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Passwort: <input type=\"password\" name=\"Passwort\" required=\"required\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Passwort erneut eingeben: <input type=\"password\" name=\"password_again\" required=\"required\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\"  value=\"Jetzt Registrieren!\" />\n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("        <th> <img src=\"FoodloveVerbreiten.PNG\" alt=\"logo.PNG\" width=\"240\" height=\"50\"/></th>\n");
      out.write("        <br>\n");
      out.write("        <p></p>\n");
      out.write("        <form action=\"loginRestaurant.jsp\" method=\"post\">\n");
      out.write("            Benutzername (Name des Restaurant): <input type=\"text\" name=\"Benutzer\" required=\"required\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Küche: <input type=\"text\" name=\"küche\" required=\"required\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Straße: <input type=\"text\" name=\"straße\" required=\"required\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Telefonnummer: <input type=\"tel\" name=\"telefon\" required=\"required\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            E-Mail-Adresse: <input type=\"email\" name=\"Email\" required=\"required\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Öffnungszeiten: <input type=\"text\" name=\"zeit\" required=\"required\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Website: <input type=\"url\" name=\"website\" required=\"required\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Passwort: <input type=\"password\" name=\"Passwort\" required=\"required\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Passwort erneut eingeben: <input type=\"password\" name=\"password_again\" required=\"required\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\"  value=\"Jetzt Registrieren!\" />\n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("       </div> \n");
      out.write("     \n");
      out.write("    </body> \n");
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
