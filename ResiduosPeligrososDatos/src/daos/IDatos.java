/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import dtos.ProductorDTO;
import entidades.Productor;
import java.util.List;
import entidades.*;
import org.bson.types.ObjectId;

/**
 *
 * @author giova
 */
public interface IDatos {
    
    
    //AGREGAR
    
    public boolean agregarQuimico (Quimico quimico);
    public boolean agregarResiduo (Residuo residuo);
    public boolean agregarProductor (Productor productor);
    public boolean agregarAdministrador (Administrador administrador);
    public boolean agregarVehiculo (Vehiculo vehiculo);
    public boolean agregarTransporte (Transporte transporte);
    public boolean agregarSolicitudTraslado (SolicitudTraslado solicitudTraslado);
    
    
    //BUSCAR TODOS
     public List<Quimico> consultarTodosQuimicos();
     public List<Residuo> consultarTodosResiduos();
     public List<Productor> consultarTodosProductores();
     public List<Administrador> consultarTodosAdministradores();
     public List<Vehiculo> consultarTodosVehiculos();
     public List<Transporte> consultarTodosTransportes();
     
     //CONSULTAR SI EXISTE ALGUN NOMBRE
     public boolean consultarExisteNombreQuimico(String nombreConsultar);  
     public boolean consultarExisteNombreProductor(String nombreConsultar);  
     public boolean consultarExisteNombreResiduo(String nombreConsultar);
     public boolean consultarExisteNombreAdministrador(String nombreConsultar);
     public boolean consultarExistePlacaVehiculo(String placas);
     public boolean consultarExisteNombreTransporte(String nombreConsultar);
     
//CONCULTAR SI EXISTE CLAVE RESIDUO
     public boolean consultarExisteClaveResiduo(Integer clave);
     
     //Consultar ID
     public ObjectId obtenerIDVehiculo(String placa);
     public ObjectId obtenerIDResiduo(String nombre);
     
     //AGREGAR VEHICULO A TRANSPORTISTA
     public boolean agregarIdsVehiculo(String nombre, ObjectId idVehiculo);
     
     //AGREGAR RESIDUOS A PRODUCTOR
     public boolean agregarIdsResiduos(String nombre, ObjectId idResiduo);
     
     //CONSULTAR RESIDUOS DEL PRODUCTOR
     public ProductorDTO consultarResiduos (String nombre);


}
