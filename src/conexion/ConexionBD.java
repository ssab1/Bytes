/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;

/**
 *
 * @author basti
 */
public class ConexionBD {

    String driver = "com.mysql.jdbc.Driver";
    String usuario = "root";
    String password = "ssab";
    String url = "jdbc:mysql://localhost:3306/bytes";

    public Connection getconnection() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, usuario, password);
            System.out.println("conexion exitosa");
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return con;
    }

}
