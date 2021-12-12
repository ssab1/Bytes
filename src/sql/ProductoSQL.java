package sql;

import com.mysql.jdbc.Connection;
import conexion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author basti
 */
public class ProductoSQL implements CRUD {
    
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;
    
    public EntidadProducto listarID(String codigob) {
        EntidadProducto ep = new EntidadProducto();
        String sql = "select * from table_producto where codigo_producto_PK=?";
        try {
            con = cn.getconnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, codigob);
            rs = ps.executeQuery();
            while (rs.next()) {
                ep.setCodigo(rs.getString(1));
                ep.setNombre(rs.getString(2));
                ep.setPrecio(rs.getInt(3));
            }
        } catch (SQLException e) {
        }
        return ep;
        
    }



    @Override
    public List listar() {
        List<EntidadProducto> lista = new ArrayList<>();
        String sql = "select codigo_producto_PK,nombre,precio"
                + " from table_producto";
        
        try {
            con = cn.getconnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                EntidadProducto ep = new EntidadProducto();
                ep.setCodigo(rs.getString(1));
                ep.setNombre(rs.getString(2));
                ep.setPrecio(rs.getInt(3));
                
                lista.add(ep);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into table_producto(codigo_producto_PK,nombre,precio) values (?,?,?)";
        try {
            con = cn.getconnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
         int r = 0;
        String sql = "update table_producto set nombre=?, precio=? where codigo_producto_PK=?";
        try {
            con = cn.getconnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    @Override
    public void eliminar(String id) {
         String sql = "delete from table_producto where codigo_producto_PK=?";
        try {
            con = cn.getconnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

  

    
   
    
}
