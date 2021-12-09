package br.sicredi.springJpaLivros.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoAutor;
    private String primeiroNome;
    private String ultimoNome;

    public Autor() {}

    public Autor(String primeiroNome, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }
}

//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    @JoinTable(name = "autores_livros",
//            joinColumns = {
//                    @JoinColumn(name = "autor_id", referencedColumnName = "codigoAutor",
//                            nullable = false, updatable = false)},
//            inverseJoinColumns = {
//                    @JoinColumn(name = "livro_id", referencedColumnName = "codigoLivro",
//                            nullable = false, updatable = false)})
//    private Collection<Livro> livros;