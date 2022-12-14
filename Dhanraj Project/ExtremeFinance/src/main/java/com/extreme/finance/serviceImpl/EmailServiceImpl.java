package com.extreme.finance.serviceImpl;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.EmailDetails;
import com.extreme.finance.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService{

	@Autowired
	private JavaMailSender javaMailSender;
	@Override
	public String sendSimpleMail(EmailDetails details) {
		try {
			 SimpleMailMessage mailMessage = new SimpleMailMessage();
			 mailMessage.setFrom("dhanrajraskar93@gmail.com");
			 mailMessage.setTo(details.getRecipient());
			 mailMessage.setText(details.getMsgBody());
			 mailMessage.setSubject(details.getSubject());
			  javaMailSender.send(mailMessage);
	            return "Mail Sent Successfully...!";
		} catch (Exception e) {
			
		}
		return "Erroe While Sending Massage....!";
	}

	@Override
	public String sendMailWithAttachment(EmailDetails details) {
	
	        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
	        MimeMessageHelper mimeMessageHelper;
	 
	        try {
	
	            mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
	            mimeMessageHelper.setFrom("amolraskar5685@gmail.com");
	            mimeMessageHelper.setTo(details.getRecipient());
	            mimeMessageHelper.setText(details.getMsgBody());
	            mimeMessageHelper.setSubject(details.getSubject());
	                
	 
	            FileSystemResource file = new FileSystemResource(new File(details.getAttachment()));
	                    
	            mimeMessageHelper.addAttachment(file.getFilename(), file);
	       	 
	            javaMailSender.send(mimeMessage);
	            return "Mail sent Successfully";
	        }catch (MessagingException e) {
	 
	        return "Error while sending mail!!!";
	        }
	    
		
	}

}
