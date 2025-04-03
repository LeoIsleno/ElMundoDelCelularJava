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
    private String Categoria;
    private int Costo;
    private int PrecioUnitario;

    public Productos() {
    }

    public Productos(int id, String Codigo, String Categoria, int Costo, int PrecioUnitario) {
        this.id = id;
        this.Codigo = Codigo;
        this.Categoria = Categoria;
        this.Costo = Costo;
        this.PrecioUnitario = PrecioUnitario;
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

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public int getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(int PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    
}
