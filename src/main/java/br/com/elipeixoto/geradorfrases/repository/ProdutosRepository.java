package br.com.elipeixoto.geradorfrases.repository;

import br.com.elipeixoto.geradorfrases.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<Produto, Long> {
}
