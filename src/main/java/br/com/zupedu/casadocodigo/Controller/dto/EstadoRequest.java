package br.com.zupedu.casadocodigo.Controller.dto;

import br.com.zupedu.casadocodigo.model.Estado;
import br.com.zupedu.casadocodigo.model.Pais;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EstadoRequest {
    @NotBlank
    private String nome;
    @NotNull
    private Pais pais;

    public String getNome() {
        return nome;
    }

    public Pais getPais() {
        return pais;
    }

    public Estado toEstado(){
        return new Estado(nome, pais);
    }


}
