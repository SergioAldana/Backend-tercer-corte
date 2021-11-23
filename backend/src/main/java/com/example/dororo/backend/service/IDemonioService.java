package com.example.dororo.backend.service;

import com.example.dororo.backend.modelEntity.Cuerpo;
import com.example.dororo.backend.modelEntity.Demonio;
import java.util.List;

public interface IDemonioService {

    List<Demonio> findAll();

    Demonio findById(Long id);

    //List<Cuerpo> findAllCuerpo();

    Demonio save(Demonio demonio);

    void remove(Long id);

}
