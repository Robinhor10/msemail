package com.msemail.email.repositories;

import com.msemail.email.models.EmailModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
    
}


//Classe responsável para trabalhar com o banco de dados