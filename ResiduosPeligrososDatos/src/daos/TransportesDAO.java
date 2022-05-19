
package daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import entidades.Transporte;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author giova
 */
public class TransportesDAO extends DAOsBase<Transporte>{

    private MongoDatabase baseDatos;
    
    public TransportesDAO(){
        this.baseDatos=ConexionBD.getConexionBD();
    }
    
    private MongoCollection getColeccion() {
        return this.baseDatos.getCollection("transportes", Transporte.class);
    }

    @Override
    protected boolean agregar(Transporte transporte) {
        try {
            MongoCollection<Transporte> coleccion = this.getColeccion();
            coleccion.insertOne(transporte);
            return true;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudo agregar el transporte");
            ex.printStackTrace();
            return false;
        }}

    @Override
    protected List<Transporte> consultarTodos() {
        try {
            MongoCollection<Transporte> coleccion = this.getColeccion();
            List<Transporte> listaTransportes = new LinkedList<>();
            coleccion.find().into(listaTransportes);
            return listaTransportes;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar los transportes ");
            ex.printStackTrace();
            return null;
        }}

    @Override
    protected boolean consultarExisteNombre(String nombreConsultar) {
        boolean existe=true;
        Transporte transporte=null;

        MongoCollection<Transporte> coleccion = this.getColeccion();
        transporte = coleccion.find(eq("nombre", nombreConsultar)).first();

        if(transporte==null){
            existe=false;
        }
        return existe;
    }
    
    protected boolean agregarIdsVehiculo(String nombre, ObjectId idVehiculo){
        Transporte transporte;
        
        MongoCollection<Transporte> coleccion = this.getColeccion();
        try{
        transporte = coleccion.find(eq("nombre", nombre)).first();
        transporte.addIdsVehiculos(idVehiculo);
        coleccion.updateOne(eq("nombre",nombre),new Document("$set",new Document("idsVehiculos",transporte.getIdsVehiculos())));

        return true;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron agregar los vehículos ");
            ex.printStackTrace();
            return false;
    }
    }
    
}
