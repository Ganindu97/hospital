<%-- 
    Document   : adminhome
    Created on : Mar 20, 2021, 8:38:12 PM
    Author     : Ganindu Samarajeewa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Admin's Home Page</title>
        
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
           <!-- ################# Header Starts Here#######################--->
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
                    
                </div>

            </div>
        </div>

    </header>


    <!-- ################# Slider Starts Here#######################--->

    <div class="slider-detail">

        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="images/slider/slider_1.jpg" alt="First slide">
                    <div class="carousel-caption d-none d-md-block">
                        <h2 class="animated bounceInDown">User Login</h2>
                        
                        <form action="login" method="post">
                        <div class="form-body">
                            <div class="row form-row">
                                <input type="text" placeholder="User ID" name="id" class="form-control" style="width:350px">
                            </div>
                             <div class="row form-row">
                                 <input type="password" placeholder="Password" name="password" class="form-control" style="width:350px">
                            </div>         
                             <div class="row form-row">
                             
                                 <input class="btn btn-success btn-appointment" type="submit" value="Login">
                                
                            </div>
                            <%  String m1="";
                                if(!(request.getParameter("msg")==null)){ 
                                    m1=request.getParameter("msg"); 
                                }
                                
                                
                                
                            %>
                            
                            <%   if(m1.equals("Password is incorrect")){ %>
                                    <h3><%= request.getParameter("msg") %></h3>
                               
                               <% } %>
                            
                            
                                

                        </div>
                        </form>
                    </div>
                </div>
                
                
                
                <div class="carousel-item">
                    <img class="d-block w-100" src="images/slider/slider_2.jpg" alt="Second slide">
                </div>
            </div>
            
        </div>


    </div>

    <!-- ################# Key Features Starts Here#######################--->

    <section class="key-features">
        <div class="container">
            <div class="inner-title">

                <h2>Our Key Features</h2>
                <p>Take a look at some of our key features</p>
            </div>

            <div class="row">
                <div class="col-md-4 col-sm-6">
                    <div class="single-key">
                        <i class="fas fa-hospital-alt"></i>
                        <h5>Newest Technologies</h5>
                       
                    </div>
                </div>

                <div class="col-md-4 col-sm-6">
                    <div class="single-key">
                        <i class="fas fa-user-md"></i>
                        <h5>Experianced Doctors</h5>
                        
                    </div>
                </div>

                <div class="col-md-4 col-sm-6">
                    <div class="single-key">
                        <i class="fas fa-briefcase-medical"></i>
                        <h5>High Customer Satisfaction</h5>
                        
                    </div>
                </div>

                <div class="col-md-4 col-sm-6">
                    
                </div>

                



                <div class="col-md-4 col-sm-6">
                    <div class="single-key">
                        <i class="far fa-thumbs-up"></i>
                        <h5>High Quality treatments</h5>
                       
                    </div>
                </div>
                <div class="col-md-4 col-sm-6">
                   
                </div>
            </div>






        </div>

    </section>

    <!-- ################# Doctors Message Starts Here#######################--->


    <div class="doctor-message">
        <div class="inner-lay">
            <div class="container">
                <div class="row">


                    <div class="col-md-6 col-sm-12 doc-img">
                        <img  src="images/doctt.png" alt="">
                    </div>
                  
                </div>
            </div>

        </div>

    </div>

    


  

    <footer class="footer">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-sm-12">
                    <h2>About Us</h2>
                    <p>
                        The entry of Nawaloka Hospitals into the state dominated healthcare sector in 1985, saw the private health care system take root in Sri Lanka. The launch of the hospital and the overwhelming response it received from the people demonstrated a long felt need for superior healthcare in a pleasant environment.

As Sri Lanka’s first premier multi-specialty hospital, Nawaloka was set up to mirror reputed hospitals in the region which offered advanced medical technology and expert medical care, thus eliminating the need for people to travel out of Sri Lanka for specialized medical treatment.

The Hospital was a pioneering initiative, established under the Chairmanship of Late Deshamanya H. K. Dharmadasa, to be a centre of excellence in high technology diagnostic and curative facilities. Driven by the Vision to be the Hospital of Tomorrow, the medical institution has come to be known as a centre of excellence and a preferred healthcare institution in the country.
                    </p>
                    
                </div>
              
                <div class="col-md-4 col-sm-12 map-img">
                    <h2>Contact Us</h2>
                    <address class="md-margin-bottom-40">
                        Nawaloka Hospitals PLC, <br>
                        Colombo 2, <br>
                        Sri Lanka. <br>
                        Phone: +94 (0) 115577111 <br>
                        Email: <a href="nawaloka@slt.lk" class="nawaloka@slt.lk"></a><br>
                        
                    </address>

                </div>
            </div>
        </div>
        

    </footer>
    <div class="copy">
            <div class="container">
                <a href="https://www.smarteyeapps.com/">2015 &copy; All Rights Reserved | Designed and Developed by Smarteyeapps</a>
                
                <span>
                <a><i class="fab fa-github"></i></a>
                <a><i class="fab fa-google-plus-g"></i></a>
                <a><i class="fab fa-pinterest-p"></i></a>
                <a><i class="fab fa-twitter"></i></a>
                <a><i class="fab fa-facebook-f"></i></a>
        </span>
            </div>

        </div>
    </body>
    
    <script src="assets/js/jquery-3.2.1.min.js"></script>
<script src="assets/js/popper.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/plugins/scroll-fixed/jquery-scrolltofixed-min.js"></script>
<script src="assets/js/script.js"></script>

</html>
