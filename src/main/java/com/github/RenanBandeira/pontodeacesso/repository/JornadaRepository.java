package com.github.RenanBandeira.pontodeacesso.repository;

import com.github.RenanBandeira.pontodeacesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
