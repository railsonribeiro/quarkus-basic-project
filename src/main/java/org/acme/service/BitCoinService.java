package org.acme.service;

import java.util.List;

import org.acme.model.BitCoin;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/bitcoin")
@RegisterRestClient(configKey = "bitcoin-api")
public interface BitCoinService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BitCoin> listar();
}
