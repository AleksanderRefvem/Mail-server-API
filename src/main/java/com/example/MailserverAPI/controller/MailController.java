package com.example.MailserverAPI.controller;

import com.example.MailserverAPI.model.Mail;
import com.example.MailserverAPI.model.MyDTO;
import com.example.MailserverAPI.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// dsd

@RestController
@RequestMapping("/api/mail")
public class MailController {
    private final MailService mailService;
    @Autowired
    public MailController(MailService mailService){
        this.mailService = mailService;
    }
    @GetMapping("/{id}")
    public Mail getMailById(@PathVariable Long id){
        return mailService.getMailById(id);
    }
    @GetMapping
    public List<Mail> getAllMails(){
        return mailService.getAllMails();
    }
    @GetMapping("/from/{from}")
    public List<Mail> getAllFromMail (@PathVariable String from){
        return mailService.getAllFromEmail(from);
    }
    @GetMapping("/to/{to}")
    public List<Mail> getAllToMail (@PathVariable String to){
        return mailService.getAllToEmail(to);
    }
    @PostMapping
    public void addMail(@RequestBody Mail mail){
        mailService.saveMail(mail);
    }
    @DeleteMapping("/{id}")
    public void deleteMail(@PathVariable Long id){
        mailService.deleteMail(id);
    }
    @GetMapping("/dto")
    public List<MyDTO> getAllDTOs(){return mailService.getAllDTOs();}
    @GetMapping("/domain/{domain}")
    public List<Mail> getAllFromDomain(@PathVariable String domain){return mailService.getMailsByDomain(domain);}
}
