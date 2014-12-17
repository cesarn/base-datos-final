/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.controladores;

import com.jc.model.DAOProvedor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletGuardarProvedor extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    String cantidad_pro=    request.getParameter("cantidad_pro");
     String marca_pro=    request.getParameter("marca_pro");
      String modelo=    request.getParameter("modelo");
      
        try {
            DAOProvedor.guardarProvedor(cantidad_pro,marca_pro,modelo);
        } catch (Exception ex) {
            Logger.getLogger(ServletGuardarAuto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
