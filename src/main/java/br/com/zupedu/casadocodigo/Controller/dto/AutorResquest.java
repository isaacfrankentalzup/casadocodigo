package br.com.zupedu.casadocodigo.Controller.dto;

import br.com.zupedu.casadocodigo.Controller.validator.ValidaCampoDuplicado;
import br.com.zupedu.casadocodigo.model.Autor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AutorResquest {
    @NotBlank
    private String nome;
    @NotBlank @Email
    @ValidaCampoDuplicado(atributo = "email", aClass = Autor.class)
    private String email;
    @NotBlank @Size(max = 400)
    private String descricao;

    public  String getNome(){
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDescricao() {
        return descricao;
    }

    public Autor toAutor(){
        return new Autor(this.nome, this.email, this.descricao);
    }

}
