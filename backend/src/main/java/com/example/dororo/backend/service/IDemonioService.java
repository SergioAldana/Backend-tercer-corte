package com.example.dororo.backend.service;

import com.example.dororo.backend.modelEntity.Demonio;
import com.example.dororo.backend.modelEntity.Hyakkimaru;

import java.util.List;

public interface IDemonioService {

    List<Demonio> findAll();

    Demonio findById(Long id);

    List<Hyakkimaru> findAllHyakkimaru();

    Demonio save(Demonio demonio);

    void remove(Long id);

}
