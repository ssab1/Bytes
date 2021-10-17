package sql;

/**
 *
 * @author basti
 */
public class EntidadPersonal {
    
    String Rut;
    String Nombre;
    String Apellido;
    int Rol;

     public EntidadPersonal(){
    }
    
    public EntidadPersonal(String Rut, String Nombre, String Apellido, int Rol) {
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Rol = Rol;
    }

    public String getRut() {
        return Rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getRol() {
        return Rol;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setRol(int Rol) {
        this.Rol = Rol;
    }
    
   
}
