<%@page import="java.sql.ResultSet"%>
<%@page import="dbpackgl.DBManagergl"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Geolocation </title>
         <link href="css/bootstrap.css" rel="stylesheet"/>
        <script src="js/bootstrap.bundle.js"></script>
    </head>
    <body>
          
        <div class ="location-container" >
            <h1 class="title" >Geolocation </h1>
            <marquee  behavior="alternate" direction="left" scrollamount="5"><p class="press-btn" >Press <span style="color: brown">Get Location</span>  Button to get your current location</p></marquee>
            <button id="hu" onclick="getLocation()">Get Location</button>
            <p id="demo"></p>
        </div>
       

        <script language="javascript" type="text/javascript">
            var latitutde, longitude;
            function getLocation() {
//                    alert("hi");
                if (navigator.geolocation) {
                    navigator.geolocation.getCurrentPosition(showPosition);
                } else {
                    document.getElementById("demo").innerHTML = "Geolocation is not supported by this browser.";
                }
            }
            function showPosition(position) {
                var latitude = position.coords.latitude;
                var longitude = position.coords.longitude;
                alert("Latitude is =" + latitude + "\nLongitude is=" + longitude);
//                alert(longitude);

//                alert("hi");
                document.getElementById("demo").innerHTML = "Latitude: " + latitude + "<br>Longitude: " + longitude;
//                    window.location.replace("controller01.jsp?long=" + longitude,"controller01.jsp?lat="+latitude);
//                     window.location.replace("controller01.jsp?lat=" + latitude);
//                alert("hi");
                window.location.replace("controller01.jsp?long=" + longitude + "&lat=" + latitude);
//                alert("hi");

            }





        </script>
        <div class="container-fluid">
          
            <div class="row mt-2" >
         <h1 style="text-align: center;color: blue;">GeoLocation</h1>
         
        <table class="table table-bordered" style="width: 50%;margin: auto; background: white;">
            <tr>
                <th>id</th>
                <th>Latitude</th>
                <th>Longitude</th>
                 <th>Delete</th>
            </tr>
            <%  DBManagergl dm = new DBManagergl();
                ResultSet rs = dm.select("select * from locations");
                while (rs.next()) {

            %>
            <tr>
                <td><%=rs.getInt("id")%></td>
                <td><%=rs.getString("latitude")%></td>
                <td><%=rs.getString("longitude")%></td>
                <td>
                    <a href="deletegeo.jsp?id=<%=rs.getInt("id")%>">
                        <button class="btn btn-success">Delete</button>
                        
                    </a>
                </td>

            </tr>

            <% }%>


        </table>
            </div>
            </div>
       
        <style>
            body{
                background-color: cyan
            }
            #hu{
                color:brown;
                font-size: 30px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                /*background-color: blueviolet;*/
                border-radius: 50px;
            }
            .location-container {
                text-align: center;
                height: 500px;
                width: 85%;
                margin-left: 140px;
                margin-top: 50px;
                padding: 40px 100px;
                background-color: #f0f0f0;
                font-weight: bold;
                border: 2px solid #ccc;
                border-radius: 5px;
                /*box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);*/
            }
            .title{
                /*border: 2px solid red;*/
                font-size:  85px;
                color: blue;
            }
            .press-btn{
                font-size:  40px;
            }
            #demo{
                font-size: 30px;
            }
            button:hover{
                color: greenyellow;
                background: black;
            }
            .location-container{
                transform: translate(0px);
                transition: 1.1s all;
            }
            .location-container:hover{
                box-shadow: 6px 6px 4px 10px black;
            }
        </style>
    </body>
</html>