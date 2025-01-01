package br.com.elipeixoto.geradorfrases.controller;

import br.com.elipeixoto.geradorfrases.model.Produto;
import br.com.elipeixoto.geradorfrases.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    @Autowired
    private ProdutoService service;


    @GetMapping
    private List<String> filtrarUsuarios(){
        return service.filtrarUsuarios();
    }
}
