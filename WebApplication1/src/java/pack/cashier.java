/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ganindu Samarajeewa
 */
@WebServlet(name = "cashier", urlPatterns = {"/cashier"})
public class cashier extends HttpServlet {
    private static Connection con;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String appid=request.getParameter("appid");
            int docfee=Integer.parseInt(request.getParameter("docfee"));
            
            int hospital=Integer.parseInt(request.getParameter("hospital"));
            int tcharge=Integer.parseInt(request.getParameter("tcharge"));
            int discount=Integer.parseInt(request.getParameter("discount"));
            int rprice=Integer.parseInt(request.getParameter("rprice"));
            int total=docfee+hospital+tcharge;
            int net=total-discount;
            int bal=rprice-net;
            String appdate="";
            String apptime="";
            String patid="";
            String docid="";
            String age="";
            Statement stmt=null;
            
            ResultSet rs=null;
            ResultSet rs1=null;
            ResultSet rs2=null;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web", "root", "");
                stmt=con.createStatement();
                String query="select * from appointments where appno="+appid;
                rs=stmt.executeQuery(query);
                while(rs.next()){
                    appdate=rs.getString("bdate");
                    apptime=rs.getString("btime");
                    patid=rs.getString("patid");
                    docid=rs.getString("docid");
                    age=rs.getString("age");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
            
            
            
            
            
            
            
            response.sendRedirect("http://localhost:8080/WebApplication1/cashier.jsp?docfee="+docfee+"&hospital="+hospital+"&tcharge="+tcharge+"&discount="+discount+"&rprice="+rprice+"&total="+total+"&net="+net+"&bal="+bal+"&appid="+appid+"&appdate="+appdate+"&apptime="+apptime+"&patid="+patid+"&docid="+docid+"&age="+age);
        
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
