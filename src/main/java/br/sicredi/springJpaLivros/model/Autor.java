package br.sicredi.springJpaLivros.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// editora-livro = 1-N bidirecional <->  @OneToMany
// livro-autor = N-N unidirecional -> @ManyToMany

@Entity
@Getter
@Setter
public class Autor {
    @Id
    @GeneratedValue
    private Long codigo;
    private String primeiroNome;
    private String ultimoNome;

    public Autor() {}

    public Autor(String primeiroNome, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }
}
