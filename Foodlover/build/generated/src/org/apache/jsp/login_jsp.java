package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC>\n");
      out.write("<html lang=\"de\">\n");
      out.write("<head>\n");
      out.write("    <title>FOODLOVER - LOGIN</title>\n");
      out.write("    <meta charset=\"ISO-8859-1\">\n");
      out.write("    <link href=\"stylelogin.css\" rel=stylesheet type=\"text/css\">\n");
      out.write("</head> \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    <th> <img src=\"logo.PNG\" alt=\"logo.PNG\"/></th>\n");
      out.write("    <form action=\"send.html\" method=\"post\">\n");
      out.write("        \n");
      out.write("           <p>\n");
      out.write("            <label for=\"Email Adresse\"> Email Adresse:\n");
      out.write("            <input id=\"Email-Adresse\" type=\"email\" required />\n");
      out.write("            </label>  \n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("            <label for=\"Passwort\"> Passwort:\n");
      out.write("            <input id=\"Passwort\" type=\"password\" required />\n");
      out.write("            </label>\n");
      out.write("           </p>\n");
      out.write("        \n");
      out.write("            <p>\n");
      out.write("            <a href=\"passwort_vergessen.html\">Passwort vergessen?</a>\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("            <button name=\"absenden\" value=\"abgesendet\" type=\"submit\">Anmelden</button>\n");
      out.write("            </p>\n");
      out.write("        \n");
      out.write("            <img src=\"WEB-INF/NochKeinFoodlover.PNG\" height=\"auto\" width=\"25%\" >\n");
      out.write("        \n");
      out.write("            <p>\n");
      out.write("                <a href=\"register.jsp\"><button>Jetzt Registrieren</button></a>\n");
      out.write("            </p>\n");
      out.write("        \n");
      out.write("            <p>\n");
      out.write("            <a href=\"überuns.jsp\">Oder direkt zu den Besten Restaurants der Stadt?</a>\n");
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
