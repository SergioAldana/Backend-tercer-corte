package com.example.dororo.backend.modelDAO;

import com.example.dororo.backend.modelEntity.Demonio;
import com.example.dororo.backend.modelEntity.Hyakkimaru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDemonioDAO extends JpaRepository<Demonio, Long> {

    @Query("from hyakkimaru")
    List<Hyakkimaru> findAllHyakkimaru();

}
