package br.sicredi.springJpaLivros.controller;

import br.sicredi.springJpaLivros.model.Editora;
import br.sicredi.springJpaLivros.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/editoras")
public class EditoraController {
    @Autowired
    EditoraService editoraService;

    @GetMapping
    public List<Editora> findAll() {
        return editoraService.findAll();
    }

    @GetMapping("/{id}")
    public Optional findById(@PathVariable("id") Long id) {
        return editoraService.findById(id);
    }

    @PostMapping
    public void cadastraEditora(@RequestBody Editora editora) {
        editoraService.save(editora);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        editoraService.deleteById(id);
    }
}
