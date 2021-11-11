package com.example.dororo.backend.controller;

import com.example.dororo.backend.modelEntity.Hyakkimaru;
import com.example.dororo.backend.service.IHyakkimaruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins =  "*")
public class HyakkimaruRestController {

    @Autowired
    private IHyakkimaruService hyakkimaruService;

    @GetMapping("/hyakkimaru")
    public List<Hyakkimaru> listarHyakkimaru() {
        return hyakkimaruService.findAll();
    }

    @GetMapping("/hyakkimaru/{id}")
    public Hyakkimaru findById(@PathVariable Long id) {
        return hyakkimaruService.findById(id);
    }

    @PostMapping("/hyakkimaru")
    @ResponseStatus(HttpStatus.CREATED)
    public Hyakkimaru save(@RequestBody Hyakkimaru hyakkimaru) {
        return hyakkimaruService.save(hyakkimaru);
    }

    @DeleteMapping("/hyakkimaru/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(@PathVariable Long id) {
        hyakkimaruService.remove(id);
    }

    @PutMapping("/hyakkimaru/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Hyakkimaru update(@PathVariable Long id, @RequestBody Hyakkimaru estudiante) {
        Hyakkimaru hyakkimaru = hyakkimaruService.findById(id);
        hyakkimaru.setParte(estudiante.getParte());
        hyakkimaru.setEstado(hyakkimaru.getEstado());
        return hyakkimaruService.save(hyakkimaru);
    }

}
