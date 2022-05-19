/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author giova
 */
public class SolicitudTraslado {

    private ObjectId id;
    private String productor;
    private String fecha;
    private Float cantidad;
    private String unidad;
    private List<ObjectId> idsResiduos;

    public SolicitudTraslado() {
    }

    public SolicitudTraslado(String productor, String fecha, Float cantidad, String unidad) {
        this.productor = productor;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public SolicitudTraslado(String productor, String fecha, Float cantidad, String unidad, List<ObjectId> idsResiduos) {
        this.productor = productor;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.idsResiduos = idsResiduos;
    }

    public SolicitudTraslado(ObjectId id, String productor, String fecha, Float cantidad, String unidad, List<ObjectId> idsResiduos) {
        this.id = id;
        this.productor = productor;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.idsResiduos = idsResiduos;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public List<ObjectId> getIdsResiduos() {
        return idsResiduos;
    }

    public void setIdsResiduos(List<ObjectId> idsResiduos) {
        this.idsResiduos = idsResiduos;
    }

    public void addIdsResiduos(ObjectId idResiduo) {
        if (this.idsResiduos == null) {
            this.idsResiduos = new ArrayList<>();
        }
        this.idsResiduos.add(idResiduo);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
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
        final SolicitudTraslado other = (SolicitudTraslado) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "SolicitudTraslado{" + "id=" + id + ", productor=" + productor + ", fecha=" + fecha + ", cantidad=" + cantidad + ", unidad=" + unidad + ", idsResiduos=" + idsResiduos + '}';
    }
    
    

}
