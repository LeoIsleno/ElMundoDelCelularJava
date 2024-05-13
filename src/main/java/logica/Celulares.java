package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Declaramos clase entidad para la persistencia
@Entity
public class Celulares implements Serializable {

    @Id
    //Autoincrementa ID
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombreDisp;
    private String marca;
    private String almacenamiento;
    private String ram;
    private String costo;
    private String precio;
    private String estado;

    public Celulares() {
    }

    public Celulares(int id, String nombreDisp, String marca, String almacenamiento, String ram, String costo, String precio, String estado) {
        this.id = id;
        this.nombreDisp = nombreDisp;
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.costo = costo;
        this.precio = precio;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDisp() {
        return nombreDisp;
    }

    public void setNombreDisp(String nombreDisp) {
        this.nombreDisp = nombreDisp;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
