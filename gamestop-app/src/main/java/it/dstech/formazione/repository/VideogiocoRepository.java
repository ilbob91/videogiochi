package it.dstech.formazione.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import it.dstech.formazione.model.Categoria;
import it.dstech.formazione.model.Pegi;
import it.dstech.formazione.model.Videogioco;

public interface VideogiocoRepository extends CrudRepository<Videogioco, Long>{

	
	public List<Videogioco> findByCategoriaOrderByPegiDesc(Categoria c);
	public List<Videogioco> findByCategoriaOrderByPrezzoDesc(Categoria c);
	public List<Videogioco> findByCategoriaOrderByTitoloAsc(Categoria c);
	public List<Videogioco> findByPegiOrderByCategoriaDesc(Pegi c);
	public List<Videogioco> findByPegiOrderByPrezzoDesc(Pegi c);
	public List<Videogioco> findByPegiOrderByTitoloAsc(Pegi c);
	public List<Videogioco> findByOrderByTitoloAsc();
	public List<Videogioco> findByOrderByPegiAsc();
	public List<Videogioco> findByOrderByPrezzoAsc();
	public List<Videogioco> findByOrderByCategoriaAsc();
}
