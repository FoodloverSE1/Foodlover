package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class restaurantprofil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("    <div align=\"center\">\n");
      out.write("    <head>\n");
      out.write("        <title>Restaurant Profil</title> \n");
      out.write("    </head>\n");
      out.write("    </div>\n");
      out.write("  <body>\n");
      out.write("      <th> <img src=\"logo.PNG\" alt=\"logo.PNG\"/></th>\n");
      out.write("    <link href=\"Content/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"Content/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("   \n");
      out.write("      \n");
      out.write("<div align=\"left\"    \n");
      out.write("      <p>  <a href=\"überuns.jsp\"><button>Home</button></a>\n");
      out.write("           <a href=\"restaurants.jsp\"><button>Restaurants</button></a>\n");
      out.write("           <a href=\"kontakt.jsp\"><button>Kontakt</button></a>\n");
      out.write("      </p>\n");
      out.write("      <p> \n");
      out.write("          </div>\n");
      out.write("          <font size=\"12\" face=\"Savoye LET\">Beispiel:Restaurantname</font>        \n");
      out.write("      </p>\n");
      out.write("    <div align=left>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("     <div align=left>\n");
      out.write("        <p>\n");
      out.write("        <em>Restaurant-Art: Italienisch      \n");
      out.write("            Adresse: Lothstr.34, München       Tel.089/1234    \n");
      out.write("            E-mail: Bestes.Essen@gmx.de</em> \n");
      out.write("         </p>\n");
      out.write("        <p>   \n");
      out.write("        \n");
      out.write("        </p>    \n");
      out.write("        \n");
      out.write("    <div align=left>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <span class='review-holder'>\n");
      out.write("  <span class='review'>\n");
      out.write("    <span data-sescription=\"don't like it\"></span>\n");
      out.write("    <span data-description=\"wasn't great\"></span>\n");
      out.write("    <span data-description=\"it's ok\"></span>\n");
      out.write("    <span data-description=\"it's good\"></span>\n");
      out.write("    <span data-description=\"it's great\"></span>\n");
      out.write("  </span>\n");
      out.write("</span>\n");
      out.write("      <P> <input type=\"button\" name=\"Bewertung speichern\" onClick=\"safe\"</P>\n");
      out.write("\n");
      out.write("  </body>\n");
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
