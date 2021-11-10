package com.example.dororo.backend.service;

import com.example.dororo.backend.modelEntity.Hyakkimaru;
import com.example.dororo.backend.modelDAO.IHyakkimaruDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HyakkimaruService implements IHyakkimaruService {

    @Autowired
    private IHyakkimaruDAO hyakkimaruDAO;

    @Override
    public List<Hyakkimaru> findAll() {
        return hyakkimaruDAO.findAll();
    }

    @Override
    public Hyakkimaru findById(Long id) {
        return hyakkimaruDAO.findById(id).orElse(null);
    }

    @Override
    public Hyakkimaru save(Hyakkimaru hyakkimaru) {
        return hyakkimaruDAO.save(hyakkimaru);
    }

    @Override
    public void remove(Long id) {
        hyakkimaruDAO.deleteById(id);
    }

}
