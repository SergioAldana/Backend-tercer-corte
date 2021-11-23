package com.example.dororo.backend.modelEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "pelea")
public class Pelea implements Serializable {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private boolean ganador;
    @Column
    private String ubicacion;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "demonio_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Demonio demonioId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Demonio getDemonioId() {
        return demonioId;
    }

    public void setDemonioId(Demonio demonioId) {
        this.demonioId = demonioId;
    }

}
