package br.com.zupedu.casadocodigo.Controller.dto;

public class CategoriaResponse {
    private String descricao;

    public CategoriaResponse(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
