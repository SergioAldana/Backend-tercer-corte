package com.example.dororo.backend.modelEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "demonio")
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
    @JoinColumn(name = "hyakkimaru_id", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibarnateLazy","handler"})
    private Hyakkimaru hyakkimaru_id ;

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

    public Hyakkimaru getHyakkimaru_id() {
        return hyakkimaru_id;
    }

    public void setHyakkimaru_id(Hyakkimaru hyakkimaru_id) {
        this.hyakkimaru_id = hyakkimaru_id;
    }

}
