package com.example.dororo.backend.service;

import com.example.dororo.backend.modelDAO.IPeleaDAO;
import com.example.dororo.backend.modelEntity.Pelea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeleaService implements IPeleaService {

    @Autowired
    private IPeleaDAO peleaDAO;

    @Override
    public List<Pelea> findAll() {
        return peleaDAO.findAll();
    }

    @Override
    public Pelea findById(Long id) {
        return peleaDAO.findById(id).orElse(null);
    }

    @Override
    public Pelea save(Pelea pelea) {
        return peleaDAO.save(pelea);
    }

    @Override
    public void remove(Long id) {
        peleaDAO.deleteById(id);
    }

}
