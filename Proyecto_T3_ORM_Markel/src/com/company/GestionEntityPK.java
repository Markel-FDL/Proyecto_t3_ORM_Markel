package com.company;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class GestionEntityPK implements Serializable {
    @Column(name = "piezas_codigo", nullable = false, length = 6)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String piezasCodigo;
    @Column(name = "proyectos_codigo", nullable = false, length = 6)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String proyectosCodigo;
    @Column(name = "proveedores_codigo", nullable = false, length = 6)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String proveedoresCodigo;

    public String getPiezasCodigo() {
        return piezasCodigo;
    }

    public void setPiezasCodigo(String piezasCodigo) {
        this.piezasCodigo = piezasCodigo;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GestionEntityPK that = (GestionEntityPK) o;
        return Objects.equals(piezasCodigo, that.piezasCodigo) && Objects.equals(proyectosCodigo, that.proyectosCodigo) && Objects.equals(proveedoresCodigo, that.proveedoresCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(piezasCodigo, proyectosCodigo, proveedoresCodigo);
    }
}
