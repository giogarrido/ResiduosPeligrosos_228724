/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlResiduosPeligrosos;

import daos.FabricaD;
import daos.IDatos;
import entidades.Productor;
import java.util.List;

/**
 *
 * @author giova
 */
public class ControlProductores {
    public IDatos datos = FabricaD.fabricaDatos();
    
    public boolean agregarProductor (Productor productor){
        return this.datos.agregarProductor(productor);
    }
    
    public List<Productor> consultarTodosProductores(){
        return this.datos.consultarTodosProductores();
    }
    
    public boolean consultarExisteNombreProductor(String nombreConsultar){
        return this.datos.consultarExisteNombreProductor(nombreConsultar);
    }
    
    
}
