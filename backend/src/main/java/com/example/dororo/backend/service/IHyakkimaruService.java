package com.example.dororo.backend.service;

import com.example.dororo.backend.modelEntity.Hyakkimaru;

import java.util.List;

public interface IHyakkimaruService {

    List<Hyakkimaru> findAll();

    Hyakkimaru findById(Long id);

    Hyakkimaru save(Hyakkimaru hyakkimaru);

    void remove(Long id);

}
