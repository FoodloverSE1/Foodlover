package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>FOODLOVER - REGISTRIERUNG</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img src=\"WEB-INF/FoodLoverlogo.PNG\" width=\"231\" height=\"72\" alt=\"FoodLover.logo\"/>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <h2><em>Noch kein Foodlover?</em></h2>\n");
      out.write("        <h4>Jetzt schnell und einfach loslegen! </h4>\n");
      out.write("            Email: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            &nbsp&nbsp\n");
      out.write("            Name: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            <p></p>\n");
      out.write("            Passwort: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            &nbsp&nbsp\n");
      out.write("            Vorname: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            <p></p>\n");
      out.write("            Passwort wiederholen: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            </p> \n");
      out.write("            <input type=\"submit\" value=\"Jetzt registrieren\" name=\"hallo\" />\n");
      out.write("        <h2><em>FoodLove verbreiten?</em></h2> \n");
      out.write("            <p></p>\n");
      out.write("    \n");
      out.write("Restaurantname: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            &nbsp&nbsp\n");
      out.write("    \n");
      out.write("    \n");
      out.write("Küchenart: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            &nbsp&nbsp\n");
      out.write("            <p></p>\n");
      out.write("    \n");
      out.write("Strasse: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            &nbsp&nbsp\n");
      out.write("            \n");
      out.write("Ort: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            &nbsp&nbsp\n");
      out.write("            <p></p>\n");
      out.write("    \n");
      out.write("PLZ: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            &nbsp&nbsp\n");
      out.write("        \n");
      out.write("    \n");
      out.write("Telefonnummer: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            &nbsp&nbsp\n");
      out.write("            <p></p>\n");
      out.write("    \n");
      out.write("Öffnungszeiten: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            &nbsp&nbsp\n");
      out.write("        \n");
      out.write("    \n");
      out.write("Website: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            &nbsp&nbsp\n");
      out.write("            <p></p>\n");
      out.write("    \n");
      out.write("Email: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            \n");
      out.write("Passwort: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            &nbsp&nbsp\n");
      out.write("            <p></p>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("Passwort wiederholen: <input type=\"text\" name=\"Name:\" value=\"\" size=\"30\" />\n");
      out.write("            </p> \n");
      out.write("            <input type=\"submit\" value=\"Jetzt registrieren\" name=\"hallo\" />\n");
      out.write("            \n");
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
