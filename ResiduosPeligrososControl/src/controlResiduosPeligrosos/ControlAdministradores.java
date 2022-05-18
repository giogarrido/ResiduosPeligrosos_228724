package controlResiduosPeligrosos;

import daos.FabricaD;
import daos.IDatos;
import entidades.Administrador;
import java.util.List;

/**
 *
 * @author giova
 */
public class ControlAdministradores {

    public IDatos datos = FabricaD.fabricaDatos();

    public boolean agregarAdministrador(Administrador administrador) {
        return this.datos.agregarAdministrador(administrador);
    }

    public List<Administrador> consultarTodosAdministrador() {
        return this.datos.consultarTodosAdministradores();
    }

    public boolean consultarExisteNombreAdministrador(String nombreConsultar) {
        return this.datos.consultarExisteNombreAdministrador(nombreConsultar);
    }
}
