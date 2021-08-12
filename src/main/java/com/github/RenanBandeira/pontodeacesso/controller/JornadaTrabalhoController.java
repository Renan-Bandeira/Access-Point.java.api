package com.github.RenanBandeira.pontodeacesso.controller;

import com.github.RenanBandeira.pontodeacesso.model.JornadaTrabalho;
import com.github.RenanBandeira.pontodeacesso.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho CreateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);

    }
    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }


    @GetMapping("/{idjornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idjornada") Long idjornada) throws Exception {
        return ResponseEntity.ok(jornadaService.getById(idjornada).orElseThrow(()-> new Exception("jornada não encontrada")));

    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deleteByID(@PathVariable("idjornada") Long idjornada) throws Exception {
       try{
           jornadaService.deleteJornada(idjornada);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }
}
