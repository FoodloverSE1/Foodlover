package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("            <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\">\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("\t\t<title>Registrier dich jetzt!</title>\n");
      out.write("\t\t<meta name=\"description\" content=\"Fullscreen Layout with Page Transitions\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"fullscreen layout, boxes, responsive, page transitions, css transitions, jquery, portfolio, template\" />\n");
      out.write("\t\t<meta name=\"author\" content=\"Codrops\" />\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"https://tympanus.net/Development/favicon.ico\">\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"container\">\t\n");
      out.write("                    <div align =\"center\"\n");
      out.write("                    <h2> Registrier dich schnell und einfach!</h2>\n");
      out.write("\t\t\t<div id=\"bl-main\" class=\"bl-main\">\n");
      out.write("\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t<div class=\"bl-box\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"bl-icon bl-icon-about\">Kontakt</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"bl-content\">\n");
      out.write("\t\t\t\t\t\t<h2>About this layout</h2>\n");
      out.write("\t\t\t\t\t\t<p>This responsive layout is based on an initial grid of four boxes. Once a box is clicked, it gets resized to fullscreen and the other boxes scale down and fade out. In the work section we experiment with another transition which is to show a panel by making it appear from the bottom while scaling the current one down. To see it in action, open the work section and click on one of the portfolio items and navigate through them.</p>\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"https://tympanus.net/Development/ResponsiveMultiLevelMenu/\"><strong>&laquo; Previous Demo</strong></a> |\n");
      out.write("\t\t\t\t\t\t\t<a href=\"https://tympanus.net/codrops/?p=14783\"><strong>Back to the Codrops Article</strong></a>\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span class=\"bl-icon bl-icon-close\"></span>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t\t<section id=\"bl-work-section\">\n");
      out.write("\t\t\t\t\t<div class=\"bl-box\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"bl-icon bl-icon-works\">Works</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"bl-content\">\n");
      out.write("\t\t\t\t\t\t<h2>My Works</h2>\n");
      out.write("\t\t\t\t\t\t<p>Mung bean maize dandelion sea lettuce catsear bunya nuts ricebean tatsoi caulie horseradish pea.</p>\n");
      out.write("\t\t\t\t\t\t<ul id=\"bl-work-items\">\n");
      out.write("\t\t\t\t\t\t\t<li data-panel=\"panel-1\"><a href=\"#\"><img src=\"images/1.jpg\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li data-panel=\"panel-2\"><a href=\"#\"><img src=\"images/2.jpg\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li data-panel=\"panel-3\"><a href=\"#\"><img src=\"images/3.jpg\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li data-panel=\"panel-4\"><a href=\"#\"><img src=\"images/4.jpg\" /></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<p>Illustrations by <a href=\"http://dribbble.com/isaac317/click\">Isaac Montemayor</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span class=\"bl-icon bl-icon-close\"></span>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t<div class=\"bl-box\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"bl-icon bl-icon-blog\">Blog</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"bl-content\">\n");
      out.write("\t\t\t\t\t\t<h2>My Musings</h2>\n");
      out.write("\t\t\t\t\t\t<article>\n");
      out.write("\t\t\t\t\t\t\t<h3>Being a Freelance Designer</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Stumptown helvetica cardigan, odd future seitan tattooed flannel. Kale chips direct trade cray beard. 8-bit etsy butcher post-ironic blog lo-fi mcsweeney's, sustainable pickled umami flexitarian DIY ethical plaid trust fund. Wolf cred organic, terry richardson aesthetic four loko occupy vegan chillwave readymade deep... <a href=\"#\">Read more</a></p>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t<article>\n");
      out.write("\t\t\t\t\t\t\t<h3>Working with Photoshop</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Cosby sweater odd future gluten-free actually dreamcatcher. Fixie cray vice sriracha disrupt, lo-fi pitchfork mcsweeney's swag YOLO meh chambray etsy. Keytar sriracha fanny pack church-key hashtag vice blog. 3 wolf moon VHS helvetica, raw denim deep v shoreditch seitan twee... <a href=\"#\">Read more</a></p>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t<article>\n");
      out.write("\t\t\t\t\t\t\t<h3>Making use of Icon Fonts</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Locavore irony gastropub chillwave, butcher meggings flexitarian pinterest master cleanse godard. Intelligentsia pop-up neutra, williamsburg gastropub godard pinterest swag deep v umami lomo. Butcher next level 90's wolf bushwick, narwhal photo booth YOLO kale chips whatever small batch. Meh viral ethical hella cardigan portland, street art mlkshk meggings mixtape kale chips cliche messenger bag pitchfork... <a href=\"#\">Read more</a></p>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t<article>\n");
      out.write("\t\t\t\t\t\t\t<h3>Being a Freelance Designer</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Stumptown helvetica cardigan, odd future seitan tattooed flannel. Kale chips direct trade cray beard. 8-bit etsy butcher post-ironic blog lo-fi mcsweeney's, sustainable pickled umami flexitarian DIY ethical plaid trust fund. Wolf cred organic, terry richardson aesthetic four loko occupy vegan chillwave readymade deep... <a href=\"#\">Read more</a></p>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t<article>\n");
      out.write("\t\t\t\t\t\t\t<h3>Working with Photoshop</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Cosby sweater odd future gluten-free actually dreamcatcher. Fixie cray vice sriracha disrupt, lo-fi pitchfork mcsweeney's swag YOLO meh chambray etsy. Keytar sriracha fanny pack church-key hashtag vice blog. 3 wolf moon VHS helvetica, raw denim deep v shoreditch seitan twee... <a href=\"#\">Read more</a></p>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t<article>\n");
      out.write("\t\t\t\t\t\t\t<h3>Making use of Icon Fonts</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Locavore irony gastropub chillwave, butcher meggings flexitarian pinterest master cleanse godard. Intelligentsia pop-up neutra, williamsburg gastropub godard pinterest swag deep v umami lomo. Butcher next level 90's wolf bushwick, narwhal photo booth YOLO kale chips whatever small batch. Meh viral ethical hella cardigan portland, street art mlkshk meggings mixtape kale chips cliche messenger bag pitchfork... <a href=\"#\">Read more</a></p>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span class=\"bl-icon bl-icon-close\"></span>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t<div class=\"bl-box\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"bl-icon bl-icon-contact\">Contact</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"bl-content\">\n");
      out.write("\t\t\t\t\t\t<h2>Get in touch</h2>\n");
      out.write("\t\t\t\t\t\t<p>Pinterest semiotics single-origin coffee craft beer thundercats irony, tumblr bushwick intelligentsia pickled. Narwhal mustache godard master cleanse street art, occupy ugh selfies put a bird on it cray salvia four loko gluten-free shoreditch. Occupy american apparel freegan cliche. Mustache trust fund 8-bit jean shorts mumblecore thundercats. Pour-over small batch forage cray, banjo post-ironic flannel keffiyeh cred ethnic semiotics next level tousled fashion axe. Sustainable cardigan keytar fap bushwick bespoke.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span class=\"bl-icon bl-icon-close\"></span>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t\t<!-- Panel items for the works -->\n");
      out.write("\t\t\t\t<div class=\"bl-panel-items\" id=\"bl-panel-work-items\">\n");
      out.write("\t\t\t\t\t<div data-panel=\"panel-1\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/1.jpg\" />\n");
      out.write("\t\t\t\t\t\t\t<h3>Fixie bespoke</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Iphone artisan direct trade ethical Austin. Fixie bespoke banh mi ugh, deep v vinyl hashtag. Tumblr gentrify keffiyeh pop-up iphone twee biodiesel. Occupy american apparel freegan cliche. Mustache trust fund 8-bit jean shorts mumblecore thundercats. Pour-over small batch forage cray, banjo post-ironic flannel keffiyeh cred ethnic semiotics next level tousled fashion axe. Sustainable cardigan keytar fap bushwick bespoke.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div data-panel=\"panel-2\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/2.jpg\" />\n");
      out.write("\t\t\t\t\t\t\t<h3>Chillwave mustache</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Squid vinyl scenester literally pug, hashtag tofu try-hard typewriter polaroid craft beer mlkshk cardigan photo booth PBR. Chillwave 90's gentrify american apparel carles disrupt. Pinterest semiotics single-origin coffee craft beer thundercats irony, tumblr bushwick intelligentsia pickled. Narwhal mustache godard master cleanse street art, occupy ugh selfies put a bird on it cray salvia four loko gluten-free shoreditch.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div data-panel=\"panel-3\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/3.jpg\" />\n");
      out.write("\t\t\t\t\t\t\t<h3>Austin hella</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Ethical cray wayfarers leggings vice, seitan banksy small batch ethnic master cleanse. Pug chillwave etsy, scenester meh occupy blue bottle tousled blog tonx pinterest selvage mixtape swag cosby sweater. Synth tousled direct trade, hella Austin craft beer ugh chambray.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div data-panel=\"panel-4\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/4.jpg\" />\n");
      out.write("\t\t\t\t\t\t\t<h3>Brooklyn dreamcatcher</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Fashion axe 90's pug fap. Blog wayfarers brooklyn dreamcatcher, bicycle rights retro YOLO. Wes anderson lomo 90's food truck 3 wolf moon, twee jean shorts. Iphone small batch twee wolf yr before they sold out. Brooklyn echo park cred, portland pug selvage flannel seitan tousled mcsweeney's.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t\t<span class=\"bl-next-work\">&gt; Next Project</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"bl-icon bl-icon-close\"></span>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!-- /container -->\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/boxlayout.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t$(function() {\n");
      out.write("\t\t\t\tBoxlayout.init();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<script src=\"https://tympanus.net/codrops/adpacks/csscustom.js\"></script> \n");
      out.write("<script src=\"https://tympanus.net/codrops/wp-content/plugins/oiopub-direct/js.php?type=banner&align=center&zone=1\"></script>\n");
      out.write("\t</body>\n");
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
