package br.sicredi.springJpaLivros.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Livros")
public class Livro {
    @ManyToOne(fetch = FetchType.EAGER,  cascade=CascadeType.ALL)
    @JoinColumn(name = "codigoEditora")
    private Editora editora;

//    @ManyToMany(mappedBy = "livros", fetch = FetchType.LAZY)
//    private Collection<Autor> autores;

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
