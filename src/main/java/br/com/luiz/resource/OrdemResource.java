package br.com.luiz.resource;

import java.time.LocalDate;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import br.com.luiz.model.Ordem;
import br.com.luiz.repository.OrdemRepository;

@Path("/ordens")
public class OrdemResource {

	@Inject
	OrdemRepository ordemRepository;

	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Ordem ordem) {
		ordem.setData(LocalDate.now());
		ordem.setStatus("ENVIADA");

		ordemRepository.persist(ordem);
	}
}
