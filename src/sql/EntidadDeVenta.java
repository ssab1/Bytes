package sql;

/**
 *
 * @author basti
 */
public class EntidadDeVenta {
    int id_detalle_venta_PK;
    int fk_num_venta;
    String fk_produc_codigo;
    int cantidad_producto;
    int descuento;

    public EntidadDeVenta() {
    }

    public EntidadDeVenta(int id_detalle_venta_PK, int fk_num_venta, String fk_produc_codigo, int cantidad_producto, int descuento) {
        this.id_detalle_venta_PK = id_detalle_venta_PK;
        this.fk_num_venta = fk_num_venta;
        this.fk_produc_codigo = fk_produc_codigo;
        this.cantidad_producto = cantidad_producto;
        this.descuento = descuento;
    }

    public int getId_detalle_venta_PK() {
        return id_detalle_venta_PK;
    }

    public int getFk_num_venta() {
        return fk_num_venta;
    }

    public String getFk_produc_codigo() {
        return fk_produc_codigo;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }


    public int getDescuento() {
        return descuento;
    }

    public void setId_detalle_venta_PK(int id_detalle_venta_PK) {
        this.id_detalle_venta_PK = id_detalle_venta_PK;
    }

    public void setFk_num_venta(int fk_num_venta) {
        this.fk_num_venta = fk_num_venta;
    }

    public void setFk_produc_codigo(String fk_produc_codigo) {
        this.fk_produc_codigo = fk_produc_codigo;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    
    
    
    
}