package com.secure_user_authentication.secure_auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
public class SecureUserAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureUserAuthenticationApplication.class, args);
	}

}
