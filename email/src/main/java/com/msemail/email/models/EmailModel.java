package com.msemail.email.models;

import lombok.Data;

import javax.persistence.*;
import com.msemail.email.enums.StatusEmail;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable  {
    private static final long serialversionUID = 1L;   

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;

}
