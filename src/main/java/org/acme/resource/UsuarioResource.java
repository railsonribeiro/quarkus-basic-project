package org.acme.resource;

import java.util.List;

import org.acme.dto.UsuarioDTO;
import org.acme.model.BitCoin;
import org.acme.model.Usuario;
import org.acme.service.BitCoinService;
import org.acme.service.UsuarioService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/usuario")
public class UsuarioResource {

    @Inject
    UsuarioService service;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response criarUsuario(UsuarioDTO usr) {
        return Response.ok(service.criarUsuario(usr)).build();
   
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarUsuarios() {
        return Response.ok(service.listarUsuarios()).build() ;
   
    }

}
