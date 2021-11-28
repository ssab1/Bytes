
package sql;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author basti
 */
public class VentaSQL {
    
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int respuesta = 0;
    
    
    public int Guardar_Venta(EntidadVenta ev){
        String sql= "insert into table_venta(Num_venta_PK,fecha,hora,total) values (?,?,now(),?)";
        try{
            con = cn.getconnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ev.getNum_venta_pk());
            ps.setString(2, ev.getFecha_venta());
            ps.setInt(3, ev.getMonto_venta());
            respuesta = ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("no entro");
        }
        
        return respuesta;
    }
    
    public int GuardarDetalleVenta(EntidadDeVenta dv){
        String sql = "insert into table_detalle_venta(FK_num_venta,FK_produc_codigo,cantidad_producto,Valor_iva,Descuento,Subtotal)"
                + "values (?,?,?,?,?,?)";
        try{
            con = cn.getconnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getFk_num_venta());
            ps.setString(2, dv.getFk_produc_codigo());
            ps.setInt(3, dv.getCantidad_producto());
            ps.setInt(4, dv.getValor_iva());
            ps.setInt(5, dv.getDescuento());
            ps.setInt(6, dv.getSubtotal());
            ps.executeUpdate();
        }catch(SQLException e){
        }
        
        return respuesta;
    }
    
}
