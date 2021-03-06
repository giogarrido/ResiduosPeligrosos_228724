/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import entidades.Quimico;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author giova
 */
public class QuimicosDAO extends DAOsBase<Quimico> {

    private MongoDatabase baseDatos;

    public QuimicosDAO() {

        this.baseDatos = ConexionBD.getConexionBD();
    }

    private MongoCollection getColeccion() {
        return this.baseDatos.getCollection("quimicos", Quimico.class);
    }

    @Override
    public boolean agregar(Quimico quimico) {

        try {
            MongoCollection<Quimico> coleccion = this.getColeccion();
            coleccion.insertOne(quimico);
            return true;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudo agregar el quimico");
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Quimico> consultarTodos() {

        try {
            MongoCollection<Quimico> coleccion = this.getColeccion();
            List<Quimico> listaQuimicos = new LinkedList<>();
            coleccion.find().into(listaQuimicos);
            return listaQuimicos;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar los quimicos ");
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    protected boolean consultarExisteNombre(String nombreConsultar) {
        boolean existe=true;
        Quimico quimico=null;

        MongoCollection<Quimico> coleccion = this.getColeccion();
        quimico = coleccion.find(eq("nombre", nombreConsultar)).first();

        if(quimico==null){
            existe=false;
        }
        return existe;

    }

}
