package it.dstech.formazione.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import it.dstech.formazione.model.Videogioco;

public interface VideogiocoRepository extends CrudRepository<Videogioco, Long>{

	public List<Videogioco> findByTitolo(String titolo);
	public List<Videogioco> findByPegi(String pegi);
	public List<Videogioco> findByCategoria(String categoria);
	public List<Videogioco> findByPrezzo(Long prezzo);
}
