package br.sicredi.springJpaLivros.controller;

import br.sicredi.springJpaLivros.model.Autor;
import br.sicredi.springJpaLivros.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    AutorService autorService;

    @GetMapping
    public List findAll() {
        return autorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional findById(@PathVariable("id") Long id) {
        return autorService.findById(id);
    }

    @PostMapping
    public void cadastraAutor(@RequestBody Autor autor) {
        autorService.save(autor);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        autorService.deleteById(id);
    }
}
