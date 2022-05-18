/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author giova
 */
public class Transporte extends Empresa{
    private List<Vehiculo> vehiculos;

    public Transporte() {
    }

    public Transporte(String nombre, String contrasenia) {
        super(nombre, contrasenia);
    }

    public Transporte(ObjectId id, String nombre, String contrasenia) {
        super(id, nombre, contrasenia);
    }

    public Transporte(List<Vehiculo> vehiculos, ObjectId id, String nombre, String contrasenia) {
        super(id, nombre, contrasenia);
        this.vehiculos = vehiculos;
    }

    public Transporte(List<Vehiculo> vehiculos, String nombre, String contrasenia) {
        super(nombre, contrasenia);
        this.vehiculos = vehiculos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
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
    public String toString() {
        return nombre;

    }
    
    
}
