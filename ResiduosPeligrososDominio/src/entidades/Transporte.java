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
public class Transporte extends Empresa{
    private List<ObjectId> idsVehiculos;

    public Transporte() {
    }

    public Transporte(String nombre, String contrasenia) {
        super(nombre, contrasenia);
    }

    public Transporte(ObjectId id, String nombre, String contrasenia) {
        super(id, nombre, contrasenia);
    }

    public Transporte(List<ObjectId> idsVehiculos, ObjectId id, String nombre, String contrasenia) {
        super(id, nombre, contrasenia);
        this.idsVehiculos = idsVehiculos;
    }

    public Transporte(List<ObjectId> idsVehiculos, String nombre, String contrasenia) {
        super(nombre, contrasenia);
        this.idsVehiculos = idsVehiculos;
    }

    public List<ObjectId> getIdsVehiculos() {
        return idsVehiculos;
    }

    public void setIdsVehiculos(List<ObjectId> idsVehiculos) {
        this.idsVehiculos = idsVehiculos;
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
    
    public void addIdsVehiculos(ObjectId idVehiculo){
        if(this.idsVehiculos == null){
            this.idsVehiculos = new ArrayList<>();
        }
        this.idsVehiculos.add(idVehiculo);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.idsVehiculos);
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
        final Transporte other = (Transporte) obj;
        return Objects.equals(this.idsVehiculos, other.idsVehiculos);
    }

    @Override
    public String toString() {
        return nombre;
    }


    
    
}
