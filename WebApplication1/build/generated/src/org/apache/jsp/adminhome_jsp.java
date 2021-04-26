package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Admin's Home Page</title>\n");
      out.write("        \n");
      out.write("         <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title> Hospital Management System </title>\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/fav.jpg\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fontawsom-all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("    \n");
      out.write("    \t<style>\n");
      out.write("            .dropbtn {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 16px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                border: none;\n");
      out.write("                     }\n");
      out.write("\n");
      out.write("            .dropdown {\n");
      out.write("                position: relative;\n");
      out.write("                display: inline-block;\n");
      out.write("                      }\n");
      out.write("\n");
      out.write("            .dropdown-content {\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                min-width: 160px;\n");
      out.write("                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("                z-index: 1;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("            .dropdown-content a {\n");
      out.write("                color: black;\n");
      out.write("                padding: 12px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            .dropdown-content a:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("            .dropdown:hover .dropdown-content {display: block;}\n");
      out.write("\n");
      out.write("            .dropdown:hover .dropbtn {background-color: #3e8e41;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("           <!-- ################# Header Starts Here#######################--->\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-7 col-md-12 left-item\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><i class=\"fas fa-envelope-square\"></i> nawalokahospitals@gmail.com</li>\n");
      out.write("                            <li><i class=\"fas fa-phone-square\"></i> +94112 34 54 45</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-5 d-none d-lg-block right-item\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a><i class=\"fab fa-github\"></i></a></li>\n");
      out.write("                            <li><a><i class=\"fab fa-google-plus-g\"></i></a></li>\n");
      out.write("                            <li> <a><i class=\"fab fa-pinterest-p\"></i></a></li>\n");
      out.write("                            <li><a><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("                            <li> <a><i class=\"fab fa-facebook-f\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"nav-head\" class=\"header-nav\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 col-sm-12 nav-img\">\n");
      out.write("                        <img src=\"images/logo.jpg\" alt=\"\">\n");
      out.write("                       <a data-toggle=\"collapse\" data-target=\"#menu\" href=\"#menu\" ><i class=\"fas d-block d-md-none small-menu fa-bars\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"menu\" class=\"col-md-10 d-none d-md-block nav-item\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"adminhome.jsp\">HOME</a></li>\n");
      out.write("                            \n");
      out.write("                            <div class=\"dropdown\">\n");
      out.write("                                <li> <a href=\"\"> DOCTOR </a></li><br><br><br><br>\n");
      out.write("                                <div class=\"dropdown-content\">\n");
      out.write("                                    <a href=\"doctor.jsp\"> ADD DOCTOR </a>\n");
      out.write("\t\t\t\t    <a href=\"#\"> DOCTOR LIST </a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t   </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"dropdown\">\n");
      out.write("                                <li> <a href=\"\"> PATIENT </a></li><br><br><br><br>\n");
      out.write("                                <div class=\"dropdown-content\">\n");
      out.write("                                    <a href=\"patient.jsp\"> ADD PATIENT </a>\n");
      out.write("\t\t\t\t    <a href=\"#\"> PATIENT LIST </a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t   </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"dropdown\">\n");
      out.write("                                <li> <a href=\"\"> APPOINTMENT </a></li><br><br><br><br>\n");
      out.write("                                <div class=\"dropdown-content\">\n");
      out.write("                                    <a href=\"appointment.jsp\"> ADD APPOINTMENT </a>\n");
      out.write("\t\t\t\t    <a href=\"#\"> APPOINTMENT LIST </a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t   </div>\n");
      out.write("                            \n");
      out.write("                            <li><a href=\"gallery.html\">RECEPTIONIST</a></li>\n");
      out.write("                            <li><a href=\"contact_us.html\">PHAMACIST</a></li>\n");
      out.write("                            \n");
      out.write("                           <div class=\"dropdown\">\n");
      out.write("                                <li><a href=\"\"> ADMIN </a></li><br><br><br><br>\n");
      out.write("                                <div class=\"dropdown-content\">\n");
      out.write("                                    <a href=\"adminmyprofile.jsp\"> MY PROFILE</a>\n");
      out.write("\t\t\t\t    <a href=\"adminchangepwd.jsp\"> CHANGE PASSWORD </a>\n");
      out.write("\t\t\t\t    <a href=\"#\"> LOG OUT </a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t   </div>\n");
      out.write("  \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- ################# Slider Starts Here#######################--->\n");
      out.write("\n");
      out.write("    <div class=\"slider-detail\">\n");
      out.write("\n");
      out.write("        <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img class=\"d-block w-100\" src=\"images/slider/slider_1.jpg\" alt=\"First slide\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h5 class=\"animated bounceInDown\">Best Free Hospital Template</h5>\n");
      out.write("                        <p class=\"animated bounceInLeft\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam justo neque,  <br>\n");
      out.write("                        aliquet sit amet elementum vel, vehicula eget eros. Vivamus arcu metus, mattis <br>\n");
      out.write("                         sed sagittis at, sagittis quis neque. Praesent.</p>\n");
      out.write("                         \n");
      out.write("                         <div class=\"row vbh\">\n");
      out.write("                             \n");
      out.write("                             <div class=\"btn btn-success animated bounceInUp\"> Book an Appointment </div>\n");
      out.write("                         </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-100\" src=\"images/slider/slider_3.jpg\" alt=\"Third slide\">\n");
      out.write("                     <div class=\"carousel-caption vdg-cur d-none d-md-block\">\n");
      out.write("                        <h5 class=\"animated bounceInDown\">Best Free Hospital Template</h5>\n");
      out.write("                        <p class=\"animated bounceInLeft\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam justo neque,  <br>\n");
      out.write("                        aliquet sit amet elementum vel, vehicula eget eros. Vivamus arcu metus, mattis <br>\n");
      out.write("                         sed sagittis at, sagittis quis neque. Praesent.</p>\n");
      out.write("                         \n");
      out.write("                         <div class=\"row vbh\">\n");
      out.write("                             \n");
      out.write("                             <div class=\"btn btn-success animated bounceInUp\"> Book an Appointment </div>\n");
      out.write("                         </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-100\" src=\"images/slider/slider_2.jpg\" alt=\"Second slide\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- ################# Key Features Starts Here#######################--->\n");
      out.write("\n");
      out.write("    <section class=\"key-features\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"inner-title\">\n");
      out.write("\n");
      out.write("                <h2>Our Key Features</h2>\n");
      out.write("                <p>Take a look at some of our key features</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                    <div class=\"single-key\">\n");
      out.write("                        <i class=\"fas fa-hospital-alt\"></i>\n");
      out.write("                        <h5>Newest Technologies</h5>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut erat nec leo lobortis blandit.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                    <div class=\"single-key\">\n");
      out.write("                        <i class=\"fas fa-user-md\"></i>\n");
      out.write("                        <h5>Experianced Doctors</h5>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut erat nec leo lobortis blandit.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                    <div class=\"single-key\">\n");
      out.write("                        <i class=\"fas fa-briefcase-medical\"></i>\n");
      out.write("                        <h5>High Customer Satisfaction</h5>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut erat nec leo lobortis blandit.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                    <div class=\"single-key\">\n");
      out.write("                        <i class=\"fas fa-capsules\"></i>\n");
      out.write("                        <h5>Pharma Pipeline</h5>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut erat nec leo lobortis blandit.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                    <div class=\"single-key\">\n");
      out.write("                        <i class=\"fas fa-prescription-bottle-alt\"></i>\n");
      out.write("                        <h5>Pharma Team</h5>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut erat nec leo lobortis blandit.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                    <div class=\"single-key\">\n");
      out.write("                        <i class=\"far fa-thumbs-up\"></i>\n");
      out.write("                        <h5>High Quality treatments</h5>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut erat nec leo lobortis blandit.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- ################# Doctors Message Starts Here#######################--->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"doctor-message\">\n");
      out.write("        <div class=\"inner-lay\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-6 col-sm-12 doc-img\">\n");
      out.write("                        <img  src=\"images/doctt.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 col-sm-12 doc-det\">\n");
      out.write("                        <h2>Hello, I’m Doctor Sanjay</h2>\n");
      out.write("                        <span>Expert Clinical Psychologist in Manhattan</span>\n");
      out.write("\n");
      out.write("                        <p>Lorem Ipsum is simply text of the Lorem Ipsum is simply my text of the printing and Ipsum is simply text of the Ipsum is simply text of thetypesetting Ipsum is simply text of the stry simply dummy text of the printing and typesetting industry. Lorem Ipsum is simply text of the Lorem Ipsum is simply my text of </p>\n");
      out.write("\n");
      out.write("                        <h4>Call me on : +123 98 8887</h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- ################# Our Team Starts Here#######################--->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"our-team\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"inner-title\">\n");
      out.write("                <h2>Meet our Team</h2>\n");
      out.write("                <p>Take a look at our innovative and experiance team</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row team-member\">\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"user-card\">\n");
      out.write("                        <div class=\"userar\">\n");
      out.write("                            <img class=\"teammempic\" alt=\"\" src=\"images/team/team-memb1.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"detfs\">\n");
      out.write("                            <p>Mark Frances<i> - MD</i></p>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-facebook-f fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-twitter fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-google-plus-g fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-github fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-pinterest-p fa-lg\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <br>\n");
      out.write("                            <p >3+ Years of Experiance in PHP with good innovative Ideas</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"user-card\">\n");
      out.write("                        <div class=\"userar\">\n");
      out.write("                            <img class=\"teammempic\" alt=\"\" src=\"images/team/team-memb2.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"detfs\">\n");
      out.write("                            <p>Mark Frances<i> - MD</i></p>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-facebook-f fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-twitter fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-google-plus-g fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-github fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-pinterest-p fa-lg\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                             <br>\n");
      out.write("                            <p >3+ Years of Experiance in PHP with good innovative Ideas</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"user-card\">\n");
      out.write("                        <div class=\"userar\">\n");
      out.write("                            <img class=\"teammempic\" alt=\"\" src=\"images/team/team-memb3.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"detfs\">\n");
      out.write("                            <p>Mark Frances<i> - MD</i></p>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-facebook-f fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-twitter fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-google-plus-g fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-github fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-pinterest-p fa-lg\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                              <br>   \n");
      out.write("                            <p >3+ Years of Experiance in PHP with good innovative Ideas</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"user-card\">\n");
      out.write("                        <div class=\"userar\">\n");
      out.write("                            <img class=\"teammempic\" alt=\"\" src=\"images/team/team-memb4.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"detfs\">\n");
      out.write("                            <p>Mark Frances<i> - MD</i></p>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-facebook-f fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-twitter fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-google-plus-g fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-github fa-lg\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-pinterest-p fa-lg\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                             <br>   \n");
      out.write("                            <p >3+ Years of Experiance in PHP with good innovative Ideas</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- ################# Our Blog Starts Here#######################--->\n");
      out.write("\n");
      out.write("    <section class=\"our-blog\">\n");
      out.write("         \t<div class=\"container\">\n");
      out.write("         \t\t<div class=\"row session-title\">\n");
      out.write("        \t\t\t<h2> Our Blog </h2>\n");
      out.write("        \t\t\t<p>Take a look at what people say about US </p>\n");
      out.write("        \t\t</div>\n");
      out.write("        \t\t<div class=\"blog-row row\">\n");
      out.write("        \t\t\t<div class=\"col-md-4 col-sm-6\">\n");
      out.write("        \t\t\t\t<div class=\"single-blog\">\n");
      out.write("        \t\t\t\t\t<figure>\n");
      out.write("        \t\t\t\t\t\t<img src=\"images/blog/blog_01.jpg\" alt=\"\">\n");
      out.write("        \t\t\t\t\t</figure>\n");
      out.write("        \t\t\t\t\t<div class=\"blog-detail\">\n");
      out.write("        \t\t\t\t\t\t<small>By Admin | August 10 2018</small>\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Methods of Recuirtments</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam justo neque, aliquet sit amet elementum vel, vehicula eget eros. Vivamus arcu metus, mattis sed sagittis at, sagittis quis neque. Praesent.</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"link\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"\">Read more </a><i class=\"fas fa-long-arrow-alt-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t\n");
      out.write("        \t\t\t\t\t\n");
      out.write("        \t\t\t\t</div>\n");
      out.write("        \t\t\t</div>\n");
      out.write("        \t\t\t<div class=\"col-md-4 col-sm-6\">\n");
      out.write("        \t\t\t\t<div class=\"single-blog\">\n");
      out.write("        \t\t\t\t\t<figure>\n");
      out.write("        \t\t\t\t\t\t<img src=\"images/blog/blog_02.jpg\" alt=\"\">\n");
      out.write("        \t\t\t\t\t</figure>\n");
      out.write("        \t\t\t\t\t<div class=\"blog-detail\">\n");
      out.write("        \t\t\t\t\t\t<small>By Admin | August 10 2018</small>\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Methods of Recuirtments</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam justo neque, aliquet sit amet elementum vel, vehicula eget eros. Vivamus arcu metus, mattis sed sagittis at, sagittis quis neque. Praesent.</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"link\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"\">Read more </a><i class=\"fas fa-long-arrow-alt-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t\n");
      out.write("        \t\t\t\t\t\n");
      out.write("        \t\t\t\t</div>\n");
      out.write("        \t\t\t</div>\n");
      out.write("        \t\t\t<div class=\"col-md-4 col-sm-6\">\n");
      out.write("        \t\t\t\t<div class=\"single-blog\">\n");
      out.write("        \t\t\t\t\t<figure>\n");
      out.write("        \t\t\t\t\t\t<img src=\"images/blog/blog_03.jpg\" alt=\"\">\n");
      out.write("        \t\t\t\t\t</figure>\n");
      out.write("        \t\t\t\t\t<div class=\"blog-detail\">\n");
      out.write("        \t\t\t\t\t\t<small>By Admin | August 10 2018</small>\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Methods of Recuirtments</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam justo neque, aliquet sit amet elementum vel, vehicula eget eros. Vivamus arcu metus, mattis sed sagittis at, sagittis quis neque. Praesent.</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"link\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"\">Read more </a><i class=\"fas fa-long-arrow-alt-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t\n");
      out.write("        \t\t\t\t\t\n");
      out.write("        \t\t\t\t</div>\n");
      out.write("        \t\t\t</div>\n");
      out.write("        \t\t</div>\n");
      out.write("         \t</div>\n");
      out.write("         </section>\n");
      out.write("\n");
      out.write("    <!-- ################# Footer Starts Here#######################--->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-12\">\n");
      out.write("                    <h2>About Us</h2>\n");
      out.write("                    <p>\n");
      out.write("                        Smart Eye is a leading provider of information technology, consulting, and business process services. Our dedicated employees offer strategic insights, technological expertise and industry experience.\n");
      out.write("                    </p>\n");
      out.write("                    <p>We focus on technologies that promise to reduce costs, streamline processes and speed time-to-market, Backed by our strong quality processes and rich experience managing global... </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-12\">\n");
      out.write("                    <h2>Useful Links</h2>\n");
      out.write("                    <ul class=\"list-unstyled link-list\">\n");
      out.write("                        <li><a ui-sref=\"about\" href=\"#/about\">About us</a><i class=\"fa fa-angle-right\"></i></li>\n");
      out.write("                        <li><a ui-sref=\"portfolio\" href=\"#/portfolio\">Portfolio</a><i class=\"fa fa-angle-right\"></i></li>\n");
      out.write("                        <li><a ui-sref=\"products\" href=\"#/products\">Latest jobs</a><i class=\"fa fa-angle-right\"></i></li>\n");
      out.write("                        <li><a ui-sref=\"gallery\" href=\"#/gallery\">Gallery</a><i class=\"fa fa-angle-right\"></i></li>\n");
      out.write("                        <li><a ui-sref=\"contact\" href=\"#/contact\">Contact us</a><i class=\"fa fa-angle-right\"></i></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-12 map-img\">\n");
      out.write("                    <h2>Contact Us</h2>\n");
      out.write("                    <address class=\"md-margin-bottom-40\">\n");
      out.write("                        BlueDart <br>\n");
      out.write("                        Marthandam (K.K District) <br>\n");
      out.write("                        Tamil Nadu, IND <br>\n");
      out.write("                        Phone: +91 9159669599 <br>\n");
      out.write("                        Email: <a href=\"mailto:info@anybiz.com\" class=\"\">info@bluedart.in</a><br>\n");
      out.write("                        Web: <a href=\"smart-eye.html\" class=\"\">www.bluedart.in</a>\n");
      out.write("                    </address>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("    <div class=\"copy\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a href=\"https://www.smarteyeapps.com/\">2015 &copy; All Rights Reserved | Designed and Developed by Smarteyeapps</a>\n");
      out.write("                \n");
      out.write("                <span>\n");
      out.write("                <a><i class=\"fab fa-github\"></i></a>\n");
      out.write("                <a><i class=\"fab fa-google-plus-g\"></i></a>\n");
      out.write("                <a><i class=\"fab fa-pinterest-p\"></i></a>\n");
      out.write("                <a><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                <a><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("        </span>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    <script src=\"assets/js/jquery-3.2.1.min.js\"></script>\n");
      out.write("<script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("<script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"assets/plugins/scroll-fixed/jquery-scrolltofixed-min.js\"></script>\n");
      out.write("<script src=\"assets/js/script.js\"></script>\n");
      out.write("\n");
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
