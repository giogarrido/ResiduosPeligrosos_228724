/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import java.util.List;
import objetosNegocio.Quimico;

/**
 *
 * @author giova
 */
public abstract class DAOsBase <T>{

    protected abstract boolean agregar (T entidad);
    protected abstract List<T> consultarTodos();
}
