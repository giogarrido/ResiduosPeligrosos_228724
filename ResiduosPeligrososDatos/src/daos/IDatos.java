/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import java.util.List;
import entidades.Quimico;
import entidades.Residuo;

/**
 *
 * @author giova
 */
public interface IDatos {
    
    
    //AGREGAR
    
    public boolean agregarQuimico (Quimico quimico);
    public boolean agregarResiduo (Residuo residuo);
    
    
    //BUSCAR TODOS
     public List<Quimico> consultarTodosQuimicos();
     public List<Residuo> consultarTodosResiduos();
     
     //CONSULTAR SI EXISTE ALGUN NOMBRE
     public boolean consultarExisteNombreQuimico(String nombreConsultar);  
     
     //CONCULTAR SI EXISTE CLAVE RESIDUO
     public boolean consultarExisteClaveResiduo(Integer clave);
     
     //CONSULTAR SI EXISTE NOMBRE RESIDUO
     public boolean consultarExisteNombreResiduo(String nombreConsultar);
}
