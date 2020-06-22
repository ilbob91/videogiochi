package it.dstech.formazione.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public List<Videogioco> findByTitolo(String titolo) {
		return repo.findByTitolo(titolo);
	}

	public List<Videogioco> findByCategoria(String cat) {
		return repo.findByCategoria(cat);
	}

	public List<Videogioco> findByPegi(String pegi) {
		return repo.findByPegi(pegi);
	}

	public List<Videogioco> findByPrezzo(Long prezzo) {
		return repo.findByPrezzo(prezzo);
	}
}
