/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jonathan
 */
public class DetalleEntrada extends Movimiento{
    
    private int idDetalleEntradaProducto;
    private String idEntradaProducto;
    private String idProducto;

    public int getIdDetalleEntradaProducto() {
        return idDetalleEntradaProducto;
    }

    public void setIdDetalleEntradaProducto(int idDetalleEntrada) {
        this.idDetalleEntradaProducto = idDetalleEntrada;
    }

    public String getIdEntradaProducto() {
        return idEntradaProducto;
    }

    public void setIdEntradaProducto(String idEntradaProducto) {
        this.idEntradaProducto = idEntradaProducto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }  
    public String toString(){    
        return this.idProducto;
       
    }
}
