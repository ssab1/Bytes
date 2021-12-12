package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import conexion.ConexionBD;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author basti
 */

public class InicioSesion{

    ConexionBD cbd = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    
    public EntidadPersonal ListarRut(String rut) {
        EntidadPersonal EP = new EntidadPersonal();
        String sql ="select Rut_personal_PK,nombre,apellido,FK_id_rol from table_personal where Rut_personal_PK=validate_rut(?)";
        try{
            con= cbd.getconnection();
            ps= con.prepareStatement(sql);
            ps.setString(1, rut);
            rs = ps.executeQuery();
            while(rs.next()){
                EP.setRut(rs.getString(1));
                EP.setNombre(rs.getString(2));
                EP.setApellido(rs.getString(3));
                EP.setRol(rs.getInt(4));
            }
        }catch(Exception e){ 
        }
        return EP;
    }
   
     public EntidadPersonal ListarRol() {
        EntidadPersonal EP = new EntidadPersonal();
        String sql ="select Rut_personal_PK,nombre,apellido,FK_id_rol from table_personal"
                + " where Rut_personal_PK=validate_rut(?)";
        try{
            con= cbd.getconnection();
            ps= (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                EP.setRut(rs.getString(1));
                EP.setNombre(rs.getString(2));
                EP.setApellido(rs.getString(3));
                EP.setRol(rs.getInt(4));
            }
        }catch(Exception e){ 
        }
        return EP;
    }
}
