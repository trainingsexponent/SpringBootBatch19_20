package com.extreme.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.api.ApiEndpoint;
import com.extreme.finance.model.EmailDetails;
import com.extreme.finance.service.EmailService;

@RestController
public class EmailController {
	  @Autowired
	  private EmailService emailService;
	  
	 
	    @PostMapping(value = ApiEndpoint.SIMPLEMAILSENDING)
	    public String
	    sendMail(@RequestBody EmailDetails details)
	    {
	        String status
	            = emailService.sendSimpleMail(details);
	 
	        return status;
	    }
	    @PostMapping(value = ApiEndpoint.MAILSENDINGWITHATTACHMENT)
	    public String sendMailWithAttachment(
	        @RequestBody EmailDetails details)
	    {
	        String status
	            = emailService.sendMailWithAttachment(details);
	 
	        return status;
	    }

}
