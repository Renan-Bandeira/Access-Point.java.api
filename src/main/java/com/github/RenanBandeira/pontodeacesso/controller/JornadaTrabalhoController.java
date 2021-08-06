package com.github.RenanBandeira.pontodeacesso.controller;

import com.github.RenanBandeira.pontodeacesso.model.JornadaTrabalho;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @PostMapping
    public JornadaTrabalho CreateJornada(){
        return null;

    }
}
