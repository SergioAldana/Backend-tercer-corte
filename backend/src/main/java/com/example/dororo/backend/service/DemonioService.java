package com.example.dororo.backend.service;

import com.example.dororo.backend.modelDAO.ICuerpoDAO;
import com.example.dororo.backend.modelDAO.IDemonioDAO;
import com.example.dororo.backend.modelEntity.Cuerpo;
import com.example.dororo.backend.modelEntity.Demonio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DemonioService implements IDemonioService {

    @Autowired
    private IDemonioDAO demonioDAO;
    @Autowired
    private ICuerpoDAO cuerpoDAO;


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
    public List<Cuerpo> findAllCuerpo() {
        return demonioDAO.findAllCuerpo();
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
