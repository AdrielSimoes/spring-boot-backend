package com.adriel.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.adriel.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
