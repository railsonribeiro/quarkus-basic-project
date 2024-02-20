package org.acme.service;

import java.util.List;

import org.acme.dto.UsuarioDTO;
import org.acme.model.Usuario;

import jakarta.enterprise.context.RequestScoped;
import jakarta.transaction.Transactional;

@RequestScoped
public class UsuarioService {

    @Transactional
    public Usuario criarUsuario(UsuarioDTO usr) {
        var usuario = new Usuario();
        usuario.setCpf(usr.getCpf());
        usuario.setNomeCompleto(usr.getUsername());
        usuario.setSenha(usr.getPasswordUser());
        Usuario.persist(usuario);

        return usuario;
    }

    @Transactional
    public List<Usuario> listarUsuarios() {
        return Usuario.listAll();
    }

}
