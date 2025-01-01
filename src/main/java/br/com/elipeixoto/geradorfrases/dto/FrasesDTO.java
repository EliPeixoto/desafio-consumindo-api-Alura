package br.com.elipeixoto.geradorfrases.dto;

public record FrasesDTO(
        Long id,
        String titulo,
        String frase,
        String personagem,
        String poster
) {
}
