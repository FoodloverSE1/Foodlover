package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kontakt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>FOODLOVER - KONTAKT</title>\n");
      out.write("        <meta name=\"description\" content=\"Ein interaktiver Wegweiser für die ersten Schritte mit Brackets.\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"main.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("       <body>\n");
      out.write("       <img src=\"FoodLover.logo.png\" alt=\"Logo\" >\n");
      out.write("      \n");
      out.write("       <div align=\"left\"></div>    \n");
      out.write("       <p>  <input type=\"button\" name=\"Home\" value=\"Home\" onClick=\"open.window()\">\n");
      out.write("            <input type=\"button\" name=\"Restaurants\" value=\"Restaurants\" onClick=\"open.window()\">\n");
      out.write("            <input type=\"button\" name=\"Kontakt\" value=\"Kontakt\" onClick=\"open.window()\">\n");
      out.write("       </p>\n");
      out.write("    <p> <b>Adresse</b></p>\n");
      out.write("    <p> Lothstraße 64</p>\n");
      out.write("    <p> 80335 München</p>\n");
      out.write("           \n");
      out.write("    <p> <b>Telefonnummer</b></p>\n");
      out.write("    <p> 089/1234</p>\n");
      out.write("    <p> <b>E-Mail</b></p>\n");
      out.write("    <p>FoodLover@hm.edu</p>\n");
      out.write("<p><b><em>Schreib uns</em></b></p>\n");
      out.write("  <p>\n");
      out.write("            <label for=\"Email Adresse\"> Email Adresse:\n");
      out.write("            <input id=\"Email Adresse\" type=\"email\" required />\n");
      out.write("            </label>  \n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("            <label for=\"Name\"> Name:\n");
      out.write("            <input id=\"Name\" type=\"Name\" required />\n");
      out.write("            </label>\n");
      out.write("           </p>\n");
      out.write("           <p>\n");
      out.write("            <label for=\"Nachricht\"> Nachricht:\n");
      out.write("            <input id=\"Nachricht\" type=\"Nachricht\" required />\n");
      out.write("            </label>\n");
      out.write("           </p>\n");
      out.write("            <p>\n");
      out.write("                <a href=\"Abschicken.html\"><button>Abschicken</button></a>\n");
      out.write("            </p>\n");
      out.write("        ");
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
