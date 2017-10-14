package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HeaderVote_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write(".headerf ul{\n");
      out.write("    list-style-type: none;\n");
      out.write("    left: 160px;\n");
      out.write("    top: 0;\n");
      out.write("    right: 160px;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: visible;\n");
      out.write("     background-color:#ffcc99;\n");
      out.write("    position: fixed;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".headerf li{\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".headerf li a{\n");
      out.write("    display: block;\n");
      out.write("    color: black;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 24px 26px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"headerf\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"\" style=\"font-size:40px;color:black;weight:bold\">Voter Portal</a></li>\n");
      out.write("                <li>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n");
      out.write("                <li><a href=\"\" style=\"font-size:20px;color:black;weight:bold\">Home</a></li>\n");
      out.write("                <li>&nbsp;&nbsp;&nbsp;&nbsp;</li>\n");
      out.write("                <li><a href=\"\" style=\"font-size:20px;color:black;weight:bold\">About Us</a></li>\n");
      out.write("                <li>&nbsp;&nbsp;&nbsp;&nbsp;</li>\n");
      out.write("                <li><a href=\"\" style=\"font-size:20px;color:black;weight:bold\">Contact Us</a></li>\n");
      out.write("            </ul>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
