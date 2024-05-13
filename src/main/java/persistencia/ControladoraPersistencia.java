package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Celulares;
import logica.VentasCelulares;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    CelularesJpaController celJPA = new CelularesJpaController();
    VentasCelularesJpaController ventaCelJPA = new VentasCelularesJpaController();

    //Celulares
    public void guardarCelular(Celulares cel) {
        //Crear en la BD un registro de celular
        celJPA.create(cel);
    }

    //Trae todo el listado de celulares
    public List<Celulares> traerCelulares() {
        return celJPA.findCelularesEntities();
    }

    public void eliminarCelular(int id_Cel) {
        try {
            celJPA.destroy(id_Cel);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Celulares traerCelularBuscado(int id_Cel) {
        return celJPA.findCelulares(id_Cel);
    }

    public void modificarCelular(Celulares cel) {
        try {
            celJPA.edit(cel);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Ventas Celulares
    public void guardarVentaCelular(VentasCelulares ventaCel) {
        //Crear en la BD un registro de celular
        ventaCelJPA.create(ventaCel);
    }

    //Trae todo el listado de celulares
    public List<VentasCelulares> traerVentaCelulares() {
        return ventaCelJPA.findVentasCelularesEntities();
    }

    public void eliminarVentaCelular(int id_Cel) {
        try {
            ventaCelJPA.destroy(id_Cel);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public VentasCelulares traerVentaCelularBuscado(int id_Cel) {
        return ventaCelJPA.findVentasCelulares(id_Cel);
    }

    public void modificarCelular(VentasCelulares cel) {
        try {
            ventaCelJPA.edit(cel);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
