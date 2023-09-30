
<%@page import="dbpackgl.DBManagergl"%>
<%  
    String id=request.getParameter("id");
    DBManagergl dm=new DBManagergl();
    String query="delete from locations where id='"+id+"'";
    if(dm.insertUpdateDelete(query)==true)
    {
         out.print("<script>alert('Geolocation is Deleted');window.location.href='index01.jsp';</script>"); 
    }
    else
    {
        out.print("<script>alert('Geolocation not is Deleted');window.location.href='index01.jsp';</script>");  
    }
    %>