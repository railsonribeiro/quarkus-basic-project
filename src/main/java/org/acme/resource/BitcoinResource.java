package org.acme.resource;

import java.util.List;

import org.acme.model.BitCoin;
import org.acme.service.BitCoinService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/bitcoin")
public class BitcoinResource {

    @Inject
    @RestClient
    BitCoinService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BitCoin> listar(){
        // return service.listar();
        return List.of(new BitCoin());
    }
    
}
