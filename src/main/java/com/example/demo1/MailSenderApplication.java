package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MailSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailSenderApplication.class, args);
	}
//	@EventListener(ApplicationReadyEvent.class)
//	public void sendmail() {
//		System.out.println("inside runner class .//19...///....");
//		emailSenderService.sendEmail("darshanparsai@gmail.com", "testing email sender", 
//				"Hii! \n"
//				+ "How  are you...");
//		System.out.println("end line of runner class .......././....23...");
//	}

}
