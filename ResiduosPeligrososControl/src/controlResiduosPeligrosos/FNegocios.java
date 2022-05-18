/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlResiduosPeligrosos;

import entidades.Productor;
import java.util.List;
import entidades.Quimico;
import entidades.Residuo;

/**
 *
 * @author giova
 */
public class FNegocios implements INegocio{
    
    private ControlQuimicos controlQuimicos;
    private ControlResiduos controlResiduos;
    private ControlProductores controlProductores;

    public FNegocios() {
    }
    
    
    private ControlQuimicos getControlQuimicos(){
        if (this.controlQuimicos !=null){
            return controlQuimicos;
        }else{
            this.controlQuimicos = new ControlQuimicos();
            return this.controlQuimicos;
        }
    }
    
    private ControlResiduos getControlResiduos(){
        if (this.controlResiduos!= null){
            return controlResiduos;
        }else{
            this.controlResiduos = new ControlResiduos();
            return this.controlResiduos;
        }
    }
    
    private ControlProductores getControlProductores(){
        if (this.controlProductores!= null){
            return controlProductores;
        }else{
            this.controlProductores = new ControlProductores();
            return this.controlProductores;
        }
    }

    @Override
    public boolean agregarQuimico(Quimico quimico) {
        try{
            return this.getControlQuimicos().agregarQuimico(quimico);
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        return false;

    }

    @Override
    public List<Quimico> consultarTodosQuimicos() {
        
        return this.getControlQuimicos().consultarTodosQuimicos();
    }

    @Override
    public boolean agregarResiduo(Residuo residuo) {
        try{
            return this.getControlResiduos().agregarResiduo(residuo);
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<Residuo> consultarTodosResiduos() {
        
        return this.getControlResiduos().consultarTodosResiduos();
    }

    @Override
    public boolean consultarExisteNombreQuimico(String nombreConsultar) {
        return this.getControlQuimicos().consultarExisteNombreQuimico(nombreConsultar);

    }

    @Override
    public boolean consultarExisteClave(Integer claveConsultar) {
        return this.getControlResiduos().consultarExisteClaveResiduo(claveConsultar);

    }

    @Override
    public boolean consultarExisteNombreResiduo(String nombreConsultar) {
        return this.getControlResiduos().consultarExisteNombreResiduo(nombreConsultar);

    }

    @Override
    public boolean agregarProductor(Productor productor) {
        return this.getControlProductores().agregarProductor(productor);

    }

    @Override
    public List<Productor> consultarTodosProductores() {
        return this.getControlProductores().consultarTodosProductores();
    }

    @Override
    public boolean consultarExisteNombreProductor(String nombreConsultar) {
        return this.getControlProductores().consultarExisteNombreProductor(nombreConsultar);
    }
    
}
