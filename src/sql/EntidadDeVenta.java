package sql;

/**
 *
 * @author basti
 */
public class EntidadDeVenta {
    
    int fk_num_venta;
    String fk_produc_codigo;
    int cantidad_producto;
    int valor_iva;
    int descuento;
    int subtotal;

    public EntidadDeVenta() {
    }

    public EntidadDeVenta(int fk_num_venta, String fk_produc_codigo, int cantidad_producto, int valor_iva, int descuento, int subtotal) {
        this.fk_num_venta = fk_num_venta;
        this.fk_produc_codigo = fk_produc_codigo;
        this.cantidad_producto = cantidad_producto;
        this.valor_iva = valor_iva;
        this.descuento = descuento;
        this.subtotal = subtotal;
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

    public int getValor_iva() {
        return valor_iva;
    }

    public int getDescuento() {
        return descuento;
    }

    public int getSubtotal() {
        return subtotal;
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

    public void setValor_iva(int valor_iva) {
        this.valor_iva = valor_iva;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
    
    
}
