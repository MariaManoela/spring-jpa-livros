package br.sicredi.springJpaLivros.service;

import br.sicredi.springJpaLivros.model.Autor;
import br.sicredi.springJpaLivros.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AutorService {
    @Autowired
    AutorRepository autorRepository;

    public List findAll() {
        return autorRepository.findAll();
    }

    public Optional findById(Long id) {
        return autorRepository.findById(id);
    }

    public void save(Autor autor) {
        autorRepository.save(autor);
    }

    public void deleteById(Long id) {
        autorRepository.deleteById(id);
    }
}
