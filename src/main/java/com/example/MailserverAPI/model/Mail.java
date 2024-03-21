package com.example.MailserverAPI.model;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
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

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getFromEmail(){
        return fromEmail;
    }
    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getToEmail(){
        return toEmail;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setToEmail(String toEmail){
        this.toEmail = toEmail;
    }



    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }
}