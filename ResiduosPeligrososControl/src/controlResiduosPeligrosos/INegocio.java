/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlResiduosPeligrosos;

import java.util.List;
import objetosNegocio.Quimico;
import objetosNegocio.Residuo;

/**
 *
 * @author giova
 * 
 * Todos los metodos a llamar del proyecto
 */
public interface INegocio {
    
    //agregar
    
    public boolean agregarQuimico(Quimico quimico);
    public boolean agregarResiduo(Residuo residuo);
    
    
    //Consultar todos
    public List<Quimico> consultarTodosQuimicos();
    public List<Residuo> consultarTodosResiduos();
}