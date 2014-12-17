/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;

/**
 *
 * @author T-205
 */
public class Auto {

    static void add(Auto p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   private Integer id_cel;
   private String marca_cel;
   private String modelo;
   private String precio;
   private String compania;

   
@Override
    public String toString() {
        return "Celular{" + "id_cel=" + id_cel + ", marca_cel=" + marca_cel + ", modelo=" + modelo + ", precio=" + precio + ", compania=" + compania + '}';
    }
   
   
   
    public Auto() {
    }

    public Auto(Integer id_cel, String marca_cel, String modelo, String precio, String compania) {
        this.id_cel = id_cel;
        this.marca_cel = marca_cel;
        this.modelo = modelo;
        this.precio = precio;
        this.compania = compania;
    }

    public Integer getId_cel() {
        return id_cel;
    }

    public void setId_cel(Integer id_cel) {
        this.id_cel = id_cel;
    }

    public String getMarca_cel() {
        return marca_cel;
    }

    public void setMarca_cel(String marca_cel) {
        this.marca_cel = marca_cel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
   
}
