/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlResiduosPeligrosos;

import entidades.Productor;
import java.util.List;
import entidades.Quimico;
import entidades.Residuo;

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
    public boolean agregarProductor(Productor productor);
    
    
    //Consultar todos
    public List<Quimico> consultarTodosQuimicos();
    public List<Residuo> consultarTodosResiduos();
    public List<Productor> consultarTodosProductores();
    
    //Consultar si existe nombre
    public boolean consultarExisteNombreQuimico(String nombreConsultar);
    public boolean consultarExisteNombreResiduo(String nombreConsultar);
    public boolean consultarExisteNombreProductor(String nombreConsultar);
    
    
     //CONCULTAR SI EXISTE CLAVE RESIDUO
     public boolean consultarExisteClave(Integer claveConsultar);

}
