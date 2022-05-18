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
public class Productor extends Empresa{
    
    private List<Residuo>residuos;

    public Productor() {
    }

    public Productor(String nombre, String contrasenia) {
        super(nombre, contrasenia);
    }
    
    

    public Productor(String nombre, String contrasenia,List<Residuo> residuos) {
        super(nombre, contrasenia);
        this.residuos = residuos;
    }

    public Productor( ObjectId id, String nombre, String contrasenia, List<Residuo> residuos) {
        super(id, nombre, contrasenia);
        this.residuos = residuos;
    }

    public List<Residuo> getResiduos() {
        return residuos;
    }

    public void setResiduos(List<Residuo> residuos) {
        this.residuos = residuos;
    }

    @Override
    public String toString() {
        return id + nombre;
    }


    
    
    
    
    
}
