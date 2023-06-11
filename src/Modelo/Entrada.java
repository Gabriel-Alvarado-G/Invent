/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;
    public class Entrada extends Movimiento{
    private int idEntradaProducto;
    private String codigo;
    private String idProveedor;
    private LocalDate fechaEntrada;
    private int valorIva;

    

        public Entrada() {       
        }

          public Entrada(int idEntradaProducto, String codigo) {
        this.idEntradaProducto = idEntradaProducto;
        this.codigo = codigo;
        }
          
    public int getIdEntradaProducto() {
        return idEntradaProducto;
    }

    public void setIdEntradaProducto(int idEntradaProducto) {
        this.idEntradaProducto = idEntradaProducto;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }
  
    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    public String toString(){    
        return this.codigo; 
    }
    
}
