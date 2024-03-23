package com.example.MailserverAPI.service;

import com.example.MailserverAPI.model.Mail;
import com.example.MailserverAPI.model.MyDTO;
import com.example.MailserverAPI.repository.MailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MailServiceImpl implements MailService{
    private final MailRepository mailRepository;
    @Autowired
    public MailServiceImpl (MailRepository mailRepository){
        this.mailRepository = mailRepository;
    }
    @Override
    public Mail getMailById(Long id){
        Optional<Mail> optianalProduct = mailRepository.findById(id);
        return optianalProduct.orElse(null);
    }
    @Override
    public void saveMail(Mail mail){
        mailRepository.save(mail);
    }
    @Override
    public void deleteMail(Long id){
        mailRepository.deleteById(id);
    }
    @Override
    public List<Mail> getAllMails(){
        return mailRepository.findAll();
    }
    @Override
    public List<Mail> getAllFromEmail(String fromEmail){
        return mailRepository.findAllByFromEmail(fromEmail);
    }
    @Override
    public List<Mail> getAllToEmail(String toEmail){
        return mailRepository.findAllByToEmail(toEmail);
    }
    @Override
    public List<MyDTO> getAllDTOs(){
        ArrayList<MyDTO> myDTOS = new ArrayList<>();
        myDTOS.add(new MyDTO("name1", "lastname1"));
        myDTOS.add(new MyDTO("name2", "lastname2 "));
        return myDTOS;
    }
    @Override
    public List<Mail> getMailsByDomain(String domain) {
        return mailRepository.getMailByDomain(domain);
    }
}