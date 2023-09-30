package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbpackgl.DBManagergl;

public final class index01_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> Geolocation </title>\n");
      out.write("         <link href=\"css/bootstrap.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"js/bootstrap.bundle.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          \n");
      out.write("        <div class =\"location-container\" >\n");
      out.write("            <h1 class=\"title\" >Geolocation </h1>\n");
      out.write("            <marquee  behavior=\"alternate\" direction=\"left\" scrollamount=\"5\"><p class=\"press-btn\" >Press <span style=\"color: brown\">Get Location</span>  Button to get your current location</p></marquee>\n");
      out.write("            <button id=\"hu\" onclick=\"getLocation()\">Get Location</button>\n");
      out.write("            <p id=\"demo\"></p>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("            var latitutde, longitude;\n");
      out.write("            function getLocation() {\n");
      out.write("//                    alert(\"hi\");\n");
      out.write("                if (navigator.geolocation) {\n");
      out.write("                    navigator.geolocation.getCurrentPosition(showPosition);\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById(\"demo\").innerHTML = \"Geolocation is not supported by this browser.\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function showPosition(position) {\n");
      out.write("                var latitude = position.coords.latitude;\n");
      out.write("                var longitude = position.coords.longitude;\n");
      out.write("                alert(\"Latitude is =\" + latitude + \"\\nLongitude is=\" + longitude);\n");
      out.write("//                alert(longitude);\n");
      out.write("\n");
      out.write("//                alert(\"hi\");\n");
      out.write("                document.getElementById(\"demo\").innerHTML = \"Latitude: \" + latitude + \"<br>Longitude: \" + longitude;\n");
      out.write("//                    window.location.replace(\"controller01.jsp?long=\" + longitude,\"controller01.jsp?lat=\"+latitude);\n");
      out.write("//                     window.location.replace(\"controller01.jsp?lat=\" + latitude);\n");
      out.write("//                alert(\"hi\");\n");
      out.write("                window.location.replace(\"controller01.jsp?long=\" + longitude + \"&lat=\" + latitude);\n");
      out.write("//                alert(\"hi\");\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          \n");
      out.write("            <div class=\"row mt-2\" >\n");
      out.write("         <h1 style=\"text-align: center;color: blue;\">GeoLocation</h1>\n");
      out.write("         \n");
      out.write("        <table class=\"table table-bordered\" style=\"width: 50%;margin: auto; background: white;\">\n");
      out.write("            <tr>\n");
      out.write("                <th>id</th>\n");
      out.write("                <th>Latitude</th>\n");
      out.write("                <th>Longitude</th>\n");
      out.write("                 <th>Delete</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
  DBManagergl dm = new DBManagergl();
                ResultSet rs = dm.select("select * from locations");
                while (rs.next()) {

            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getInt("id"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("latitude"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("longitude"));
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"deletegeo.jsp?id=");
      out.print(rs.getInt("id"));
      out.write("\">\n");
      out.write("                        <button class=\"btn btn-success\">Delete</button>\n");
      out.write("                        \n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("       \n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: cyan\n");
      out.write("            }\n");
      out.write("            #hu{\n");
      out.write("                color:brown;\n");
      out.write("                font-size: 30px;\n");
      out.write("                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("                /*background-color: blueviolet;*/\n");
      out.write("                border-radius: 50px;\n");
      out.write("            }\n");
      out.write("            .location-container {\n");
      out.write("                text-align: center;\n");
      out.write("                height: 500px;\n");
      out.write("                width: 85%;\n");
      out.write("                margin-left: 140px;\n");
      out.write("                margin-top: 50px;\n");
      out.write("                padding: 40px 100px;\n");
      out.write("                background-color: #f0f0f0;\n");
      out.write("                font-weight: bold;\n");
      out.write("                border: 2px solid #ccc;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                /*box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);*/\n");
      out.write("            }\n");
      out.write("            .title{\n");
      out.write("                /*border: 2px solid red;*/\n");
      out.write("                font-size:  85px;\n");
      out.write("                color: blue;\n");
      out.write("            }\n");
      out.write("            .press-btn{\n");
      out.write("                font-size:  40px;\n");
      out.write("            }\n");
      out.write("            #demo{\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            button:hover{\n");
      out.write("                color: greenyellow;\n");
      out.write("                background: black;\n");
      out.write("            }\n");
      out.write("            .location-container{\n");
      out.write("                transform: translate(0px);\n");
      out.write("                transition: 1.1s all;\n");
      out.write("            }\n");
      out.write("            .location-container:hover{\n");
      out.write("                box-shadow: 6px 6px 4px 10px black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
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
