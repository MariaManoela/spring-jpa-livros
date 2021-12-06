package br.sicredi.springJpaLivros.repository;

import br.sicredi.springJpaLivros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
