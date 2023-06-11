/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.IDetalleEntrada;
import Modelo.Categoria;
import Modelo.DataBase;
import Modelo.DetalleEntrada;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jonathan
 */
public class DetalleEntradaDAO implements IDetalleEntrada{
    
    DataBase bd = new DataBase();
    @Override
    public Boolean registrar(DetalleEntrada detalle) {
        String sql = "INSERT INTO detalleentradaproducto(`idEntradaProducto`,`idProducto`, `subtotal`, `valorIva`, `valorDescuento`, `total`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)"
                + " VALUES('"
                + detalle.getIdEntradaProducto()+"','"
                + detalle.getIdProducto()+"','"
             //   + entrada.getFechaEntrada().format(DateTimeFormatter.ofPattern("yyyy-MM-dd "))+"','"
                + detalle.getSubtotal()+"','"
                + detalle.getValorIva()+"','"
                + detalle.getValorDescuento()+"','"
                + detalle.getTotal()+"','"
                + detalle.getEstado()+"','"
                + detalle.getFechaIngreso().format(DateTimeFormatter.ofPattern("yyyy-MM-dd "))+"','"
                + detalle.getUsuarioIngreso()+"', "
                + null+", "
                + null+", "
                + null+", "
                + null+") ";
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean modificar(DetalleEntrada detalle) {
        String sql = "UPDATE detalleentradaproducto SET idDetalleEntradaProducto='"
                + detalle.getIdEntradaProducto()+"',IdProducto='"
                + detalle.getIdProducto()+"',subtotal='"
               // + entrada.getFechaEntrada()+"',subtotal='"
                + detalle.getSubtotal()+"',valorIva='"
                + detalle.getValorIva()+"',valorDescuento='"
                + detalle.getValorDescuento()+"',total='"
                + detalle.getTotal()+"',fechaModifica='"
                + detalle.getFechaModifica().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+"',usuarioModifica='"
                + detalle.getUsuarioModifica()+"' WHERE idDetalleEntradaProducto="
                + detalle.getIdEntradaProducto();
             
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean eliminar(DetalleEntrada detalle) {
        String sql = "UPDATE detalleentradaproducto SET estado='"
                + detalle.getEstado()+"',fechaElimina='"
                + detalle.getFechaElimina().format(DateTimeFormatter.ofPattern("yyyy-MM-dd "))+"',usuarioElimina='"
                + detalle.getUsuarioElimina()+"' WHERE idDetalleEntradaProducto="
                + detalle.getIdDetalleEntradaProducto();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<DetalleEntrada> consultar() {
        String sql = "SELECT * FROM detalleentradaproducto WHERE estado = 1";
        List<Map> rows = bd.execute(sql);
        List<DetalleEntrada> detalle = new ArrayList();
        for(Map row : rows){
            DetalleEntrada ent = new DetalleEntrada();
            ent.setIdDetalleEntradaProducto((int) row.get("idDetalleEntradaProducto"));
            ent.setIdEntradaProducto(String.valueOf( row.get("idEntradaProducto")));
           // ent.setCodigo((String) row.get("codigo"));
            ent.setIdProducto(String.valueOf((row.get("idProducto"))));
           // ent.setFechaEntrada(LocalDate.parse(row.get("fechaEntrada").toString(),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            ent.setSubtotal((float) row.get("subtotal"));
            ent.setValorIva((int) row.get("valorIva"));
            ent.setValorDescuento((float) row.get("valorDescuento"));
            ent.setTotal((float) row.get("total"));
            detalle.add(ent);
        }
        return detalle;
    }

    @Override
    public DetalleEntrada leer(int idDetalleEntrada) {
        String sql = "SELECT * FROM detalleentradaproducto WHERE idDetalleEntradaProducto="+idDetalleEntrada;
        List<Map> data = bd.execute(sql);
        DetalleEntrada ent = new DetalleEntrada();
        for(Map da : data){
            ent.setIdDetalleEntradaProducto((int) da.get("idDetalleEntradaProducto"));
           ent.setIdEntradaProducto(String.valueOf( da.get("idEntradaProducto")));
            //ent.setCodigo((String) da.get("codigo"));
            ent.setIdProducto(String.valueOf((da.get("idProducto"))));
           // ent.setFechaEntrada(LocalDate.parse(da.get("fechaEntrada").toString(),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            ent.setSubtotal((float) da.get("subtotal"));
            ent.setValorIva((int) da.get("valorIva"));
            ent.setValorDescuento((float) da.get("valorDescuento"));
            ent.setTotal((float) da.get("total"));            
        }
        return ent;
    }
    
}
