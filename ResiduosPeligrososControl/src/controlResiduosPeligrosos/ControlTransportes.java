/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlResiduosPeligrosos;

import daos.FabricaD;
import daos.IDatos;
import entidades.Transporte;
import java.util.List;

/**
 *
 * @author giova
 */
public class ControlTransportes {

    public IDatos datos = FabricaD.fabricaDatos();
    
    public boolean agregarTransporte (Transporte transporte){
        return this.datos.agregarTransporte(transporte);
    }
    
    public List<Transporte> consultarTodosTransportes(){
        return this.datos.consultarTodosTransportes();
    }
    
    public boolean consultarExisteNombreTransporte(String nombreConsultar){
        return this.datos.consultarExisteNombreTransporte(nombreConsultar);
    }
}
