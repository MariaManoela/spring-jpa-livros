package br.sicredi.springJpaLivros.dto;

import br.sicredi.springJpaLivros.model.Livro;

public class LivroDto extends Livro {
    private String editora;
    private String autores;
    private Long codigoLivro;
    private String titulo;
    private int ano;
}
