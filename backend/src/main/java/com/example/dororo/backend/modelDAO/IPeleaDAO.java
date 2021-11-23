package com.example.dororo.backend.modelDAO;

import com.example.dororo.backend.modelEntity.Pelea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPeleaDAO extends JpaRepository<Pelea, Long> {

}
