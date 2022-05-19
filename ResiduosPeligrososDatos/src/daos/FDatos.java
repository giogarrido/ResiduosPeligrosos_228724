/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import dtos.ProductorDTO;
import entidades.Administrador;
import entidades.Productor;
import java.util.List;
import entidades.*;
import org.bson.types.ObjectId;

/**
 *
 * @author giova
 */
public class FDatos implements IDatos{

    private QuimicosDAO quimicosDAO;
    private ResiduosDAO residuosDAO;
    private ProductorDAO productorDAO;
    private AdministradorDAO administradorDAO;
    private VehiculosDAO vehiculosDAO;
    private TransportesDAO transportesDAO;
    private SolicitudTrasladoDAO solicitudTrasladoDAO;
    
    private QuimicosDAO getQuimicosDAO(){
        if(this.quimicosDAO!=null){
            return quimicosDAO;
        }else{
            this.quimicosDAO = new QuimicosDAO();
            return this.quimicosDAO;
        }
    }
    
    private ResiduosDAO getResiduosDAO(){
        if(this.residuosDAO!=null){
            return residuosDAO;
        }else{
            this.residuosDAO = new ResiduosDAO();
            return this.residuosDAO;
        }
    }
    
    private ProductorDAO getProductoresDAO(){
        if(this.productorDAO!=null){
            return productorDAO;
        }else{
            this.productorDAO = new ProductorDAO();
            return this.productorDAO;
        }
    }
    
    private AdministradorDAO getAdministradorDAO(){
        if(this.administradorDAO!=null){
            return administradorDAO;
        }else{
            this.administradorDAO = new AdministradorDAO();
            return this.administradorDAO;
        }
    }
    
    private VehiculosDAO getVehiculoDAO(){
        if(this.vehiculosDAO!=null){
            return vehiculosDAO;
        }else{
            this.vehiculosDAO = new VehiculosDAO();
            return this.vehiculosDAO;
        }
    }
    
    private TransportesDAO getTransportesDAO(){
        if(this.transportesDAO!=null){
            return transportesDAO;
        }else{
            this.transportesDAO = new TransportesDAO();
            return this.transportesDAO;
        }
    }
    
    private SolicitudTrasladoDAO getSolicitudTraslado(){
        if(this.solicitudTrasladoDAO!=null){
            return solicitudTrasladoDAO;
        }else{
            this.solicitudTrasladoDAO = new SolicitudTrasladoDAO();
            return this.solicitudTrasladoDAO;
        }
    }

    @Override
    public boolean agregarQuimico(Quimico quimico) {
        
        return this.getQuimicosDAO().agregar(quimico);

    }

    @Override
    public boolean agregarResiduo(Residuo residuo) {
        
        return this.getResiduosDAO().agregar(residuo);
    }

    @Override
    public List<Quimico> consultarTodosQuimicos() {
        return this.getQuimicosDAO().consultarTodos();
    }

    @Override
    public List<Residuo> consultarTodosResiduos() {
        return this.getResiduosDAO().consultarTodos();
    }

    @Override
    public boolean consultarExisteNombreQuimico(String nombreConsultar) {
        return this.getQuimicosDAO().consultarExisteNombre(nombreConsultar);
    }

    @Override
    public boolean consultarExisteClaveResiduo(Integer claveConsultar) {
        return this.getResiduosDAO().consultarExisteClaveResiduo(claveConsultar);
    }

    @Override
    public boolean consultarExisteNombreResiduo(String nombreConsultar) {
        return this.getResiduosDAO().consultarExisteNombre(nombreConsultar);

    }

    @Override
    public boolean agregarProductor(Productor productor) {
        return this.getProductoresDAO().agregar(productor);
    }

    @Override
    public List<Productor> consultarTodosProductores() {
        return this.getProductoresDAO().consultarTodos();
    }

    @Override
    public boolean consultarExisteNombreProductor(String nombreConsultar) {

        return this.getProductoresDAO().consultarExisteNombre(nombreConsultar);
    }

    @Override
    public boolean agregarAdministrador(Administrador administrador) {
        return this.getAdministradorDAO().agregar(administrador);

    }

    @Override
    public List<Administrador> consultarTodosAdministradores() {
        return this.getAdministradorDAO().consultarTodos();
    }

    @Override
    public boolean consultarExisteNombreAdministrador(String nombreConsultar) {
        return this.getAdministradorDAO().consultarExisteNombre(nombreConsultar);
    }

    @Override
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        return this.getVehiculoDAO().agregar(vehiculo);
    }

    @Override
    public List<Vehiculo> consultarTodosVehiculos() {
        return this.getVehiculoDAO().consultarTodos();
    }

    @Override
    public boolean consultarExistePlacaVehiculo(String placas) {
        return this.getVehiculoDAO().consultarExisteNombre(placas);
    }

    @Override
    public boolean agregarTransporte(Transporte transporte) {
        return this.getTransportesDAO().agregar(transporte);

    }

    @Override
    public List<Transporte> consultarTodosTransportes() {
        return this.getTransportesDAO().consultarTodos();
    }

    @Override
    public boolean consultarExisteNombreTransporte(String nombreConsultar) {
        return this.getTransportesDAO().consultarExisteNombre(nombreConsultar);

    }

    @Override
    public ObjectId obtenerIDVehiculo(String placa) {
        return this.getVehiculoDAO().obtenerIDVehiculo(placa);

    }

    @Override
    public boolean agregarIdsVehiculo(String nombre, ObjectId idVehiculo) {
        return this.getTransportesDAO().agregarIdsVehiculo(nombre, idVehiculo);

    }

    @Override
    public ObjectId obtenerIDResiduo(String nombre) {
        return this.getResiduosDAO().obtenerIDResiduo(nombre);
    }

    @Override
    public boolean agregarIdsResiduos(String nombre, ObjectId idResiduo) {
        return this.getProductoresDAO().agregarIdsResiduos(nombre, idResiduo);
    }

    @Override
    public ProductorDTO consultarResiduos(String nombre) {
        return this.getProductoresDAO().consultarResiduos(nombre);
    }

    @Override
    public boolean agregarSolicitudTraslado(SolicitudTraslado solicitudTraslado) {
        return this.getSolicitudTraslado().agregar(solicitudTraslado);

    }
   
    
    
}
