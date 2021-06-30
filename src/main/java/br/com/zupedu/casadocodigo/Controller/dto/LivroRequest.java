package br.com.zupedu.casadocodigo.Controller.dto;

import br.com.zupedu.casadocodigo.Controller.validator.ValidaCampoDuplicado;
import br.com.zupedu.casadocodigo.model.Autor;
import br.com.zupedu.casadocodigo.model.Categoria;
import br.com.zupedu.casadocodigo.model.Livro;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class LivroRequest {

    @NotBlank
    @ValidaCampoDuplicado(atributo = "titulo", aClass = Livro.class)
    private String titulo;

    @NotBlank @Size(max = 500)
    private String resumo;

    private String sumario;

    @NotNull
    @Min(20)
    private BigDecimal preco;

    @NotNull @Min(100)
    private Integer paginas;

    @NotBlank @ValidaCampoDuplicado(atributo = "isbn", aClass = Livro.class)
    private String isbn;

    @Future
    private LocalDate publicacao;

    @NotNull
    private Categoria categoria;

    @NotNull
    private Autor autor;

    public String getTitulo() {
        return titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public String getSumario() {
        return sumario;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getPublicacao() {
        return publicacao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public Livro toLivro(){
        return new Livro(titulo, resumo, sumario, preco,paginas, isbn, publicacao, categoria, autor);
    }

}
