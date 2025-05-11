package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetalleVentaProductos implements Serializable {

    @Id
    //Autoincrementa ID
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_detalleVenta;

    // Relación muchos a uno con VentaProductos
    @ManyToOne
    @JoinColumn(name = "id_venta")  // Aquí defines la clave foránea
    private VentaProductos venta;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Productos producto;

    public int getId() {
        return id_detalleVenta;
    }

    public int getId_detalleVenta() {
        return id_detalleVenta;
    }

    public void setId_detalleVenta(int id_detalleVenta) {
        this.id_detalleVenta = id_detalleVenta;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public DetalleVentaProductos(int id_detalleVenta, VentaProductos venta, Productos producto) {
        this.id_detalleVenta = id_detalleVenta;
        this.venta = venta;
        this.producto = producto;
    }

    public void setId(int id) {
        this.id_detalleVenta = id;
    }

    public DetalleVentaProductos(int id, VentaProductos venta) {
        this.id_detalleVenta = id;
        this.venta = venta;
    }

    public VentaProductos getVenta() {
        return venta;
    }

    public void setVenta(VentaProductos venta) {
        this.venta = venta;
    }

    public DetalleVentaProductos() {

    }

}
