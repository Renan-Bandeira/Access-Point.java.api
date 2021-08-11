package com.github.RenanBandeira.pontodeacesso.service;

import com.github.RenanBandeira.pontodeacesso.model.JornadaTrabalho;
import com.github.RenanBandeira.pontodeacesso.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {


    private JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idjornada) {
        return jornadaRepository.findById(idjornada);
    }


    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
       return jornadaRepository.save(jornadaTrabalho);

    }

}
