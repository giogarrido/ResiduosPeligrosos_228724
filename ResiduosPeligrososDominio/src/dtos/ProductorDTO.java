
package dtos;

import entidades.Residuo;
import java.util.List;
import java.util.Objects;
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

    @Override
    public String toString() {
        return "ProductorDTO{" + "id=" + id + ", nombre=" + nombre + ", residuos=" + residuos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductorDTO other = (ProductorDTO) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
    
    
}
