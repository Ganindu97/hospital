<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "test";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<%-- 
    Document   : appointment
    Created on : Mar 20, 2021, 8:29:53 PM
    Author     : Ganindu Samarajeewa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Appointment Page</title>
         <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title> Hospital Management System </title>

    <link rel="shortcut icon" href="images/fav.jpg">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/fontawsom-all.min.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    
    <style>
            .dropbtn {
                background-color: #4CAF50;
                color: white;
                padding: 16px;
                font-size: 16px;
                border: none;
                     }

            .dropdown {
                position: relative;
                display: inline-block;
                      }

            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f1f1f1;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
                        }

            .dropdown-content a {
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
                }

            .dropdown-content a:hover {background-color: #ddd;}

            .dropdown:hover .dropdown-content {display: block;}

            .dropdown:hover .dropbtn {background-color: #3e8e41;}
        </style>
    </head>
    
    <body>
        <header>
        <div class="header-top">
            <div class="container">
                <div class="row">
                    <div class="col-lg-7 col-md-12 left-item">
                        <ul>
                            <li><i class="fas fa-envelope-square"></i> nawalokahospitals@gmail.com</li>
                            <li><i class="fas fa-phone-square"></i> +94112 34 54 45</li>
                        </ul>
                    </div>
                    <div class="col-lg-5 d-none d-lg-block right-item">
                        <ul>
                            <li><a><i class="fab fa-github"></i></a></li>
                            <li><a><i class="fab fa-google-plus-g"></i></a></li>
                            <li> <a><i class="fab fa-pinterest-p"></i></a></li>
                            <li><a><i class="fab fa-twitter"></i></a></li>
                            <li> <a><i class="fab fa-facebook-f"></i></a></li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
        <div id="nav-head" class="header-nav">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-12 nav-img">
                        <img src="images/logo.jpg" alt="">
                       <a data-toggle="collapse" data-target="#menu" href="#menu" ><i class="fas d-block d-md-none small-menu fa-bars"></i></a>
                    </div>
                    <div id="menu" class="col-md-10 d-none d-md-block nav-item">
                        <ul>
                            <li><a href="adminhome.jsp">HOME</a></li>
                            
                            <div class="dropdown">
                                <li> <a href=""> DOCTOR </a></li><br><br><br><br>
                                <div class="dropdown-content">
                                    <a href=""> ADD DOCTOR </a>
				    <a href="#"> DOCTOR LIST </a>
				</div>
			   </div>
                            
                            <div class="dropdown">
                                <li> <a href=""> PATIENT </a></li><br><br><br><br>
                                <div class="dropdown-content">
                                    <a href=""> ADD PATIENT </a>
				    <a href="#"> PATIENT LIST </a>
				</div>
			   </div>
                            
                            <div class="dropdown">
                                <li> <a href=""> APPOINTMENT </a></li><br><br><br><br>
                                <div class="dropdown-content">
                                    <a href="appointment.jsp"> ADD APPOINTMENT </a>
				    <a href="applist.jsp"> APPOINTMENT LIST </a>
				</div>
			   </div>
                            
                            <li><a href="#">RECEPTIONIST</a></li>
                           
                            
                           <div class="dropdown">
                               <li> <a href="index.jsp">LOGOUT</a></li><br><br><br><br>
                                
			   </div>
  
                        </ul>
                    </div>
                </div>

            </div>
        </div>

    </header>
        <br><br><br><br>

   
    <!-- ################# Our Team Starts Here#######################--->

      <!--  ************************* Page Title Starts Here ************************** -->
               <div class="page-nav no-margin row">
                   <div class="container">
                       <div class="row">
                           <h2>Appointment </h2>
                           
                           <table class="table" border="1">
                               <thead>
                                   <tr>
                                    <th>Appointment No.</th>
                                    <th>Appointment Date</th>
                                    <th>Appointment Time</th>
                                    <th>Doctor ID</th>
                                    <th>Patient ID</th>
                                    <th>Patient Age</th>
                                    <th>Address(area)</th>
                                    <th>Address(city)</th>
                                    <th>Address(state)</th>
                                   </tr>
                               </thead>
                               <tbody>
                                
                              <%
                                try{
                                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/web", "root", "");;
                                statement=connection.createStatement();
                                String sql ="select * from appointments";
                                resultSet = statement.executeQuery(sql);
                                while(resultSet.next()){
                                %>
                                <tr>
                                <td><%=resultSet.getString("appno") %></td>
                                <td><%=resultSet.getString("bdate") %></td>
                                <td><%=resultSet.getString("btime") %></td>
                                <td><%=resultSet.getString("docid") %></td>
                                <td><%=resultSet.getString("patid") %></td>
                                <td><%=resultSet.getString("age") %></td>
                                <td><%=resultSet.getString("area") %></td>
                                <td><%=resultSet.getString("city") %></td>
                                <td><%=resultSet.getString("state") %></td>
                                </tr>
                                <%
                                }
                                connection.close();
                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                                %>
                               
                               
                               </tbody>
                           </table>
                           
                           
                           
                           
                       </div>
                   </div>
               </div>
       
         <!-- ######## Page  Title End ####### -->
    
  <div class="inner-layer">
          <div class="container">
            <div class="row no-margin">
                
                
            </div>
          </div>
    </div>
         
         <br>
  
    <!-- ################# Footer Starts Here#######################--->


   
    
    </body>
    
<script src="assets/js/jquery-3.2.1.min.js"></script>
<script src="assets/js/popper.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/plugins/scroll-fixed/jquery-scrolltofixed-min.js"></script>
<script src="assets/js/script.js"></script>
   
</html>
