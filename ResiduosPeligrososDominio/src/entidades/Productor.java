/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author giova
 */
public class Productor extends Empresa {

    private ObjectId id;
    private List<ObjectId> idsResiduos;

    public Productor() {
    }

    public Productor(String nombre, String contrasenia) {
        super(nombre, contrasenia);
    }

    public Productor(ObjectId id, String nombre, String contrasenia) {
        super(nombre, contrasenia);
        this.id = id;
    }

    public Productor(List<ObjectId> idsResiduos, String nombre, String contrasenia) {
        super(nombre, contrasenia);
        this.idsResiduos = idsResiduos;
    }

    public Productor(ObjectId id, List<ObjectId> idsResiduos, String nombre, String contrasenia) {
        super(nombre, contrasenia);
        this.id = id;
        this.idsResiduos = idsResiduos;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<ObjectId> getIdsResiduos() {
        return idsResiduos;
    }

    public void setIdsResiduos(List<ObjectId> idsResiduos) {
        this.idsResiduos = idsResiduos;
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

    public void addIdsResiduos(ObjectId idResiduo) {
        if (this.idsResiduos == null) {
            this.idsResiduos = new ArrayList<>();
        }
        this.idsResiduos.add(idResiduo);
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Productor other = (Productor) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return nombre +" Productor{" + "id=" + id + ", idsResiduos=" + idsResiduos + '}';
    }
    
    

}
