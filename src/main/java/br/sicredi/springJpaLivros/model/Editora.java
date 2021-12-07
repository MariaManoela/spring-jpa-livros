package br.sicredi.springJpaLivros.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "Editoras")
public class Editora {
    @OneToMany (mappedBy = "editora",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Collection<Livro> livros;

    @Id
    @GeneratedValue
    private Long codigoEditora;
    private String nome;

    public Editora() {}

    public Editora(String nome) {
        this.nome = nome;
    }
}
