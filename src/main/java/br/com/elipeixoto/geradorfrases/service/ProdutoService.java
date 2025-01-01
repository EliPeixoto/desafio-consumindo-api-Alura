package br.com.elipeixoto.geradorfrases.service;

import br.com.elipeixoto.geradorfrases.model.Produto;
import br.com.elipeixoto.geradorfrases.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutosRepository repository;

    public List<String> filtrarUsuarios(){
        List<Produto> produtos = repository.findAll();
        List<String> nomesProdutos = produtos.stream()
                .filter(produto -> produto.getQuantidade() > 0)
                .map(Produto::getNome)
                .collect(Collectors.toList());

        return nomesProdutos;
    }
}
