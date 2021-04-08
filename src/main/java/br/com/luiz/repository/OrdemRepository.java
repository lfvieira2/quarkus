package br.com.luiz.repository;

import javax.enterprise.context.ApplicationScoped;

import br.com.luiz.model.Ordem;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class OrdemRepository implements PanacheRepository<Ordem> {
	
}
