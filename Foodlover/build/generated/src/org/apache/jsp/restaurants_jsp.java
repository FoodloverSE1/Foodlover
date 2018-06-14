package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class restaurants_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"de\">\n");
      out.write("    \n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("        <title>Restaurants</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("      <th> <img src=\"logo.PNG\" alt=\"logo.PNG\"/></th> \n");
      out.write("      \n");
      out.write("       <div align=\"left\"></div>    \n");
      out.write("       <p>  <input type=\"button\" name=\"Home\" value=\"Home\">\n");
      out.write("           <input type=\"button\" name=\"Restaurants\" value=\"Restaurants\">\n");
      out.write("           <input type=\"button\" name=\"Kontakt\" value=\"Kontakt\">\n");
      out.write("       </p>\n");
      out.write("    \n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\"> \n");
      out.write("        <h1>Küche auswählen</h1>\n");
      out.write("        <h2>Herzlich Willkommen</h2>\n");
      out.write("        <p> Du hast dich für Food Lover entschieden und damit eine gute Wahl getroffen. Entdecke jetzt dein zukünftiges     Lieblings- Restaurants in München.\n");
      out.write("        </p>\n");
      out.write("    \n");
      out.write("    <form>\n");
      out.write("        \n");
      out.write("        Auf was hast du Lust?<br>\n");
      out.write("        <br>\n");
      out.write("            &#160&#160&#160&#160&#160&#160&#160&#160&#160&#160\n");
      out.write("        <input type=\"checkbox\" name=\"asiatisch\" value=\"asiatisch\" tabindex=\"1\">Asiatisch \n");
      out.write("        <br><br>   \n");
      out.write("            &#160&#160&#160&#160&#160&#160&#160&#160&#160&#160\n");
      out.write("        <input type=\"checkbox\" name=\"indisch\" value=\"indisch\" tabindex=\"1\">Indisch\n");
      out.write("        <br><br>\n");
      out.write("            &#160&#160&#160&#160&#160&#160&#160&#160&#160&#160\n");
      out.write("        <input type=\"checkbox\" name=\"italienisch\" value=\"italienisch\" tabindex=\"1\">Italienisch\n");
      out.write("        <br><br>\n");
      out.write("            &#160&#160&#160&#160&#160&#160&#160&#160&#160&#160\n");
      out.write("        <input type=\"checkbox\" name=\"türkisch\" value=\"türkisch\" tabindex=\"1\">Türkisch\n");
      out.write("        <br><br>\n");
      out.write("      \n");
      out.write("            &#160&#160&#160&#160&#160&#160&#160&#160&#160&#160\n");
      out.write("        <input type=\"checkbox\" name=\"persisch\" value=\"persisch\" tabindex=\"1\">Persisch\n");
      out.write("          \n");
      out.write("    \n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    <div align=\"left\"></div>\n");
      out.write("    \n");
      out.write("    <a href= class=button> <br><br> \n");
      out.write("     \n");
      out.write("    <button>Los geht`s</button>\n");
      out.write("\n");
      out.write("    </a>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
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
