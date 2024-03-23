package com.example.MailserverAPI.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Data
public class Mail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //automatisk inkrementering for ID-nr
    private long id;

    @Column(name = "subject")
    private String subject;

    @Column(name = "fromEmail")
    private String fromEmail;

    @Column(name = "toEmail")
    private String toEmail;

    @Column(name = "content")
    private String content;

    @Column(name = "timestamp", columnDefinition = "timestamp(6) without time zone")
    @CreationTimestamp
    private Timestamp timestamp;
}