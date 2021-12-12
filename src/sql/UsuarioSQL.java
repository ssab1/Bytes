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
public class UsuarioSQL implements CRUD {

    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;

    @Override
    public List listar() {
        List<EntidadUsuarios> lista = new ArrayList<>();
        String sql = "select tp.rut_personal_PK,tp.nombre,tp.apellido,tr.Tipo_Rol from table_personal tp inner join table_rol tr on tp.FK_id_rol=tr.id_rol_PK";

        try {
            con = cn.getconnection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                EntidadUsuarios eu = new EntidadUsuarios();
                eu.setRut_personal_PK_bd(rs.getString(1));
                eu.setNombre_bd(rs.getString(2));
                eu.setApellido_bd(rs.getString(3));
                eu.setRol_nombre_bd(rs.getString(4));

                lista.add(eu);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
         int r = 0;
        String sql = "insert into table_personal(rut_personal_PK,nombre,apellido,FK_id_rol) values (validate_rut(?),?,?,?)";
        try {
            con = cn.getconnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
          int r = 0;
        String sql = "update table_personal set nombre=?, apellido=?, FK_id_rol=? where rut_personal_PK=?";
        try {
            con = cn.getconnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    @Override
    public void eliminar(String id) {
         String sql = "delete from table_personal where rut_personal_PK=?";
        try {
            con = cn.getconnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
