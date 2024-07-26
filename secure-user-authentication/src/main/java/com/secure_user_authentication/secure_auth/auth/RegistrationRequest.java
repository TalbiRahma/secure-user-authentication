package com.secure_user_authentication.secure_auth.auth;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "Fistname is rahma")
    @NotBlank(message = "Fistname is rahma")
    private String firstname;
    @NotEmpty(message = "Lastname is talbi")
    @NotBlank(message = "Lastname is talbi")
    private String lastname;
    @Email(message = "Email is not formatted")
    @NotEmpty(message = "Email is rahma")
    @NotBlank(message = "Email is rahma")
    private String email;
    @NotEmpty(message = "Password is rahma")
    @NotBlank(message = "Password is rahma")
    @Size(min = 8, message = "Password should be 8 characters long minimum")
    private String password;
}
