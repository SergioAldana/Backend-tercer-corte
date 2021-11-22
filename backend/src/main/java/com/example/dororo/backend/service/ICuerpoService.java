package com.example.dororo.backend.service;

import com.example.dororo.backend.modelEntity.Cuerpo;

import java.util.List;

public interface ICuerpoService {

    List<Cuerpo> findAll();

    Cuerpo findById(Long id);

    Cuerpo save(Cuerpo cuerpo);

    void remove(Long id);

}
