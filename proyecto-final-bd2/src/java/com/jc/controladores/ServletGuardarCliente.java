/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.controladores;

import com.jc.model.DAOCliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T-205
 */
public class ServletGuardarCliente extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    String nombre=    request.getParameter("nombre");
     String telefono=    request.getParameter("telefono");
      String direccion=    request.getParameter("direccion");
       String marca_auto=    request.getParameter("marca_auto");
        try {
            DAOCliente.guardarCliente(nombre,telefono, direccion, marca_auto);
        } catch (Exception ex) {
            Logger.getLogger(ServletGuardarAuto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}