/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlResiduosPeligrosos;

import daos.FabricaD;
import daos.IDatos;
import entidades.SolicitudTraslado;

/**
 *
 * @author giova
 */
public class ControlSolicitudTraslado {
    
    public IDatos datos= FabricaD.fabricaDatos();
    
    public boolean agregarSolicitudTraslado(SolicitudTraslado solicitudTraslado){
        return this.datos.agregarSolicitudTraslado(solicitudTraslado);
    }
    

    
}
