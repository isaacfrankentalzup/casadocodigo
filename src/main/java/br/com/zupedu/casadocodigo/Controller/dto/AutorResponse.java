package br.com.zupedu.casadocodigo.Controller.dto;

import java.time.LocalDateTime;

public class AutorResponse {

    private Long id;
    private String nome;
    private String email;
    private LocalDateTime localDateTime;
    private String msg;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getMsg() {
        return msg;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public AutorResponse(Long id, String nome, String email, LocalDateTime localDateTime, String msg) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.localDateTime = localDateTime;
        this.msg = msg;
    }
}
