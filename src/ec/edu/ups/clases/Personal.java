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
public class Personal {
    private String cedula;
    private String nombre;
    private String cargo;
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getCedula() {
        return this.cedula;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getCargo() {
        return this.cargo;
    }
    public String toString() {
       return "Personal [cedula=" + cedula + ", nombre=" + nombre + ", cargo=" + cargo + "]";
    }
}