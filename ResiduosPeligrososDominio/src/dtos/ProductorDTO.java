
package dtos;

import entidades.Residuo;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author giova
 */
public class ProductorDTO {
    
    private ObjectId id;
    private String nombre;
    private List<Residuo> residuos;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Residuo> getResiduos() {
        return residuos;
    }

    public void setResiduos(List<Residuo> residuos) {
        this.residuos = residuos;
    }
    
    
}
