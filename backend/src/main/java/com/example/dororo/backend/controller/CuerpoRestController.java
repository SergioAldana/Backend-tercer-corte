package com.example.dororo.backend.controller;

import com.example.dororo.backend.modelEntity.Cuerpo;
import com.example.dororo.backend.service.CuerpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CuerpoRestController {

    @Autowired
    private CuerpoService cuerpoService;

    @GetMapping("/cuerpo")
    public List<Cuerpo> listarCuerpo() {
        return cuerpoService.findAll();
    }

    @GetMapping("/cuerpo/{id}")
    public Cuerpo findById(@PathVariable Long id) {
        return cuerpoService.findById(id);
    }

    @PostMapping("/cuerpo")
    @ResponseStatus(HttpStatus.CREATED)
    public Cuerpo save(@RequestBody Cuerpo hyakkimaru) {
        return cuerpoService.save(hyakkimaru);
    }

    @DeleteMapping("/cuerpo/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(@PathVariable Long id) {
        cuerpoService.remove(id);
    }

    @PutMapping("/cuerpo/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Cuerpo update(@PathVariable Long id, @RequestBody Cuerpo cuerpo) {
        Cuerpo cuerpo1 = cuerpoService.findById(id);
        cuerpo1.setParte(cuerpo.getParte());
        cuerpo1.setEstado(cuerpo.getEstado());
        return cuerpoService.save(cuerpo);
    }

}
