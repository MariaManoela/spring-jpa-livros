package br.sicredi.springJpaLivros.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

// editora-livro = 1-N bidirecional <->  @OneToMany
// livro-autor = N-N unidirecional -> @ManyToMany

@Getter
@Setter
@Entity
@Table(name = "Autores")
public class Autor {
//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    @JoinTable(name = "autores_livros",
//            joinColumns = {
//                    @JoinColumn(name = "autor_id", referencedColumnName = "codigoAutor",
//                            nullable = false, updatable = false)},
//            inverseJoinColumns = {
//                    @JoinColumn(name = "livro_id", referencedColumnName = "codigoLivro",
//                            nullable = false, updatable = false)})
//    private Collection<Livro> livros;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigoAutor;
    private String primeiroNome;
    private String ultimoNome;

    public Autor() {}

    public Autor(String primeiroNome, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }
}
