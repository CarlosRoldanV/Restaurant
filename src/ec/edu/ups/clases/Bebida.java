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
public class Bebida {
    private String nombre;
    private String sabor;
    private double precio;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getSabor() {
        return this.sabor;
    }
    public double getPrecio() {
        return this.precio;
    }

    public String toString() {
       return "Bebida [nombre=" + nombre + ", sabor=" + sabor + ", precio=" + precio + "]";
    }
}