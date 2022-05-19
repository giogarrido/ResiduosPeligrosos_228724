/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlResiduosPeligrosos;

import daos.FabricaD;
import daos.IDatos;
import entidades.Vehiculo;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author giova
 */
public class ControlVehiculos {
    public IDatos datos = FabricaD.fabricaDatos();
    
    public boolean agregarVehiculo (Vehiculo vehiculo){
        return this.datos.agregarVehiculo(vehiculo);
    }
    
    public List<Vehiculo> consultarTodosVehiculos(){
        return this.datos.consultarTodosVehiculos();
    }
    
    public boolean consultarExistePlacaVehiculo(String placasConsultar){
        return this.datos.consultarExistePlacaVehiculo(placasConsultar);
    }
    
    public ObjectId obtenerIDVehiculo(String placa){
        return this.datos.obtenerIDVehiculo(placa);
    }
    
}
