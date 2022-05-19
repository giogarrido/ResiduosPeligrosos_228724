/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import entidades.Vehiculo;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;
/**
 *
 * @author giova
 */
public class VehiculosDAO extends DAOsBase<Vehiculo>{
    
    private MongoDatabase baseDatos;


    public VehiculosDAO() {

        this.baseDatos = ConexionBD.getConexionBD();
    }

    private MongoCollection getColeccion() {
        return this.baseDatos.getCollection("vehiculos", Vehiculo.class);
    }

    @Override
    public boolean agregar(Vehiculo vehiculo) {

        try {
            MongoCollection<Vehiculo> coleccion = this.getColeccion();
            coleccion.insertOne(vehiculo);
            return true;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudo agregar el vehículo");
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Vehiculo> consultarTodos() {

        try {
            MongoCollection<Vehiculo> coleccion = this.getColeccion();
            List<Vehiculo> listaVehiculos = new LinkedList<>();
            coleccion.find().into(listaVehiculos);
            return listaVehiculos;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar los vehiculos ");
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    protected boolean consultarExisteNombre(String nombreConsultar) {
        boolean existe=true;
        Vehiculo vehiculo=null;

        MongoCollection<Vehiculo> coleccion = this.getColeccion();
        vehiculo = coleccion.find(eq("placas", nombreConsultar)).first();

        if(vehiculo==null){
            existe=false;
        }
        return existe;

    }
    
    protected ObjectId obtenerIDVehiculo(String placa){
        Vehiculo vehiculo;

        MongoCollection<Vehiculo> coleccion = this.getColeccion();
        vehiculo = coleccion.find(eq("placas", placa)).first();
        ObjectId idVehiculo = vehiculo.getId();
        
        return idVehiculo;
    }
    
}
