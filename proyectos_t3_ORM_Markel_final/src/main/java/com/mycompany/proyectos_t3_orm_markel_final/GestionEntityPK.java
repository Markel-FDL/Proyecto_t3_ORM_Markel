package com.mycompany.proyectos_t3_orm_markel_final;

import java.io.Serializable;
import java.util.Objects;

public class GestionEntityPK implements Serializable {
    private String proyectosCodigo;
    private String proveedoresCodigo;
    private String piezasCodigo;

    public String getProyectosCodigo() {
        return proyectosCodigo;
    }

    public void setProyectosCodigo(String proyectosCodigo) {
        this.proyectosCodigo = proyectosCodigo;
    }

    public String getProveedoresCodigo() {
        return proveedoresCodigo;
    }

    public void setProveedoresCodigo(String proveedoresCodigo) {
        this.proveedoresCodigo = proveedoresCodigo;
    }

    public String getPiezasCodigo() {
        return piezasCodigo;
    }

    public void setPiezasCodigo(String piezasCodigo) {
        this.piezasCodigo = piezasCodigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GestionEntityPK that = (GestionEntityPK) o;
        return Objects.equals(proyectosCodigo, that.proyectosCodigo) && Objects.equals(proveedoresCodigo, that.proveedoresCodigo) && Objects.equals(piezasCodigo, that.piezasCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proyectosCodigo, proveedoresCodigo, piezasCodigo);
    }
}
