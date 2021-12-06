package br.sicredi.springJpaLivros.service;

import br.sicredi.springJpaLivros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LivroService {
    @Autowired
    LivroRepository livroRepository;
}
