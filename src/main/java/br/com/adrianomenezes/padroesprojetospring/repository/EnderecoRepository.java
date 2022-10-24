package br.com.adrianomenezes.padroesprojetospring.repository;

import br.com.adrianomenezes.padroesprojetospring.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
