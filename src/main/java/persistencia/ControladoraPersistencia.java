
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Celulares;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    CelularesJpaController celJPA = new CelularesJpaController();

    public void guardar(Celulares cel) {
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
}
