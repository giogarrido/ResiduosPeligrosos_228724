/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import entidades.Administrador;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author giova
 */
public class AdministradorDAO extends DAOsBase<Administrador>{
    
    private MongoDatabase baseDatos;
    
    public AdministradorDAO(){
        this.baseDatos=ConexionBD.getConexionBD();
    }
    
    private MongoCollection getColeccion() {
        return this.baseDatos.getCollection("administradores", Administrador.class);
    }

    @Override
    protected boolean agregar(Administrador administrador) {
        try {
            MongoCollection<Administrador> coleccion = this.getColeccion();
            coleccion.insertOne(administrador);
            return true;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudeo agregar el administrador");
            ex.printStackTrace();
            return false;
        }}

    @Override
    protected List<Administrador> consultarTodos() {
        try {
            MongoCollection<Administrador> coleccion = this.getColeccion();
            List<Administrador> listaAdministradores = new LinkedList<>();
            coleccion.find().into(listaAdministradores);
            return listaAdministradores;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar los administradores ");
            ex.printStackTrace();
            return null;
        }}

    @Override
    protected boolean consultarExisteNombre(String nombreConsultar) {
        boolean existe=true;
        Administrador administrador=null;

        MongoCollection<Administrador> coleccion = this.getColeccion();
        administrador = coleccion.find(eq("nombre", nombreConsultar)).first();

        if(administrador==null){
            existe=false;
        }
        return existe;
    }
    
}
