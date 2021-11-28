package sql;

/**
 *
 * @author basti
 */
public class EntidadVenta {
    
    int num_venta_pk;
    //String fk_rut_vendedor;
    String fecha_venta;
    String hora_venta;
    int monto_venta;

    public EntidadVenta() {
    }

    public EntidadVenta(int num_venta_pk, String fecha_venta, String hora_venta, int monto_venta) {
        this.num_venta_pk = num_venta_pk;
        this.fecha_venta = fecha_venta;
        this.hora_venta = hora_venta;
        this.monto_venta = monto_venta;
    }

    public int getNum_venta_pk() {
        return num_venta_pk;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public String getHora_venta() {
        return hora_venta;
    }

    public int getMonto_venta() {
        return monto_venta;
    }

    public void setNum_venta_pk(int num_venta_pk) {
        this.num_venta_pk = num_venta_pk;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public void setHora_venta(String hora_venta) {
        this.hora_venta = hora_venta;
    }

    public void setMonto_venta(int monto_venta) {
        this.monto_venta = monto_venta;
    }
    
    




    
}
