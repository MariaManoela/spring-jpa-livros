package br.sicredi.springJpaLivros.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Editora {
    @Id
    @GeneratedValue
    private Long codigo;
    private String nome;

    public Editora() {}

    public Editora(String nome) {
        this.nome = nome;
    }
}
