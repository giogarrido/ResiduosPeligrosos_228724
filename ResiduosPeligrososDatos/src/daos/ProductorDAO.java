/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import entidades.Productor;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author giova
 */
public class ProductorDAO extends DAOsBase<Productor>{
    
    private MongoDatabase baseDatos;
    
    public ProductorDAO(){
        this.baseDatos=ConexionBD.getConexionBD();
    }
    
    private MongoCollection getColeccion() {
        return this.baseDatos.getCollection("productores", Productor.class);
    }

    @Override
    protected boolean agregar(Productor productor) {
        try {
            MongoCollection<Productor> coleccion = this.getColeccion();
            coleccion.insertOne(productor);
            return true;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudeo agregar el productor");
            ex.printStackTrace();
            return false;
        }}

    @Override
    protected List<Productor> consultarTodos() {
        try {
            MongoCollection<Productor> coleccion = this.getColeccion();
            List<Productor> listaProductores = new LinkedList<>();
            coleccion.find().into(listaProductores);
            return listaProductores;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar los productores ");
            ex.printStackTrace();
            return null;
        }}

    @Override
    protected boolean consultarExisteNombre(String nombreConsultar) {
        boolean existe=true;
        Productor productor=null;

        MongoCollection<Productor> coleccion = this.getColeccion();
        productor = coleccion.find(eq("nombre", nombreConsultar)).first();

        if(productor==null){
            existe=false;
        }
        return existe;
    }
    
    
    protected boolean agregarIdsResiduos(String nombre, ObjectId idResiduo){
        Productor productor;
        
        MongoCollection<Productor> coleccion = this.getColeccion();
        try{
        productor = coleccion.find(eq("nombre", nombre)).first();
        productor.addIdsResiduos(idResiduo);
        coleccion.updateOne(eq("nombre",nombre),new Document("$set",new Document("idsResiduos",productor.getIdsResiduos())));

        return true;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron agregar los vehículos ");
            ex.printStackTrace();
            return false;
    }
    }
    
    
}
