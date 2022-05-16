
package daos;

import com.mongodb.client.MongoDatabase;


/**
 *
 * @author giova
 */
public interface IConexionBD {
    public MongoDatabase crearConexion();
}
