package br.com.elipeixoto.geradorfrases.service;

import br.com.elipeixoto.geradorfrases.dto.FrasesDTO;
import br.com.elipeixoto.geradorfrases.model.Frases;
import br.com.elipeixoto.geradorfrases.model.Produto;
import br.com.elipeixoto.geradorfrases.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FrasesService {

    @Autowired
    private FrasesRepository repositorio;



    public FrasesDTO buscaFrasesAleatorias(){
        Optional<Frases> frases =  repositorio.frasesAleatorias();
        if(frases.isPresent()){
            Frases f = frases.get();
            return new FrasesDTO(f.getId(), f.getTitulo(), f.getFrase(), f.getPersonagem(),f.getPoster());
        }
        return null;
    }


}
