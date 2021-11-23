package com.example.dororo.backend.controller;

import com.example.dororo.backend.modelEntity.Demonio;
import com.example.dororo.backend.modelEntity.Pelea;
import com.example.dororo.backend.service.DemonioService;
import com.example.dororo.backend.service.PeleaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class PeleaRestController {

    @Autowired
    private PeleaService peleaService;

    @GetMapping("/pelea")
    public List<Pelea> findAll() {
        return peleaService.findAll();
    }

    @GetMapping("/pelea/{id}")
    public Pelea findById(@PathVariable Long id) {
        return peleaService.findById(id);
    }

    @PostMapping("/pelea")
    @ResponseStatus(HttpStatus.CREATED)
    public Pelea save(@RequestBody Pelea pelea) {
        return peleaService.save(pelea);
    }

    @DeleteMapping("/pelea/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(@PathVariable Long id) {
        peleaService.remove(id);
    }

}
