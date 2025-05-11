package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class VentaProductos implements Serializable {

    @Id
    //Autoincrementa ID
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date Fecha;

    // Relación uno a muchos con DetalleVentaProductos
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private List<DetalleVentaProductos> detallesVenta;

    String id_usuario;

    String forma_pago;

    String dniCliente;

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public VentaProductos() {
    }

    public VentaProductos(int id, Date Fecha, List<DetalleVentaProductos> detallesVenta, String id_usuario, String forma_pago, String dniCliente) {
        this.id = id;
        this.Fecha = Fecha;
        this.detallesVenta = detallesVenta;
        this.id_usuario = id_usuario;
        this.forma_pago = forma_pago;
        this.dniCliente = dniCliente;
    }

    public List<DetalleVentaProductos> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVentaProductos> detallesVenta) {
        this.detallesVenta = detallesVenta;
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
