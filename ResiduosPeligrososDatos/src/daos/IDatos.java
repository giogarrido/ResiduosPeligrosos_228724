/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import java.util.List;
import objetosNegocio.Quimico;
import objetosNegocio.Residuo;

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
}
