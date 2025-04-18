package logica;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class VentaProductos {

    @Id
    //Autoincrementa ID
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date Fecha;

    String id_producto;  // Relación con productos vendidos

    String id_usuario;

    String forma_pago;

    public VentaProductos() {
    }

    public VentaProductos(int id, Date fechaVenta, String idproductos, String idUsuario, String formaPago) {
        this.id = id;
        this.Fecha = fechaVenta;
        this.id_producto = idproductos;
        this.id_usuario = idUsuario;
        this.forma_pago = formaPago;
    }

    public String getIdproductos() {
        return id_producto;
    }

    public void setIdproductos(String idproductos) {
        this.id_producto = idproductos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaVenta() {
        return Fecha;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.Fecha = fechaVenta;
    }

    public String getIdUsuario() {
        return id_usuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.id_usuario = idUsuario;
    }

    public String getFormaPago() {
        return forma_pago;
    }

    public void setFormaPago(String formaPago) {
        this.forma_pago = formaPago;
    }

}
