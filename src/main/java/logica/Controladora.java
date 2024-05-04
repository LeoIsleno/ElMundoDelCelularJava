package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombre, String marcaIndex, String almacenamientoIndex, String ramIndex, String costo, String precio) {
        Celulares cel = new Celulares();
        cel.setNombreDisp(nombre);
        cel.setMarca(marcaIndex);
        cel.setAlmacenamiento(almacenamientoIndex);
        cel.setRam(ramIndex);
        cel.setCosto(costo);
        cel.setPrecio(precio);
        controlPersis.guardar(cel);
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

}
