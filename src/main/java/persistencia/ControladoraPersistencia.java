package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Celulares;
import logica.Productos;
import logica.Reparaciones;
import logica.Usuarios;
import logica.VentaProductos;
import logica.VentasCelulares;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    CelularesJpaController celJPA = new CelularesJpaController();
    VentasCelularesJpaController ventaCelJPA = new VentasCelularesJpaController();
    UsuariosJpaController userJPA = new UsuariosJpaController();

    ProductosJpaController productoJPA = new ProductosJpaController();
    VentaProductosJpaController ventaProductosJPA = new VentaProductosJpaController();
    
    ReparacionesJpaController reparacionesJPA = new ReparacionesJpaController();

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

    //Trae todo el listado de productos
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

    //Trae todo el listado de ventas de celulares
    public List<Productos> traerTodosProductos() {
        return productoJPA.findProductosEntities();
    }

    //Productos
    public void guardarVentaProductos(VentaProductos ventaProductos) {
        ventaProductosJPA.create(ventaProductos);
    }
    
    //Reparaciones de Equipos
    
    public void guardarReparacion(Reparaciones rep) {
        //Crear en la BD un registro de celular
        reparacionesJPA.create(rep);
    }

    //Trae todo el listado de celulares
    public List<Reparaciones> traerReparaciones() {
        return reparacionesJPA.findReparacionEntities();
    }

    public void eliminarReparaciones(int rep) {
        try {
            reparacionesJPA.destroy(rep);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    public Reparaciones traerReparacionBuscado(int id_Cel) {
        return reparacionesJPA.findReparacion(id_Cel);
    }

    public void modificarReparaciones(Reparaciones rep) {
        try {
            reparacionesJPA.edit(rep);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
}
