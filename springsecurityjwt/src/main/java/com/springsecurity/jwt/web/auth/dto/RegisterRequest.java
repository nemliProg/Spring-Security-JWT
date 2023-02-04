package com.springsecurity.jwt.web.auth.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

        private String email;
        private String password;
        private String firstName;
        private String lastName;

}
