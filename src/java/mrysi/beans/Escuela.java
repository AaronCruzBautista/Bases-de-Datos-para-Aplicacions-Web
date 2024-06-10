/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package mrysi.beans;

import java.io.IOException;
import java.io.PrintWriter;
import javax.lang.model.SourceVersion;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author josef
 */

public class Escuela implements java.io.Serializable {

private String claveEscuela;
private String nombreEscuela;
private String domicilio;
private int codigoPostal;
private String turno;
private int idLocalidad;

public void setClaveEscuela (String claveEscuela) { 
    this.claveEscuela = claveEscuela; 
}
public void setNombreEscuela (String nombreEscuela) { 
    this.nombreEscuela = nombreEscuela; 
}
public void setDomicilio (String domicilio) { 
    this.domicilio = domicilio; 
}
public void setCodigoPostal (int codigoPostal) { 
    this.codigoPostal = codigoPostal; 
}
public void setTurno (String turno) { 
    this.turno = turno; 
}
public void setIdLocalidad (int idLocalidad) { 
    this.idLocalidad = idLocalidad; 
}
public String getClaveEscuela() { return claveEscuela; }
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

 


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Escuela</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Escuela at " + request.getContextPath() + "</h1>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
