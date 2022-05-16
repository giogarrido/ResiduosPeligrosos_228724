
package objetosNegocio;

import java.util.Objects;
import org.bson.types.ObjectId;



/**
 *
 * @author giova
 */
public class Empresa {
    
    protected ObjectId id;
    protected String nombre;
    protected String contrasenia;

    public Empresa() {
    }

    public Empresa(String nombre, String contrasenia) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public Empresa(ObjectId id, String nombre, String contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombre=" + nombre + ", contrasenia=" + contrasenia + '}';
    }
    
    
    
    
    


    
    
}
