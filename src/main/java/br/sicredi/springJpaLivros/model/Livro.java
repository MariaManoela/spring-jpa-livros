package br.sicredi.springJpaLivros.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Livro {
    @Id
    @GeneratedValue
    private Long codigo;
    private String titulo;
    private int ano;

    public Livro() {}

    public Livro(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }
}
