/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlResiduosPeligrosos;

import daos.IDatos;
import daos.FabricaD;
import java.util.List;
import objetosNegocio.Quimico;

/**
 *
 * @author giova
 * 
 * Todos los metodos de los quimicos
 */
public class ControlQuimicos {
    public IDatos datos = FabricaD.fabricaDatos();
    
    public boolean agregarQuimico(Quimico quimico){
        return this.datos.agregarQuimico(quimico);
    }
    
    public List<Quimico> consultarTodosQuimicos(){
        return this.datos.consultarTodosQuimicos();
    }
}
