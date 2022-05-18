
package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author giova
 */
public class Vehiculo {
    
    private ObjectId id;
    private String tipoVehiculo;
    private String placas;

    public Vehiculo() {
    }

    public Vehiculo(ObjectId id, String tipoVehiculo, String placas) {
        this.id = id;
        this.tipoVehiculo = tipoVehiculo;
        this.placas = placas;
    }

    public Vehiculo(String tipoVehiculo, String placas) {
        this.tipoVehiculo = tipoVehiculo;
        this.placas = placas;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", tipoVehiculo=" + tipoVehiculo + ", placas=" + placas + '}';
    }
    
    

            
}
