package logica;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Celulares
    public void registrarCelular(String nombre, String marcaIndex, String almacenamientoIndex, String ramIndex, String costo, String precio, String estado, String imei) {
        Celulares cel = new Celulares();
        cel.setNombreDisp(nombre);
        cel.setMarca(marcaIndex);
        cel.setAlmacenamiento(almacenamientoIndex);
        cel.setRam(ramIndex);
        cel.setCosto(costo);
        cel.setPrecio(precio);
        cel.setEstado(estado);
        cel.setImei(imei);
        controlPersis.guardarCelular(cel);
    }

    public List<Celulares> traerCelulares() {
        return controlPersis.traerCelulares();
    }

    public void EliminarCel(int id_Cel) {
        controlPersis.eliminarCelular(id_Cel);
    }

    public Celulares traerCelularBuscado(int id_Cel) {
        return controlPersis.traerCelularBuscado(id_Cel);
    }

    public void actualizarCelular(Celulares cel, String nombre, String marcaIndex, String almacenamientoIndex, String ramIndex, String costo, String precio, String imeiCel) {
        cel.setNombreDisp(nombre);
        cel.setMarca(marcaIndex);
        cel.setAlmacenamiento(almacenamientoIndex);
        cel.setRam(ramIndex);
        cel.setCosto(costo);
        cel.setPrecio(precio);
        cel.setImei(imeiCel);

        controlPersis.modificarCelular(cel);
    }

    //Ventas
    
    public void registrarVenta(LocalDate fechaActual, String nombreCliente, String numTelefono, String userResponsable, String formaPago, Celulares cel, String valorDejado, String detalles) {

        VentasCelulares venta = new VentasCelulares();

        venta.setNombreCliente(nombreCliente);
        venta.setNumeroCliente(numTelefono);
        venta.setFechaVenta(Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        venta.setCelular(cel);
        venta.setResponsable(userResponsable);
        venta.setFormaPago(formaPago);
        venta.setDetalles(detalles);
        venta.setValorDejado(valorDejado);

        cel.setEstado("Vendido");

        controlPersis.modificarCelular(cel);

        controlPersis.guardarVentaCelular(venta);
    }

    public List<VentasCelulares> traerRegistrosVentas() {
        return controlPersis.traerVentaCelulares();
    }
    
    //Usuarios
    
    public List<Usuarios> getUsers(){
        return controlPersis.traerUsuarios();
    }

    public void guardarUsuario(Usuarios user) {
        controlPersis.guardarUsuarior(user);
    }
}
