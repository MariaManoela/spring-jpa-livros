package br.sicredi.springJpaLivros.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoLivro;
    private String titulo;
    private int ano;

    @ManyToOne
    private Editora editora;

    @ManyToMany
    private List<Autor> autores;

    public Livro() {}

    public Livro(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }
}

//    (fetch = FetchType.EAGER,  cascade=CascadeType.ALL)
//    @JoinColumn(name = "codigoEditora")
//    private Editora editora;

//(mappedBy = "livros", fetch = FetchType.LAZY)
//    @JoinTable(name = "livros_autores", joinColumns =
//            {@JoinColumn(name = "codigoLivro")},
//            inverseJoinColumns = {@JoinColumn(name = "codigoAutor", unique = true)})