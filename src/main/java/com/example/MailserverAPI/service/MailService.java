package com.example.MailserverAPI.service;

import com.example.MailserverAPI.model.Mail;
import com.example.MailserverAPI.model.MyDTO;

import java.util.List;

public interface MailService { // business logic
    Mail getMailById(Long id);
    void saveMail(Mail mail);
    void deleteMail(Long id);
    List <Mail> getAllMails();

    List<Mail> getAllFromEmail(String fromEmail);
    List<Mail> getAllToEmail(String toEmail);
    List<MyDTO> getAllDTOs();

    List<Mail> getMailsByDomain(String domain);

}
