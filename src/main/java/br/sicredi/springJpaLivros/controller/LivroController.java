package br.sicredi.springJpaLivros.controller;

import br.sicredi.springJpaLivros.dto.LivroDto;
import br.sicredi.springJpaLivros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    LivroService livroService;

    @GetMapping
    public List findAll() {
        return livroService.findAll();
    }

    @GetMapping("/{id}")
    public Optional findById(@PathVariable("id") Long id) {
        return livroService.findById(id);
    }

    @PostMapping
    public void cadastraLivro(@RequestBody LivroDto livro) {
        livroService.save(livro);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        livroService.deleteById(id);
    }
}
