package br.sicredi.springJpaLivros.repository;

import br.sicredi.springJpaLivros.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AutorRepository extends JpaRepository<Autor, Long> {
}
