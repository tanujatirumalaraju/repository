package com.mss.emanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mss.emanagement.model.MailModel;
import com.mss.emanagement.service.MailService;

@RestController
public class Mailcontroller {
	
		@Autowired
		MailService mailService;
		
		@PostMapping("/send")
		public String sendMail(@RequestBody MailModel mailModel ) {
			
			String email = mailService.sendEmail(mailModel.getToEmail(),mailModel.getSubject(),mailModel.getBody());
			return email;
		}
}
