/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author ROBER
 */
public class Menu {
    private int codigo;
    private String nombre;
    private double precio;
    

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    public double getPrecio() {
        return this.precio;
    }
    public String toString() {
       return "Menu [codigo=" + codigo + ", nobmre=" + nombre + ", precio=" + precio + "]";
    }
}
