package com.example.dororo.backend.service;

import com.example.dororo.backend.modelEntity.Cuerpo;
import com.example.dororo.backend.modelEntity.Pelea;

import java.util.List;

public interface IPeleaService {

    List<Pelea> findAll();

    Pelea findById(Long id);

    Pelea save(Pelea pelea);

    void remove(Long id);

}
