
package controlResiduosPeligrosos;

import daos.FabricaD;
import daos.IDatos;
import dtos.ProductorDTO;
import entidades.Productor;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author giova
 */
public class ControlProductores {
    public IDatos datos = FabricaD.fabricaDatos();
    
    public boolean agregarProductor (Productor productor){
        return this.datos.agregarProductor(productor);
    }
    
    public List<Productor> consultarTodosProductores(){
        return this.datos.consultarTodosProductores();
    }
    
    public boolean consultarExisteNombreProductor(String nombreConsultar){
        return this.datos.consultarExisteNombreProductor(nombreConsultar);
    }
    
    public boolean  agregarIdsResiduos(String nombre, ObjectId idResiduo){
        return this.datos.agregarIdsResiduos(nombre, idResiduo);
    }
    
    public ProductorDTO consultarResiduos (String nombre){
        return this.datos.consultarResiduos(nombre);
    }
    
    
}
