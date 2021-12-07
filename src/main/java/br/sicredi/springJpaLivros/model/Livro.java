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
    @ManyToOne//(fetch = FetchType.EAGER,  cascade=CascadeType.ALL)
    private Editora editora;
    @JoinColumn(name = "codigoEditora")
//    private Editora editora;

    @ManyToMany //(mappedBy = "livros", fetch = FetchType.LAZY)
//    @JoinTable(name = "livros_autores", joinColumns =
//            {@JoinColumn(name = "codigoLivro")},
//            inverseJoinColumns = {@JoinColumn(name = "codigoAutor", unique = true)})
    private Collection<Autor> autores;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigoLivro;
    private String titulo;
    private int ano;

    public Livro() {}

    public Livro(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }
}
