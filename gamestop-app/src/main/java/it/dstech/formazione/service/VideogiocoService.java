package it.dstech.formazione.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import it.dstech.formazione.model.Categoria;
import it.dstech.formazione.model.Pegi;
import it.dstech.formazione.model.Videogioco;
import it.dstech.formazione.repository.VideogiocoRepository;

@Service
@Transactional
public class VideogiocoService {
	@Autowired
	private VideogiocoRepository repo;

	public void save(Videogioco videogioco) {
		repo.save(videogioco);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

	public List<Videogioco> listAll() {
		return (List<Videogioco>) repo.findAll();
	}

	public Videogioco get(Long id) {
		return repo.findById(id).get();
	}


	public List<Videogioco> findByCategoriaOrderByPegiDesc(Categoria c) {
		return repo.findByCategoriaOrderByPegiDesc(c);
	}
	public List<Videogioco> findByCategoriaOrderByTitoloAsc(Categoria c) {
		return repo.findByCategoriaOrderByTitoloAsc(c);
	}
	public List<Videogioco> findByCategoriaOrderByPrezzoDesc(Categoria c) {
		return repo.findByCategoriaOrderByPrezzoDesc(c);
	}
	public List<Videogioco> findByPegiOrderByCategoriaDesc(Pegi c) {
		return repo.findByPegiOrderByCategoriaDesc(c);
	}
	public List<Videogioco> findByPegiOrderByTitoloAsc(Pegi c) {
		return repo.findByPegiOrderByTitoloAsc(c);
	}
	public List<Videogioco> findByPegiOrderByPrezzoDesc(Pegi c) {
		return repo.findByPegiOrderByPrezzoDesc(c);
	}
	public List<Videogioco> findByOrderByTitoloAsc(){
		return repo.findByOrderByTitoloAsc();
	}
	public List<Videogioco> findByOrderByPegiAsc(){
		return repo.findByOrderByPegiAsc();
	}
	public List<Videogioco> findByOrderByPrezzoAsc(){
		return repo.findByOrderByPrezzoAsc();
	}
	public List<Videogioco> findByOrderByCategoriaAsc(){
		return repo.findByOrderByCategoriaAsc();
	}
}
