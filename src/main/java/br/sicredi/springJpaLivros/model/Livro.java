package br.sicredi.springJpaLivros.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "Livros")
public class Livro {
    @ManyToOne
    @JoinColumn(name = "codigoEditora")
    private Editora editora;

    @ManyToMany
    private Collection<Autor> autores;

    @Id
    @GeneratedValue
    private Long codigoLivro;
    private String titulo;
    private int ano;

    public Livro() {}

    public Livro(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }
}
