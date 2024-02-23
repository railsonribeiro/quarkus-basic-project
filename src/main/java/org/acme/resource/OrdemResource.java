package org.acme.resource;

import org.acme.dto.OrdemDTO;
import org.acme.service.OrdemService;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/orders")
public class OrdemResource {

    @Inject
    OrdemService service;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarOrders() {
        return Response.ok(service.listarOrders()).build();

    }

    @RolesAllowed("usuario_comum")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void inserir(OrdemDTO ordemDTO) {
        service.inserir(ordemDTO);
    }
}
