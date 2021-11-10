package com.example.dororo.backend.modelEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "hyakkimaru")
public class Hyakkimaru implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String parte;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParte() {
        return parte;
    }

    public void setParte(String partes) {
        this.parte = partes;
    }

}
