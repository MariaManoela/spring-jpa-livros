package br.sicredi.springJpaLivros.controller;

import br.sicredi.springJpaLivros.repository.EditoraRepository;
import br.sicredi.springJpaLivros.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/editoras")
public class EditoraController {
    @Autowired
    EditoraService editoraService;
}
