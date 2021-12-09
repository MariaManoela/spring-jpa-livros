package br.sicredi.springJpaLivros.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Editora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoEditora;
    private String nome;

    @OneToMany (mappedBy = "editora", cascade = CascadeType.ALL) //fetch = FetchType.EAGER)
    private List<Livro> livros;

    public Editora() {}

    public Editora(String nome) {
        this.nome = nome;
    }
}
