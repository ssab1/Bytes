
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
        String sql= "insert into table_venta(Num_venta_PK,fecha,hora,Valor_iva,total) values (?,?,now(),?,?)";
        try{
            con = cn.getconnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ev.getNum_venta_pk());
            ps.setString(2, ev.getFecha_venta());
            ps.setInt(3,ev.getValor_iva());
            ps.setInt(4, ev.getMonto_venta());
            
            respuesta = ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("no entro");
        }
        
        return respuesta;
    }
    
    public int GuardarDetalleVenta(EntidadDeVenta dv){
        String sql = "insert into table_detalle_venta(id_detalle_venta_PK,FK_num_venta,FK_produc_codigo,"
                + "cantidad_producto)"
                + "values (?,(select max(Num_venta_PK)from table_venta),?,?)";
        try{
            con = cn.getconnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getFk_num_venta());
            ps.setString(2, dv.getFk_produc_codigo());
            ps.setInt(3, dv.getCantidad_producto());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("no entro detalle venta");
            System.out.println("error: "+e);
        }
        
        return respuesta;
    }
    
}
