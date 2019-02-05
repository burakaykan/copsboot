package com.example.copsboot.user.web;

import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@ValidCreateUserParameters
public class CreateOfficerParameters {
    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min = 6, max = 1000)
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}