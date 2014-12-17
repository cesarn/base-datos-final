/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class DAOAuto {
     public static String guardarAuto(String marca_auto, String modelo,String precio)throws Exception{
     Conexion c=new Conexion();
        Connection con=c.conectarse();
     CallableStatement callate=con.prepareCall("{call GUARDAR_CELULAR(?,?,?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setString(2,marca_auto);
        callate.setString(3,modelo);
        callate.setString(4,precio);
      
        callate.execute();
        int pk=callate.getInt(1);
        return "Se guardo auto con el id:"+pk;
        
    }
     
     public  static String buscarTodosCelulares() {
     // primero nos canectamos a oracle
    String resultado="no hay nada ";
    try{ 
    Connection con= Conexion.conectarse();
        Statement st= con.createStatement();
        // Con el statement realizamos los querry
         ResultSet res= st.executeQuery("select * from celular");
         
         // Iterar el resultset para ver los resultados de la consulta
         int contador =0;
         ArrayList<Auto> auto=new ArrayList<Auto>();
         while(res.next()){
             Auto p=new Auto();
                p.setId_cel(res.getInt(1));
                p.setMarca_cel(res.getString(2));
                p.setModelo(res.getString(3));
                p.setPrecio(res.getString(4));
                p.setCompania(res.getString(5));
                
                Auto.add(p);
         }
        resultado="encontramos "+ auto.toString()+ "registrados";
            }catch (Exception e){
                resultado=e.getMessage();
            }
    return resultado;
     
     
     
     }

    public static Iterable<Usuario> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
