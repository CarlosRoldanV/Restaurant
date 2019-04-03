/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author ROBERTO
 */
public class Cliente {
    private String nombre;
    private String pedido;
    private double cuenta;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getPedido() {
        return this.pedido;
    }
    public double getCuenta() {
        return this.cuenta;
    }
    public String toString() {
       return "Clietne [nombre=" + nombre + ", pedido=" + pedido + ", cuenta=" + cuenta + "]";
    }


}
