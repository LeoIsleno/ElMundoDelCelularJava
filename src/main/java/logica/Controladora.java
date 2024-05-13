package logica;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void registrarCelular(String nombre, String marcaIndex, String almacenamientoIndex, String ramIndex, String costo, String precio, String estado) {
        Celulares cel = new Celulares();
        cel.setNombreDisp(nombre);
        cel.setMarca(marcaIndex);
        cel.setAlmacenamiento(almacenamientoIndex);
        cel.setRam(ramIndex);
        cel.setCosto(costo);
        cel.setPrecio(precio);
        cel.setEstado(estado);
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

    public void actualizarCelular(Celulares cel, String nombre, String marcaIndex, String almacenamientoIndex,
            String ramIndex, String costo, String precio) {
        cel.setNombreDisp(nombre);
        cel.setMarca(marcaIndex);
        cel.setAlmacenamiento(almacenamientoIndex);
        cel.setRam(ramIndex);
        cel.setCosto(costo);
        cel.setPrecio(precio);

        controlPersis.modificarCelular(cel);
    }

    public void registrarVenta(LocalDate fechaActual,
            String nombreCliente, String numTelefono, String userResponsable, Celulares cel) {

        VentasCelulares venta = new VentasCelulares();

        venta.setNombreCliente(nombreCliente);
        venta.setNumeroCliente(numTelefono);
        venta.setFechaVenta(Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        venta.setCelular(cel);
        venta.setResponsable(userResponsable);

        cel.setEstado("Vendido");

        controlPersis.modificarCelular(cel);

        controlPersis.guardarVentaCelular(venta);
    }

}
