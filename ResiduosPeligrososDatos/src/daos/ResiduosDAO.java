
package daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import objetosNegocio.Residuo;
import java.util.LinkedList;
import java.util.List;
import objetosNegocio.Quimico;

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
            List<Residuo> listaResiduos = new LinkedList<>();
            coleccion.find().into(listaResiduos);
            return listaResiduos;
        }catch(IllegalStateException ex){
            System.err.println("No se pudieron consultar los residuos ");
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    protected boolean consultarExisteNombre(String nombreConsultar) {
        boolean existe=true;
        Residuo residuo=null;

        MongoCollection<Residuo> coleccion = this.getColeccion();
        residuo = coleccion.find(eq("nombre", nombreConsultar)).first();

        if(residuo==null){
            existe=false;
        }
        return existe;
    }
    
    protected boolean consultarExisteClaveResiduo(Integer claveConsultar) {
        boolean existe=true;
        Residuo residuo=null;

        MongoCollection<Residuo> coleccion = this.getColeccion();
        residuo = coleccion.find(eq("codigo", claveConsultar)).first();

        if(residuo==null){
            existe=false;
        }
        return existe;
    }
    
    protected boolean consultarExisteComposicion(List<String> listaQuimicosConsultar ){
        boolean existe=true;
        MongoCollection<Residuo> coleccion = this.getColeccion();
        List<Quimico> listaQuimicos = new LinkedList<>();
        //coleccion.find().
        return existe;
    }
            
    
}
