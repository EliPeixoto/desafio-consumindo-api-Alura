package br.com.elipeixoto.geradorfrases.controller;

import br.com.elipeixoto.geradorfrases.dto.FrasesDTO;
import br.com.elipeixoto.geradorfrases.model.Frases;
import br.com.elipeixoto.geradorfrases.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FrasesController {
    @Autowired
    private FrasesService service;


    @GetMapping("/frases")
    public FrasesDTO buscaFrases(){
        return service.buscaFrasesAleatorias();
    }
}
