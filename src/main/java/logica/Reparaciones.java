package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class Reparaciones implements Serializable {

    @Id
    //Autoincrementa ID
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String Nombre;
    private String Numero;
    private String Descripcion;
    private String EquipoEncendido;
    private String ModuloSano;
    private String SIM;
    private String BandejaSim;
    private String Bateria;
    private String Tapa;
    private String ReparacionRealizada;
    private boolean entregado;
    

    private int reparado;
    
    private String observaciones;
    private String FormaPago;
    private int CostoRepuesto;
    private int Total;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date FechaIngreso;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date FechaRetiro;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date FechaRetiroReal;
    
    public String getBateria() {
        return Bateria;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public int getReparado() {
        return reparado;
    }

    public void setReparado(int reparado) {
        this.reparado = reparado;
    }

    

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setBateria(String Bateria) {
        this.Bateria = Bateria;
    }

    public Reparaciones() {

    }

    public Date getFechaRetiroReal() {
        return FechaRetiroReal;
    }

    public void setFechaRetiroReal(Date FechaRetiroReal) {
        this.FechaRetiroReal = FechaRetiroReal;
    }

    public Reparaciones(int id, String Nombre, String Numero, String Descripcion, String EquipoEncendido, String ModuloSano, String SIM, String BandejaSim, String Bateria, String Tapa, String ReparacionRealizada, boolean entregado, int reparado, String observaciones, String FormaPago, int CostoRepuesto, int Total, Date FechaIngreso, Date FechaRetiro, Date FechaRetiroReal) {
        this.id = id;
        this.Nombre = Nombre;
        this.Numero = Numero;
        this.Descripcion = Descripcion;
        this.EquipoEncendido = EquipoEncendido;
        this.ModuloSano = ModuloSano;
        this.SIM = SIM;
        this.BandejaSim = BandejaSim;
        this.Bateria = Bateria;
        this.Tapa = Tapa;
        this.ReparacionRealizada = ReparacionRealizada;
        this.entregado = entregado;
        this.reparado = reparado;
        this.observaciones = observaciones;
        this.FormaPago = FormaPago;
        this.CostoRepuesto = CostoRepuesto;
        this.Total = Total;
        this.FechaIngreso = FechaIngreso;
        this.FechaRetiro = FechaRetiro;
        this.FechaRetiroReal = FechaRetiroReal;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getEquipoEncendido() {
        return EquipoEncendido;
    }

    public void setEquipoEncendido(String EquipoEncendido) {
        this.EquipoEncendido = EquipoEncendido;
    }

    public String getModuloSano() {
        return ModuloSano;
    }

    public void setModuloSano(String ModuloSano) {
        this.ModuloSano = ModuloSano;
    }

    public String getSIM() {
        return SIM;
    }

    public void setSIM(String SIM) {
        this.SIM = SIM;
    }

    public String getBandejaSim() {
        return BandejaSim;
    }

    public void setBandejaSim(String BandejaSim) {
        this.BandejaSim = BandejaSim;
    }

    public String getTapa() {
        return Tapa;
    }

    public void setTapa(String Tapa) {
        this.Tapa = Tapa;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public Date getFechaRetiro() {
        return FechaRetiro;
    }

    public void setFechaRetiro(Date FechaRetiro) {
        this.FechaRetiro = FechaRetiro;
    }

    public String getReparacionRealizada() {
        return ReparacionRealizada;
    }

    public void setReparacionRealizada(String ReparacionRealizada) {
        this.ReparacionRealizada = ReparacionRealizada;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }

    public int getCostoRepuesto() {
        return CostoRepuesto;
    }

    public void setCostoRepuesto(int CostoRepuesto) {
        this.CostoRepuesto = CostoRepuesto;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

}
