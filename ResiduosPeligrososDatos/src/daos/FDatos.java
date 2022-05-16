/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import java.util.List;
import objetosNegocio.Quimico;
import objetosNegocio.Residuo;

/**
 *
 * @author giova
 */
public class FDatos implements IDatos{

    private QuimicosDAO quimicosDAO;
    private ResiduosDAO residuosDAO;
    
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
   
    
    
}
