package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuarios implements Serializable {

    @Id
    //Autoincrementa ID
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    String user;
    String nombreVendedor;
    String pass;

    public Usuarios() {
    }

    public Usuarios(int id, String user, String nombreVendedor, String pass) {
        this.id = id;
        this.user = user;
        this.nombreVendedor = nombreVendedor;
        this.pass = pass;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
