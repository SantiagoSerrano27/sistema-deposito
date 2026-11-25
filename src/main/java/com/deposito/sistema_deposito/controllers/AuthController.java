package com.deposito.sistema_deposito.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.deposito.sistema_deposito.dto.AuthResponse;
import com.deposito.sistema_deposito.dto.LoginRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;



@RestController 
@RequestMapping ("/auth")
public class AuthController {

    @PostMapping ("/login")
        public AuthResponse login(@Valid @RequestBody LoginRequest request){
            return null;
        }

}
