/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlResiduosPeligrosos;

import entidades.*;
import java.util.List;
import org.bson.types.ObjectId;


/**
 *
 * @author giova
 */
public class FNegocios implements INegocio{
    
    private ControlQuimicos controlQuimicos;
    private ControlResiduos controlResiduos;
    private ControlProductores controlProductores;
    private ControlAdministradores controlAdministradores;
    private ControlVehiculos controlVehiculos;
    private ControlTransportes controlTransportes;

    public FNegocios() {
    }
    
    
    private ControlQuimicos getControlQuimicos(){
        if (this.controlQuimicos !=null){
            return controlQuimicos;
        }else{
            this.controlQuimicos = new ControlQuimicos();
            return this.controlQuimicos;
        }
    }
    
    private ControlResiduos getControlResiduos(){
        if (this.controlResiduos!= null){
            return controlResiduos;
        }else{
            this.controlResiduos = new ControlResiduos();
            return this.controlResiduos;
        }
    }
    
    private ControlProductores getControlProductores(){
        if (this.controlProductores!= null){
            return controlProductores;
        }else{
            this.controlProductores = new ControlProductores();
            return this.controlProductores;
        }
    }
    
    private ControlAdministradores getControlAdministradores(){
        if (this.controlAdministradores!= null){
            return controlAdministradores;
        }else{
            this.controlAdministradores = new ControlAdministradores();
            return this.controlAdministradores;
        }
    }
    
    private ControlVehiculos getControlVehiculos(){
        if (this.controlVehiculos!= null){
            return controlVehiculos;
        }else{
            this.controlVehiculos = new ControlVehiculos();
            return this.controlVehiculos;
        }
    }
    
    private ControlTransportes getControlTransportes(){
        if (this.controlTransportes!= null){
            return controlTransportes;
        }else{
            this.controlTransportes = new ControlTransportes();
            return this.controlTransportes;
        }
    }

    @Override
    public boolean agregarQuimico(Quimico quimico) {
        try{
            return this.getControlQuimicos().agregarQuimico(quimico);
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        return false;

    }

    @Override
    public List<Quimico> consultarTodosQuimicos() {
        
        return this.getControlQuimicos().consultarTodosQuimicos();
    }

    @Override
    public boolean agregarResiduo(Residuo residuo) {
        try{
            return this.getControlResiduos().agregarResiduo(residuo);
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<Residuo> consultarTodosResiduos() {
        
        return this.getControlResiduos().consultarTodosResiduos();
    }

    @Override
    public boolean consultarExisteNombreQuimico(String nombreConsultar) {
        return this.getControlQuimicos().consultarExisteNombreQuimico(nombreConsultar);

    }

    @Override
    public boolean consultarExisteClave(Integer claveConsultar) {
        return this.getControlResiduos().consultarExisteClaveResiduo(claveConsultar);

    }

    @Override
    public boolean consultarExisteNombreResiduo(String nombreConsultar) {
        return this.getControlResiduos().consultarExisteNombreResiduo(nombreConsultar);

    }

    @Override
    public boolean agregarProductor(Productor productor) {
        return this.getControlProductores().agregarProductor(productor);

    }

    @Override
    public List<Productor> consultarTodosProductores() {
        return this.getControlProductores().consultarTodosProductores();
    }

    @Override
    public boolean consultarExisteNombreProductor(String nombreConsultar) {
        return this.getControlProductores().consultarExisteNombreProductor(nombreConsultar);
    }

    @Override
    public boolean agregarAdministrador(Administrador administrador) {
        return this.getControlAdministradores().agregarAdministrador(administrador);
    }

    @Override
    public List<Administrador> consultarTodosAdministradores() {
        return this.getControlAdministradores().consultarTodosAdministrador();

    }

    @Override
    public boolean consultarExisteNombreAdministrador(String nombreConsultar) {
        return this.getControlAdministradores().consultarExisteNombreAdministrador(nombreConsultar);
        
    }

    @Override
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        return this.getControlVehiculos().agregarVehiculo(vehiculo);
    }

    @Override
    public List<Vehiculo> consultarTodosVehiculos() {
        return this.getControlVehiculos().consultarTodosVehiculos();

    }

    @Override
    public boolean consultarExistePlacaVehiculo(String placaConsultar) {
        return this.getControlVehiculos().consultarExistePlacaVehiculo(placaConsultar);
    }

    @Override
    public boolean agregarTrasnporte(Transporte transporte) {
        return this.getControlTransportes().agregarTransporte(transporte);
    }
        

    @Override
    public List<Transporte> consultarTodosTrasnportes() {
        return this.getControlTransportes().consultarTodosTransportes();
    }
        

    @Override
    public boolean consultarExisteNombretrasnporte(String nombreConsultar) {
        return this.getControlTransportes().consultarExisteNombreTransporte(nombreConsultar);
    }

    @Override
    public ObjectId obtenerIDVehiculo(String placa) {
        return this.getControlVehiculos().obtenerIDVehiculo(placa);

    }

    @Override
    public boolean agregarIdsVehiculo(String nombre, ObjectId idVehiculo) {
        return this.getControlTransportes().agregarIdsVehiculo(nombre, idVehiculo);

    }

    @Override
    public ObjectId obtenerIDResiduo(String nombre) {
        return this.getControlResiduos().obtenerIDResiduo(nombre);

    }

    @Override
    public boolean agregarIdsResiduos(String nombre, ObjectId idResiduo) {
    
        return this.getControlProductores().agregarIdsResiduos(nombre, idResiduo);
    }


        
    
}
