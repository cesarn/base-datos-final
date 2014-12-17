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
public class DAOProvedor {
    public static String guardarProvedor(String cantidad_pro, String marca_pro,String modelo)throws Exception{
     Conexion c=new Conexion();
        Connection con=c.conectarse();
     CallableStatement callate=con.prepareCall("{call GUARDAR_PROVEDOR  (?,?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setString(2,cantidad_pro);
        callate.setString(3,marca_pro);
        callate.setString(4,modelo);
   
      
        callate.execute();
        int pk=callate.getInt(1);
        return "Se guardo el pedido con el id:"+pk;
}
}
