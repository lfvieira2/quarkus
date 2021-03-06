package br.com.luiz.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.luiz.model.Bitcoin;
import br.com.luiz.service.BitcoinService;

@Path("bitcoins")
public class BitcoinResource {

	@Inject
	@RestClient
	BitcoinService bitcoinService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Bitcoin> listar(){
		return bitcoinService.listar();
	}
	
	
	
}
