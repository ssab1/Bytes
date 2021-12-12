
package sql;

/**
 *
 * @author basti
 */
public class EntidadUsuarios {
    
   String rut_personal_PK_bd;
   String nombre_bd;
   String apellido_bd;
   String FK_id_rol_bd;
   String rol_nombre_bd;

    public EntidadUsuarios() {
    }

    public EntidadUsuarios(String rut_personal_PK_bd, String nombre_bd, String apellido_bd, String rol_nombre_bd) {
        this.rut_personal_PK_bd = rut_personal_PK_bd;
        this.nombre_bd = nombre_bd;
        this.apellido_bd = apellido_bd;
        this.rol_nombre_bd = rol_nombre_bd;
    }

    public String getRut_personal_PK_bd() {
        return rut_personal_PK_bd;
    }

    public String getNombre_bd() {
        return nombre_bd;
    }

    public String getApellido_bd() {
        return apellido_bd;
    }

    public String getRol_nombre_bd() {
        return rol_nombre_bd;
    }

    public void setRut_personal_PK_bd(String rut_personal_PK_bd) {
        this.rut_personal_PK_bd = rut_personal_PK_bd;
    }

    public void setNombre_bd(String nombre_bd) {
        this.nombre_bd = nombre_bd;
    }

    public void setApellido_bd(String apellido_bd) {
        this.apellido_bd = apellido_bd;
    }


    public void setRol_nombre_bd(String rol_nombre_bd) {
        this.rol_nombre_bd = rol_nombre_bd;
    }
   
   
    
    
}
