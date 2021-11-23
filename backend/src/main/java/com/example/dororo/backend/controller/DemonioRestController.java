package com.example.dororo.backend.controller;

import com.example.dororo.backend.modelEntity.Demonio;
import com.example.dororo.backend.service.DemonioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DemonioRestController {

    @Autowired
    private DemonioService demonioService;

    @GetMapping("/demonio")
    public List<Demonio> findAll() {
        return demonioService.findAll();
    }

    @GetMapping("/demonio/{id}")
    public Demonio findById(@PathVariable Long id) {
        return demonioService.findById(id);
    }

    @PostMapping("/demonio")
    @ResponseStatus(HttpStatus.CREATED)
    public Demonio save(@RequestBody Demonio demonio) {
        return demonioService.save(demonio);
    }

    @DeleteMapping("/demonio/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(@PathVariable Long id) {
        demonioService.remove(id);
    }

}
