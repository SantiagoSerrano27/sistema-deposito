package com.deposito.sistema_deposito.dto;

import jakarta.validation.constraints.NotBlank;

public record AuthResponse( 
    
    @NotBlank (message = "El token es obligatorio")
    String token
    
) {

}
