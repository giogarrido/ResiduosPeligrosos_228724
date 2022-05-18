
package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;



/**
 *
 * @author giova
 */
public class Quimico {
    
    private ObjectId id;
    private String nombre;

    public Quimico() {
    }

    public Quimico(String nombre) {
        this.nombre = nombre;
    }

    public Quimico(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nombre);
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
        final Quimico other = (Quimico) obj;
        return Objects.equals(this.nombre, other.nombre);
    }



    @Override
    public String toString() {
        return "Quimico{" + "nombre=" + nombre + '}';
    }
    
    
    
    

    
    
}
