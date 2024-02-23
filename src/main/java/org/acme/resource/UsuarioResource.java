package org.acme.resource;

import org.acme.dto.UsuarioDTO;
import org.acme.service.UsuarioService;

import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/usuarios")
public class UsuarioResource {

    @Inject
    UsuarioService service;

    @PermitAll
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response criarUsuario(UsuarioDTO usr) {
        service.criarUsuario(usr);
        return Response.noContent().build();
    }

    @RolesAllowed("admin")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarUsuarios() {
        return Response.ok(service.listarUsuarios()).build() ;
    }

}
