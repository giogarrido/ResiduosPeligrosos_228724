
package entidades;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;


/**
 *
 * @author giova
 */
public class Residuo {
    
    private ObjectId id;
    private int codigo;
    private String nombre;
    private List<Quimico>quimicos;

    public Residuo() {
    }

    public Residuo(String nombre) {
        this.nombre = nombre;
    }

    public Residuo(int codigo, String nombre, List<Quimico> quimicos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.quimicos = quimicos;
    }

    public Residuo(ObjectId id, int codigo, String nombre, List<Quimico> quimicos) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.quimicos = quimicos;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Quimico> getQuimicos() {
        return quimicos;
    }

    public void setQuimicos(List<Quimico> quimicos) {
        this.quimicos = quimicos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final Residuo other = (Residuo) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        //return "Residuo{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", quimicos=" + quimicos + '}';
   
        return nombre;
    }

    
  

    
    

    
    
    
}
