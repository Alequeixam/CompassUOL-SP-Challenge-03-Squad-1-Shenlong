package br.com.compassuol.pb.challenge.msnotification.controller;

import br.com.compassuol.pb.challenge.msnotification.entity.Email;
import br.com.compassuol.pb.challenge.msnotification.payload.EmailDTO;
import br.com.compassuol.pb.challenge.msnotification.service.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class EmailController {
    private EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send-email")
    public ResponseEntity<Email> sendEmail(@RequestBody @Valid EmailDTO emailDTO) {
        Email email = new Email();
        BeanUtils.copyProperties(emailDTO, email);
        emailService.sendEmail(email);

        return new ResponseEntity<>(email, HttpStatus.CREATED);
    }
}
