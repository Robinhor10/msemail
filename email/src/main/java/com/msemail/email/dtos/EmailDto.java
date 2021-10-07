package com.msemail.email.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data // lib do lombok que encapsula os getters e setters ficando transparente seu uso
public class EmailDto {

    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
    
}











//Classe que vai receber o objeto criado no metodo POST
//Anotação @NotBlank, serve para validar se o campo foi preenchido na requisição
//Anotação @Email, serve para avaliar se o e-mail informado é válido