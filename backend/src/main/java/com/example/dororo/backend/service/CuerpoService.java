package com.example.dororo.backend.service;

import com.example.dororo.backend.modelDAO.ICuerpoDAO;
import com.example.dororo.backend.modelEntity.Cuerpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuerpoService implements ICuerpoService {

    @Autowired
    private ICuerpoDAO cuerpoDAO;

    @Override
    public List<Cuerpo> findAll() {
        return cuerpoDAO.findAll();
    }

    @Override
    public Cuerpo findById(Long id) {
        return cuerpoDAO.findById(id).orElse(null);
    }

    @Override
    public Cuerpo save(Cuerpo cuerpo) {
        return cuerpoDAO.save(cuerpo);
    }

    @Override
    public void remove(Long id) {
        cuerpoDAO.deleteById(id);
    }

}
