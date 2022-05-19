/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlResiduosPeligrosos;

import entidades.*;
import java.util.List;
import org.bson.types.ObjectId;


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
    public boolean agregarAdministrador(Administrador administrador);
    public boolean agregarVehiculo(Vehiculo vehiculo);
    public boolean agregarTrasnporte (Transporte transporte);
    
    
    //Consultar todos
    public List<Quimico> consultarTodosQuimicos();
    public List<Residuo> consultarTodosResiduos();
    public List<Productor> consultarTodosProductores();
    public List<Administrador> consultarTodosAdministradores();
    public List<Vehiculo> consultarTodosVehiculos();
    public List<Transporte> consultarTodosTrasnportes();
    
    //Consultar si existe nombre
    public boolean consultarExisteNombreQuimico(String nombreConsultar);
    public boolean consultarExisteNombreResiduo(String nombreConsultar);
    public boolean consultarExisteNombreProductor(String nombreConsultar);
    public boolean consultarExisteNombreAdministrador(String nombreConsultar);
    public boolean consultarExistePlacaVehiculo(String placaConsultar);
    public boolean consultarExisteNombretrasnporte(String nombreConsultar);
    
    
     //CONCULTAR SI EXISTE CLAVE RESIDUO
     public boolean consultarExisteClave(Integer claveConsultar);
     public ObjectId obtenerIDVehiculo(String placa);
     
     //AGREGAR ID VEHICULOS
     public boolean agregarIdsVehiculo(String nombre, ObjectId idVehiculo);

}
