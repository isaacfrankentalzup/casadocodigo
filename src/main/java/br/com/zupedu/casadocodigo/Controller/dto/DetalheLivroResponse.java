package br.com.zupedu.casadocodigo.Controller.dto;

import java.math.BigDecimal;

public class DetalheLivroResponse {
    private String titulo;
    private String resumo;
    private String sumario;
    private BigDecimal preco;
    private Integer pagina;  // era paginas possivel erro
    private String isbn;
    private String autorNome;
    private String autorDescricao;

    public DetalheLivroResponse(String titulo, String resumo,
                                String sumario, BigDecimal preco,
                                Integer pagina, String isbn, String autorNome,
                                String autorDescricao) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.sumario = sumario;
        this.preco = preco;
        this.pagina = pagina;
        this.isbn = isbn;
        this.autorNome = autorNome;
        this.autorDescricao = autorDescricao;
    }

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

    public Integer getPagina() {
        return pagina;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutorNome() {
        return autorNome;
    }

    public String getAutorDescricao() {
        return autorDescricao;
    }
}
