

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Character.UnicodeBlock.forName;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author Ganindu Samarajeewa
 */
@WebServlet(urlPatterns = {"/adminprofile"})
public class adminmyprofile extends HttpServlet {

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
          try{
                Connection con;
                Class.forName("com.mysql.jdbc.driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","admin");
                
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("select * from login where name = '"+name+"', email = '"+email+"', password = '"+password+"' ");
                
                if(rs.next()){
                    response.sendRedirect("adminhome.jsp");
                }
                else{
                    out.println("Wrong");
                }
                
                con.close();
                
                
                
            } catch(Exception e){
                
                System.out.println(e.getMessage());
            
            } 
         }
}

   

   


