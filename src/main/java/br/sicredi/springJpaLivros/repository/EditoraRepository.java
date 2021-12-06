package br.sicredi.springJpaLivros.repository;

import br.sicredi.springJpaLivros.model.Editora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EditoraRepository extends JpaRepository<Editora, Long> {
}
