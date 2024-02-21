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
    public Usuario criarUsuario(UsuarioDTO usr) {
        var usuario = new Usuario();
        usuario.setCpf(usr.getCpf());
        usuario.setNomeCompleto(usr.getNomeCompleto());
        usuario.setUserName(usr.getUserName());
        usuario.setSenha(usr.getPasswordUser());
        Usuario.persist(usuario);

        return usuario;
    }

    @Transactional
    public List<Usuario> listarUsuarios() {
        return repository.listAll();
    }

}
