package com.mycompany.proyectos_t3_orm_markel_final;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "proyectos", schema = "proyecto_t3", catalog = "")
public class ProyectosEntity {
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codigo", nullable = false, length = 6)
    private String codigo;
    @Basic
    @Column(name = "nombre", nullable = false, length = 40)
    private String nombre;
    @Basic
    @Column(name = "ciudad", nullable = true, length = 40)
    private String ciudad;
    @OneToMany(mappedBy = "proyectosByProyectosCodigo")
    private Collection<GestionEntity> gestionsByCodigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Collection<GestionEntity> getGestionsByCodigo() {
        return gestionsByCodigo;
    }

    public void setGestionsByCodigo(Collection<GestionEntity> gestionsByCodigo) {
        this.gestionsByCodigo = gestionsByCodigo;
    }
}
