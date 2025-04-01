package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Productos implements Serializable {
    @Id
    //Autoincrementa ID
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String Codigo;
    private String Fecha;
    private String Categoria;
    private String Descripcion;
    private int Costo;
    private int EnStock;
    private int PrecioUnitario;
    private int Inversion;

    public Productos() {
    }

    public Productos(int id, String Codigo, String Fecha, String Categoria, String Descripcion, int Costo, int EnStock, int PrecioUnitario, int Inversion) {
        this.id = id;
        this.Codigo = Codigo;
        this.Fecha = Fecha;
        this.Categoria = Categoria;
        this.Descripcion = Descripcion;
        this.Costo = Costo;
        this.EnStock = EnStock;
        this.PrecioUnitario = PrecioUnitario;
        this.Inversion = Inversion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public int getEnStock() {
        return EnStock;
    }

    public void setEnStock(int EnStock) {
        this.EnStock = EnStock;
    }

    public int getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(int PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public int getInversion() {
        return Inversion;
    }

    public void setInversion(int Inversion) {
        this.Inversion = Inversion;
    }
    
    
    
    
    
    
    
}
