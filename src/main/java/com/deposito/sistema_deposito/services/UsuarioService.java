package com.deposito.sistema_deposito.services;

import com.deposito.sistema_deposito.entities.Usuario;
import com.deposito.sistema_deposito.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public Usuario registrarUsuario(Usuario usuario) {

        //se reemplaza la pass plana por la encriptada antes de guardarla
        String passwordHasheada = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(passwordHasheada);

        return usuarioRepository.save(usuario);

    }

}
