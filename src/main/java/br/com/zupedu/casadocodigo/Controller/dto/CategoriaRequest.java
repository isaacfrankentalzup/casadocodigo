package br.com.zupedu.casadocodigo.Controller.dto;

import br.com.zupedu.casadocodigo.Controller.validator.ValidaCampoDuplicado;
import br.com.zupedu.casadocodigo.model.Categoria;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class CategoriaRequest {
    @NotBlank
    @ValidaCampoDuplicado(atributo = "nome", aClass = Categoria.class)
    private String nome;

    @JsonCreator
    public CategoriaRequest(@JsonProperty("nome") String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Categoria toCategoria(){
        return new Categoria(nome);
    }
}
