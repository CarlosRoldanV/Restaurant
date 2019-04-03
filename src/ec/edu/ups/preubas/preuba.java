/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.preubas;
import java.util.Date;
import ec.edu.ups.clases.Bebida;
import ec.edu.ups.clases.Cliente;
import ec.edu.ups.clases.Menu;
import ec.edu.ups.clases.Cajero;
import ec.edu.ups.clases.Personal;
import java.util.Scanner;

/**
 *
 * @author ROBER
 */
public class preuba {

    
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        Scanner tec = new Scanner(System.in);
      
        
        System.out.println("Ingrese");
        System.out.println("1:menu");
        System.out.println("2:bebida");
        System.out.println("3:personal");
        System.out.println("4:cliente");
        System.out.println("5:caja");
        System.out.println("digite su opcion");
        int op = tec.nextInt();
        switch(op){
            case 1:
                Menu co = new Menu();
                System.out.println("Ingrese el codigo");
                co.setCodigo(tec.nextInt());
                System.out.println("Ingrese el nombre de menu");
                co.setNombre(teclado.nextLine());
                System.out.println("Ingrese el precio de la comida");
               co.setPrecio(teclado.nextDouble());
                System.out.println("Codigo: "+co.getCodigo());
                System.out.println("Nombre: "+co.getNombre());
                System.out.println("Precio: "+co.getPrecio());
                System.out.println(co);
                break;
            case 2:
                Bebida em = new Bebida();
                System.out.println("Ingrese el nombre de la bebida");
                em.setNombre(teclado.nextLine());
                System.out.println("Ingrese el sabor del a bebida");
                em.setSabor(teclado.nextLine());
                System.out.println("Ingrese el precio");
                em.setPrecio(tec.nextDouble());
                System.out.println("\nNombre: "+em.getNombre());
                System.out.println("Sabor: "+em.getSabor());
                System.out.println("Precio: "+em.getPrecio());
                System.out.println(em);
                break;
            case 3:
                Personal ec = new Personal();
                System.out.println("Ingrese el numero de cedula");
                ec.setCedula(teclado.nextLine());
                System.out.println("Ingrese el nombre");
                ec.setNombre(teclado.nextLine());
                System.out.println("Ingrese el cargo");
                ec.setCargo(teclado.nextLine()); 
                System.out.println("\n  Cedula: "+ec.getCedula());
                System.out.println("nombre: "+ec.getNombre());
                System.out.println("Cargo: "+ec.getCargo());
                System.out.println(ec);
                break;
            case 4:
                Cliente cl = new Cliente();
                System.out.println("Ingrese el nombre del cliente");
                cl.setNombre(teclado.nextLine());
                System.out.println("Ingrese el pedido del cliente");
                cl.setPedido(teclado.nextLine());
                System.out.println("Ingrese la costo de su pedido");
                cl.setCuenta(tec.nextDouble());
                System.out.println("\nNombre: "+cl.getNombre());
                System.out.println("Pedido: "+cl.getPedido());
                System.out.println("Total a cobrar: "+cl.getCuenta());
                System.out.println(cl);
                
                break;
            case 5:
                Cajero su = new Cajero();
                System.out.println("Ingrese el usuario");
                su.setUsuario(teclado.nextLine());
                 Date fecha = null;
                    su.setFecha(fecha);
                System.out.println("Ingrese el total a cobrar");
                su.setCuenta(tec.nextDouble());
                System.out.println("\nUsuario: "+su.getUsuario());
                System.out.println("fecha:"+fecha);
                System.out.println("Cuenta: "+su.getCuenta());
                System.out.println(su);
                
                break;
        }
       
    }
    

}
