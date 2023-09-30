   <%@page import="dbpackgl.DBManagergl"%>
<%

//                out.print("<script>alert('checking purpose')</script>");
                String str1 = request.getParameter("lat");
                String str2 = request.getParameter("long");
//                 out.print("<script>alert('Press OK  to Store Latitude and Longitude in the Database');</script>");
                DBManagergl gl = new DBManagergl();
                String query = "insert into locations(latitude,longitude) values('" + str1 + "','" + str2 + "')";
                boolean res = gl.insertUpdateDelete(query);
                if (res == true) {
                    
                    out.print("<script>alert('stored in db');window.location.href='index01.jsp';</script>");
                } else {
                    out.print("<script>alert('not stored in db');window.location.href='index01.jsp';</script>");
                }

            %>