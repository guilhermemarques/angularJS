package br.com.rest.api.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import br.com.rest.api.model.entities.Client;

@Path("/clients")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClientService {

	private static final String DEFAULT_PAGE_RANGE = "20";

	@GET
	public List<Client> getAll(@QueryParam("page") int page, @DefaultValue(DEFAULT_PAGE_RANGE) @QueryParam("range") int range) {
		return new ArrayList<>();
	}

	@GET
	@Path("{cpf}")
	public Client getByCPF(@PathParam("cpf") String cpf) {
		if ((cpf == null) || cpf.isEmpty()) {
			throw new WebApplicationException(Status.NOT_FOUND);
		}
		Client client = new Client();
		client.setCpf(cpf);
		return client;
	}

	@POST
	public Client insertClient(Client client) {
		client.setName("First client!");
		return client;
	}

	@PUT
	@Path("{cpf}")
	public void updateClient(@PathParam("cpf") String cpf, Client client) {
		if ((cpf == null) || cpf.isEmpty()) {
			throw new WebApplicationException(Status.NOT_FOUND);
		}
	}

	@DELETE
	@Path("{cpf}")
	public void deleteClient(@PathParam("cpf") String cpf) {
		if ((cpf == null) || cpf.isEmpty()) {
			throw new WebApplicationException(Status.NOT_FOUND);
		}
	}

}
