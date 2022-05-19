/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.SolicitudTraslado;
import java.util.List;

/**
 *
 * @author giova
 */
public class SolicitudTrasladoDAO extends DAOsBase<SolicitudTraslado>{
    
    private MongoDatabase baseDatos;
    
    public SolicitudTrasladoDAO(){
        this.baseDatos = ConexionBD.getConexionBD();
    }
    
    private MongoCollection getColeccion() {
        return this.baseDatos.getCollection("solicitudTraslado", SolicitudTraslado.class);
        
    }

    @Override
    protected boolean agregar(SolicitudTraslado solicitudTraslado) {
                try {
            MongoCollection<SolicitudTraslado> coleccion = this.getColeccion();
            coleccion.insertOne(solicitudTraslado);
            return true;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudo agregar la solicitud");
            ex.printStackTrace();
            return false;
        }

    
    }

    @Override
    protected List<SolicitudTraslado> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected boolean consultarExisteNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
