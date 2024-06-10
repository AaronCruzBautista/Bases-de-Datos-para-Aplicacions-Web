/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package mrysi.servlets;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mrysi.beans.Escuela;

/**
 *
 * @author josef
 */
public class ServletEscuelas extends HttpServlet {
Statement statement;
ResultSet resultSet;
    private Object Class;
    private Object connect;
    private Object Class;
  
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException{
try(

Class.forName("com.mysql.jdbc.Driver");
        
String URL = "jdbc:mysql://localhost/mrysiEscuelas?user=root&password=root";
        
/*connect*/ = DriverManager.getConnection(URL); java.sql.Statement statement = /*connect*/.createStatement();request.setAttribute("ListaEscuelas", getListaEscuelas());
/*connect*/.close();

        }catch (SQLException ex) {

System.out.println(ex);

}   catch (java.sql.SQLException ex) {
        Logger.getLogger(ServletEscuelas.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public List<Escuela> getListaEscuelas () throws SQLException{

String query = "SELECT * from Escuelas";

resultSet = (ResultSet) statement.executeQuery(query);

List<Escuela> Escuelas = new ArrayList();

Escuela escuela;

while (resultSet.next()) {

escuela = new Escuela();

escuela.setClaveEscuela (resultSet.getString(1));

escuela.setNombreEscuela (resultSet.getString(2));

escuela.setDomicilio (resultSet.getString(3));

escuela.setCodigoPostal(resultSet.getInt(4));

escuela.setTurno (resultSet.getString(5));

escuela.setIdLocalidad (resultSet.getInt(6));

Escuelas.add(escuela);

}

return Escuelas;

}
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletEscuelas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletEscuelas at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
