/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlResiduosPeligrosos;

import daos.FabricaD;
import daos.IDatos;
import java.util.List;
import objetosNegocio.Residuo;

/**
 *
 * @author giova
 */
public class ControlResiduos {
    
    public IDatos datos= FabricaD.fabricaDatos();
    
    public boolean agregarResiduo(Residuo residuo){
        return this.datos.agregarResiduo(residuo);
    }
    
    public List<Residuo> consultarTodosResiduos(){
        return this.datos.consultarTodosResiduos();
    }
    
     //CONCULTAR SI EXISTE CLAVE RESIDUO
     public boolean consultarExisteClaveResiduo(Integer claveConsultar){
         return this.datos.consultarExisteClaveResiduo(claveConsultar);
     }
     
     //CONSULTAR SI EXISTE NOMBRE RESIDUO
     public boolean consultarExisteNombreResiduo(String nombreConsultar){
         return this.datos.consultarExisteNombreResiduo(nombreConsultar);
     }
}
