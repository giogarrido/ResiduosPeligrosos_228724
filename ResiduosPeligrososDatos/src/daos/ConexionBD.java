/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author giova
 */
public class ConexionBD { //implements IConexionBD{

    private static MongoDatabase conexionBD = null;

    private ConexionBD() {

        String HOST = "localhost";
        int PUERTO = 27017;
        String BASE_DATOS = "ResiduosPeligrosos";

        try {
            //CONFIGURACIÓN PARA QUE MONGODRIVE REALICE EL MAPEO DE POJOS AUMATICAMENTE

            //QUE CONSIDERE CLASES POJO DENTRO DE LOS CODEC 
            CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());

            //QUE INCLUYA CODEC POR DEFAULT
            CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);

            //CREAR CONEXIONA INSTANCIA LOCAL. PUEDE SER OTRA CAMBIANDO EL VALOR DE "HOST"
            ConnectionString cadenaConexion = new ConnectionString("mongodb://" + HOST + "/" + PUERTO);

            MongoClientSettings clientsSettings = MongoClientSettings.builder()
                    .applyConnectionString(cadenaConexion)
                    .codecRegistry(codecRegistry)
                    .build();

            MongoClient clienteMongo = MongoClients.create(clientsSettings);

            conexionBD = clienteMongo.getDatabase(BASE_DATOS);

            //return baseDatos;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            //return null;
        }

    }//end class conexion
    
    public static MongoDatabase getConexionBD(){
        
        if (conexionBD == null){
            new ConexionBD();
        }
        return conexionBD;
        
    }
        

}
