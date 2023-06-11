/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Salida extends Movimiento{
    private int idSalidaProducto;
    private String idCliente;
    private LocalDate fechaSalida;
    private String codigo;
        public Salida() {       
        }

          public Salida(int idSalidaProducto, String codigo) {
        this.idSalidaProducto = idSalidaProducto;
        this.codigo = codigo;
        }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getIdSalidaProducto() {
        return idSalidaProducto;
    }

    public void setIdSalidaProducto(int idSalidaProducto) {
        this.idSalidaProducto = idSalidaProducto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
     public String toString(){    
        return this.codigo; 
    }
    
}
