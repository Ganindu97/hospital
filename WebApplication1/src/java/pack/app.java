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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJANTHA
 */
@WebServlet(name = "app", urlPatterns = {"/app"})
public class app extends HttpServlet {
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
            
            
            
            
            
            
            String patid=request.getParameter("patid");
            String docid=request.getParameter("docid");
            
            String appno=request.getParameter("appno");
            String btime=request.getParameter("btime");
            String bdate=request.getParameter("bdate");
            String age=request.getParameter("age");
            String area=request.getParameter("area");
            String city=request.getParameter("city");
            String state=request.getParameter("state");
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web", "root", "");
                
                String query="insert into appointments(patid,docid,appno,btime,bdate,age,area,city,state) value(?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst=con.prepareStatement(query);
                pst.setString(1,patid);
                pst.setString(2,docid);
                pst.setString(3,appno);
                pst.setString(4,btime);
                pst.setString(5,bdate);
                pst.setString(6,age);
                pst.setString(7,area);
                pst.setString(8,city);
                pst.setString(9,state);
                pst.execute();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
            
            
            response.sendRedirect("http://localhost:8080/WebApplication1/appointment.jsp");
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
