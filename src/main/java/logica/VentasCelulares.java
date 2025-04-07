package logica;

//Declaramos clase entidad para la persistencia
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class VentasCelulares implements Serializable {

    @Id
    //Autoincrementa ID
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date fechaVenta;

    private String nombreCliente;
    private String numeroCliente;
    private String responsable;
    private String formaPago;
    private String valorDejado;
    private String detalles;
    private String funda;
    private String vidrio;
    private String cargador;

    
    @OneToOne
    private Celulares celular;

    public VentasCelulares() {
    }

    public VentasCelulares(int id, Date fechaVenta, String nombreCliente, String numeroCliente, String responsable, String formaPago, String valorDejado, String detalles, String funda, String vidrio, String cargador, Celulares celular) {
        this.id = id;
        this.fechaVenta = fechaVenta;
        this.nombreCliente = nombreCliente;
        this.numeroCliente = numeroCliente;
        this.responsable = responsable;
        this.formaPago = formaPago;
        this.valorDejado = valorDejado;
        this.detalles = detalles;
        this.funda = funda;
        this.vidrio = vidrio;
        this.cargador = cargador;
        this.celular = celular;
    }

    public String getFunda() {
        return funda;
    }

    public void setFunda(String funda) {
        this.funda = funda;
    }

    public String getVidrio() {
        return vidrio;
    }

    public void setVidrio(String vidrio) {
        this.vidrio = vidrio;
    }

    public String getCargador() {
        return cargador;
    }

    public void setCargador(String cargador) {
        this.cargador = cargador;
    }

    

    public String getValorDejado() {
        return valorDejado;
    }

    public void setValorDejado(String valorDejado) {
        this.valorDejado = valorDejado;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Celulares getCelular() {
        return celular;
    }

    public void setCelular(Celulares celular) {
        this.celular = celular;
    }
}
