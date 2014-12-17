/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author T-205
 */
public class DAOCliente {
    public static String guardarCliente(String nombre, String telefono,String direccion, String marca_auto)throws Exception{
     Conexion c=new Conexion();
        Connection con=c.conectarse();
     CallableStatement callate=con.prepareCall("{call GUARDAR_CLIENTE(?,?,?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setString(2,nombre);
        callate.setString(3,telefono);
        callate.setString(4,direccion);
        callate.setString(5,marca_auto);
      
        callate.execute();
        int pk=callate.getInt(1);
        return "Se guardo registro del cliente con el id:"+pk;
        
    }
}
