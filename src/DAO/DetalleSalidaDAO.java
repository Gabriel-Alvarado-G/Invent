package DAO;
import Interfaces.IDetalleSalida;
import Modelo.DataBase;
import Modelo.DetalleSalida;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
 
public class DetalleSalidaDAO implements IDetalleSalida{
    DataBase bd = new DataBase();
    @Override
    public Boolean registrar(DetalleSalida Dtsalida) {
        String sql = "INSERT INTO DetalleSalidaProducto(`idSalidaProducto`, `idProducto`, `subtotal`, `valorIva`, `valorDescuento`, `total`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)"
                + " VALUES('"
                + Dtsalida.getIdSalidaProducto()+"','"
                + Dtsalida.getIdProducto()+"','"
                + Dtsalida.getSubtotal()+"','"
                + Dtsalida.getValorIva()+"','"
                + Dtsalida.getValorDescuento()+"','"
                + Dtsalida.getTotal()+"','"
                + Dtsalida.getEstado()+"','"
                + Dtsalida.getFechaIngreso().format(DateTimeFormatter.ofPattern("yyyy-MM-dd "))+"','"
                + Dtsalida.getUsuarioIngreso()+"', "
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
    public Boolean modificar(DetalleSalida Dtsalida) {
        String sql = "UPDATE detallesalidaproducto SET idSalidaProducto='"
                + Dtsalida.getIdSalidaProducto()+"',idProducto='"
                + Dtsalida.getIdProducto()+"',subtotal='"
                + Dtsalida.getSubtotal()+"',valorIva='"
                + Dtsalida.getValorIva()+"',valorDescuento='"
                + Dtsalida.getValorDescuento()+"',total='"
                + Dtsalida.getTotal()+"',fechaModifica='"
                + Dtsalida.getFechaModifica().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+"',usuarioModifica='"
                + Dtsalida.getUsuarioModifica()+"' WHERE idDetalleSalidaProducto="
                + Dtsalida.getIdDetalleSalidaProducto();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean eliminar(DetalleSalida Dtsalida) {
        String sql = "UPDATE detallesalidaproducto SET estado='"
                + Dtsalida.getEstado()+"',fechaElimina='"
                + Dtsalida.getFechaElimina().format(DateTimeFormatter.ofPattern("yyyy-MM-dd "))+"',usuarioElimina='"
                + Dtsalida.getUsuarioElimina()+"' WHERE idDetalleSalidaProducto="
                + Dtsalida.getIdDetalleSalidaProducto();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    } 

    @Override
    public List<DetalleSalida> consultar() {
        String sql = "SELECT * FROM detallesalidaproducto WHERE estado = 1";
        List<Map> rows = bd.execute(sql);
        List<DetalleSalida> DetallSalidas = new ArrayList();
        for(Map row : rows){
            DetalleSalida dtas = new DetalleSalida();
            dtas.setIdDetalleSalidaProducto((int) row.get("idDetalleSalidaProducto"));
            dtas.setIdSalidaProducto(String.valueOf( row.get("idSalidaProducto")));
            dtas.setIdProducto(String.valueOf( row.get("idProducto")));
            dtas.setSubtotal((float) row.get("subtotal"));
            dtas.setValorIva((int) row.get("valorIva"));
            dtas.setValorDescuento((float) row.get("valorDescuento"));
            dtas.setTotal((float) row.get("total"));
            DetallSalidas.add(dtas);
        }
        return DetallSalidas;
    }
    @Override
    public DetalleSalida leer(int idDetalleEntrada) {
        String sql = "SELECT * FROM detallesalidaproducto WHERE idDetalleSalidaProducto="+idDetalleEntrada;
        List<Map> data = bd.execute(sql);
        DetalleSalida dtas = new DetalleSalida();
        for(Map da : data){
            dtas.setIdDetalleSalidaProducto((int) da.get("idDetalleSalidaProducto"));
            dtas.setIdSalidaProducto(String.valueOf( da.get("idSalidaProducto")));
            dtas.setIdProducto(String.valueOf( da.get("idProducto")));
            dtas.setSubtotal((float) da.get("subtotal"));
            dtas.setValorIva((int) da.get("valorIva"));
            dtas.setValorDescuento((float) da.get("valorDescuento"));
            dtas.setTotal((float) da.get("total"));
        
        }
        return dtas;
    }
}