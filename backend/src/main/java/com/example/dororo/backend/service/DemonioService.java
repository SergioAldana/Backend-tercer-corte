package com.example.dororo.backend.service;

import com.example.dororo.backend.modelDAO.IDemonioDAO;
import com.example.dororo.backend.modelDAO.IHyakkimaruDAO;
import com.example.dororo.backend.modelEntity.Demonio;
import com.example.dororo.backend.modelEntity.Hyakkimaru;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DemonioService implements IDemonioService {

    @Autowired
    private IDemonioDAO demonioDAO;
    @Autowired
    private IHyakkimaruDAO hyakkimaruDAO;


    @Override
    public List<Demonio> findAll() {
        return demonioDAO.findAll();
    }

    @Override
    public Demonio findById(Long id) {
        return demonioDAO.findById(id).orElse(null);
    }

    //Se debe verificar este metodo
    @Override
    public List<Hyakkimaru> findAllHyakkimaru() {
        return demonioDAO.findAllHyakkimaru();
    }

    @Override
    public Demonio save(Demonio demonio) {
        return demonioDAO.save(demonio);
    }

    @Override
    public void remove(Long id) {
        demonioDAO.deleteById(id);
    }

}
