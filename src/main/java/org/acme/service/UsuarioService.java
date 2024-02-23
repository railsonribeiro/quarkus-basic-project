package org.acme.service;

import java.util.List;

import org.acme.dto.UsuarioDTO;
import org.acme.model.Usuario;
import org.acme.repository.UsuarioRepository;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@RequestScoped
public class UsuarioService {

    @Inject
    UsuarioRepository repository;

    @Transactional
    public void criarUsuario(UsuarioDTO usr) {
        Usuario.add(usr);
    }

    @Transactional
    public List<Usuario> listarUsuarios() {
        return repository.listAll();
    }

}
