package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Celulares;
import logica.Productos;
import logica.Usuarios;
import logica.VentasCelulares;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    CelularesJpaController celJPA = new CelularesJpaController();
    VentasCelularesJpaController ventaCelJPA = new VentasCelularesJpaController();
    UsuariosJpaController userJPA = new UsuariosJpaController();
    
    ProductosJpaController productoJPA = new ProductosJpaController();
    
    
    
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

    //Trae todo el listado de ventas de celulares
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
    
    
    //Usuarios
    public void guardarUsuarior(Usuarios user) {
        //Crear en la BD un registro de celular
        userJPA.create(user);
    }
    
    public List<Usuarios> traerUsuarios() {
        return userJPA.findUsuariosEntities();
    }
    
    
    
    //Productos
     public void guardarProducto(Productos producto) {
        //Crear en la BD un registro de celular
        productoJPA.create(producto);
    }

    //Trae todo el listado de ventas de celulares
    public List<Productos> traerProductos() {
        return productoJPA.findProductosEntities();
    }

    public void eliminarProductos(int id_Prod) {
        try {
            productoJPA.destroy(id_Prod);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Productos traerProductoBuscado(int id) {
        return productoJPA.findProductos(id);
    }

    public void modificarProductos(Productos producto) {
        try {
            productoJPA.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    


}
