
package daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import objetosNegocio.Residuo;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author giova
 */
public class ResiduosDAO extends DAOsBase<Residuo>{

   
    private MongoDatabase baseDatos;

    public ResiduosDAO() {

        this.baseDatos = ConexionBD.getConexionBD();
    }
    
    private MongoCollection getColeccion() {
        return this.baseDatos.getCollection("residuos", Residuo.class);
    }
    
    @Override
    public boolean agregar(Residuo residuo) {
        try {
            MongoCollection<Residuo> coleccion = this.getColeccion();
            coleccion.insertOne(residuo);
            return true;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudeo agregar el residuo");
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Residuo> consultarTodos() {
        try {
            MongoCollection<Residuo> coleccion = this.getColeccion();
            List<Residuo> listaQuimicos = new LinkedList<>();
            coleccion.find().into(listaQuimicos);
            return listaQuimicos;
        }catch(IllegalStateException ex){
            System.err.println("No se pudieron consultar los residuos ");
            ex.printStackTrace();
            return null;
        }
    }
    
}
