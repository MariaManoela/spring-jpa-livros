package br.sicredi.springJpaLivros.service;

import br.sicredi.springJpaLivros.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutorService {
    @Autowired
    AutorRepository autorRepository;
}
