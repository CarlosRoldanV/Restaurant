/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author ROBER
 */
public class Cajero {
    private String usuario;
    private Date fecha;
    private double cuenta;
    public void setUsuario(String usuario) {
        this.usuario= usuario;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }
    public String getUsuario() {
        return this.usuario;
    }
    public Date getFecha() {
        return this.fecha;
    }
    public double getCuenta() {
        return this.cuenta;
    }
    public String toString() {
       return "Cajero [usuario=" + usuario + ", fecha=" + fecha + ", cuenta=" + cuenta + "]";
    }
}
