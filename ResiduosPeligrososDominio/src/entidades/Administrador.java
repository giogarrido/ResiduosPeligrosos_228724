/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author giova
 */
public class Administrador extends Empresa{
    
    private ObjectId id;

    public Administrador() {
    }

    public Administrador(String nombre, String contrasenia) {
        super(nombre, contrasenia);
    }

    public Administrador(ObjectId id, String nombre, String contrasenia) {
        super(nombre, contrasenia);
        this.id = id;
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
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final Administrador other = (Administrador) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return nombre + " Administrador{" + "id=" + id + '}';
    }
    
    
    
    
    
}

    