package com.example.dororo.backend.modelEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "demonio")
public class Demonio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nombre;
    @Column
    private String ubicacion;

    //Espacio para crear el atributo foto

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cuerpo_id", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazy", "handler"})
    private Cuerpo cuerpoId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Cuerpo getCuerpoId() {
        return cuerpoId;
    }

    public void setCuerpoId(Cuerpo cuerpoId) {
        this.cuerpoId = cuerpoId;
    }

}
