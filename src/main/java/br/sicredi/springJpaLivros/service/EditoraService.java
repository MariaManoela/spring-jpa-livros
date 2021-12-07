package br.sicredi.springJpaLivros.service;

import br.sicredi.springJpaLivros.model.Editora;
import br.sicredi.springJpaLivros.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EditoraService {
    @Autowired
    EditoraRepository editoraRepository;

    public List<Editora> findAll() {
        return  editoraRepository.findAll();
    }

    public Optional findById(Long id) {
        return editoraRepository.findById(id);
    }

    public void save(Editora editora) {
        editoraRepository.save(editora);
    }

    public void deleteById(Long id) {
        editoraRepository.deleteById(id);
    }
}
