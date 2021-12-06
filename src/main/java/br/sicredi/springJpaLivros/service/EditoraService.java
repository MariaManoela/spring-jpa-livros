package br.sicredi.springJpaLivros.service;

import br.sicredi.springJpaLivros.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EditoraService {
    @Autowired
    EditoraRepository editoraRepository;
}
