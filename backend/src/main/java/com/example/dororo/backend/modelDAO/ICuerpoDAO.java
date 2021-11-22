package com.example.dororo.backend.modelDAO;

import com.example.dororo.backend.modelEntity.Cuerpo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICuerpoDAO extends JpaRepository<Cuerpo, Long> {

}
