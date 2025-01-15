package com.hari.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.request.EmailRequest;
import com.hari.service.EmailGeneratorService;

@RestController
@RequestMapping("/api/email")
public class EmailGeneratorController {
    private final EmailGeneratorService emailGeneratorService;

    public EmailGeneratorController(EmailGeneratorService emailGeneratorService) {
        this.emailGeneratorService = emailGeneratorService;
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest request) {

        String response = emailGeneratorService.generateEmailReply(request);
        return ResponseEntity.ok(response);
    }

}
