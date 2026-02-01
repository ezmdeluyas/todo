package com.zmd.springboot.todo.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {

    @NotEmpty(message = "First name is mandatory")
    @Size(min = 3, max = 30, message = "First name must be at least 3 characters long")
    private String firstName;

    @NotEmpty(message = "Last name is mandatory")
    @Size(min = 3, max = 30, message = "Last name must be at least 3 characters long")
    private String lastName;

    @NotEmpty(message = "Email is mandatory")
    @Email(message = "Invalid email format")
    private String email;

    @NotEmpty(message = "Password is mandatory")
    @Size(min = 5, max = 30, message = "Password must be at least 5 characters long")
    private String password;

    public RegisterRequest(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}
