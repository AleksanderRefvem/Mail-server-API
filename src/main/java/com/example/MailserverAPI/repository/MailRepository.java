package com.example.MailserverAPI.repository;

import com.example.MailserverAPI.model.Mail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MailRepository extends JpaRepository<Mail, Long> {
    List<Mail> findAllByToEmail(String toEmail);
    List<Mail> findAllByFromEmail(String fromEmail);
    List<Mail> findMailByContentContainingAndSubjectContaining(String str1, String str2);
    @Query(value = "select * from mail where from_email LIKE %:domain", nativeQuery = true)
    List<Mail> getMailByDomain(String domain);
}