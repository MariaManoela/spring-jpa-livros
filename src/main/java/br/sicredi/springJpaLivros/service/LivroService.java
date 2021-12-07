package br.sicredi.springJpaLivros.service;

import br.sicredi.springJpaLivros.dto.LivroDto;
import br.sicredi.springJpaLivros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class LivroService {
    @Autowired
    LivroRepository livroRepository;

    public List findAll() {
        return livroRepository.findAll();
    }

    public Optional findById(Long id) {
        return livroRepository.findById(id);
    }

    public void save(LivroDto livro) {
        livroRepository.save(livro);
    }

    public void deleteById(Long id) {
        livroRepository.deleteById(id);
    }
}
