/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta;

/**
 *
 * @author Asus
 */
public class Recibo extends Comprobante{
  
    private Proveedor proveedor;
    private float total;
    private String detalle;
    
    public Recibo(){
   // Representacion de la reñlacion de composicion
   proveedor = new Proveedor();
    }

    public Recibo(Proveedor proveedor, float total, String detalle) {
        this.proveedor = proveedor;
        this.total = total;
        this.detalle = detalle;
    }

    public Recibo(Proveedor proveedor, float total, String detalle, char tipo, int numero, String fecha) {
        super(tipo, numero, fecha);
        this.proveedor = proveedor;
        this.total = total;
        this.detalle = detalle;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   
           
           
           
           
           
           
           
           
           
        
        
        
        
        
        
        
     }
   

