/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Productor;
import java.util.List;
import entidades.Quimico;
import entidades.Residuo;

/**
 *
 * @author giova
 */
public class FDatos implements IDatos{

    private QuimicosDAO quimicosDAO;
    private ResiduosDAO residuosDAO;
    private ProductorDAO productorDAO;
    
    private QuimicosDAO getQuimicosDAO(){
        if(this.quimicosDAO!=null){
            return quimicosDAO;
        }else{
            this.quimicosDAO = new QuimicosDAO();
            return this.quimicosDAO;
        }
    }
    
    private ResiduosDAO getResiduosDAO(){
        if(this.residuosDAO!=null){
            return residuosDAO;
        }else{
            this.residuosDAO = new ResiduosDAO();
            return this.residuosDAO;
        }
    }
    
    private ProductorDAO getProductoresDAO(){
        if(this.productorDAO!=null){
            return productorDAO;
        }else{
            this.productorDAO = new ProductorDAO();
            return this.productorDAO;
        }
    }

    @Override
    public boolean agregarQuimico(Quimico quimico) {
        
        return this.getQuimicosDAO().agregar(quimico);

    }

    @Override
    public boolean agregarResiduo(Residuo residuo) {
        
        return this.getResiduosDAO().agregar(residuo);
    }

    @Override
    public List<Quimico> consultarTodosQuimicos() {
        return this.getQuimicosDAO().consultarTodos();
    }

    @Override
    public List<Residuo> consultarTodosResiduos() {
        return this.getResiduosDAO().consultarTodos();
    }

    @Override
    public boolean consultarExisteNombreQuimico(String nombreConsultar) {
        return this.getQuimicosDAO().consultarExisteNombre(nombreConsultar);
    }

    @Override
    public boolean consultarExisteClaveResiduo(Integer claveConsultar) {
        return this.getResiduosDAO().consultarExisteClaveResiduo(claveConsultar);
    }

    @Override
    public boolean consultarExisteNombreResiduo(String nombreConsultar) {
        return this.getResiduosDAO().consultarExisteNombre(nombreConsultar);

    }

    @Override
    public boolean agregarProductor(Productor productor) {
        return this.getProductoresDAO().agregar(productor);
    }

    @Override
    public List<Productor> consultarTodosProductores() {
        return this.getProductoresDAO().consultarTodos();
    }

    @Override
    public boolean consultarExisteNombreProductor(String nombreConsultar) {

        return this.getProductoresDAO().consultarExisteNombre(nombreConsultar);
    }
   
    
    
}
