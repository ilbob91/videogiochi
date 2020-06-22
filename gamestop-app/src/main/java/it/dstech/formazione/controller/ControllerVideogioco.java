package it.dstech.formazione.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.formazione.model.Categoria;
import it.dstech.formazione.model.Pegi;
import it.dstech.formazione.model.Videogioco;
import it.dstech.formazione.service.VideogiocoService;

@Controller
public class ControllerVideogioco {
	@Autowired
	private VideogiocoService service;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		List<Videogioco> listaGiochi = service.listAll();
		Videogioco v = null;
		mav.addObject("videogioco", v);
		mav.addObject("listaGiochi", listaGiochi);
		return mav;
	}

	@RequestMapping("/new")
	public String newVideogiocoForm(Model model) {
		Videogioco v = new Videogioco();
		model.addAttribute("videogioco", v);
		return "nuovoVideogioco";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveVideogioco(@ModelAttribute("videogioco") Videogioco vid) {
		service.save(vid);
		;
		return "redirect:/";
	}

	@RequestMapping("/edit")
	public ModelAndView editVideogiocoForm(@RequestParam long id) {
		ModelAndView model = new ModelAndView("modificaVideogioco");
		Videogioco v = service.get(id);
		model.addObject("videogioco", v);

		return model;
	}

	@RequestMapping("/delete")
	public String deleteVideogiocoForm(@RequestParam long id) {
		service.delete(id);
		return "redirect:/";
	}

	@RequestMapping(value = "/indietro")
	public String indietro() {
		return "redirect:/";
	}

	@RequestMapping("/listeCategoria")
	public ModelAndView findByCat(@RequestParam("categoria") int categoria, @RequestParam("field") int field) {
		ModelAndView model = new ModelAndView("liste");
		List<Videogioco> lista = null;
		

		switch (categoria) {
		case 0: switch (field) {
		case 0: 
			lista = service.findByCategoriaOrderByTitoloAsc(Categoria.HORROR);
			break;
		case 1: 
			lista = service.findByCategoriaOrderByPegiDesc(Categoria.HORROR);
			break;
		case 2: 
			lista = service.findByCategoriaOrderByPrezzoDesc(Categoria.HORROR);
			break;
		}
			break;
		case 1: switch (field) {
		case 0: 
			lista = service.findByCategoriaOrderByTitoloAsc(Categoria.SPORT);
			break;
		case 1: 
			lista = service.findByCategoriaOrderByPegiDesc(Categoria.SPORT);
			break;
		case 2: 
			lista = service.findByCategoriaOrderByPrezzoDesc(Categoria.SPORT);
			break;
		}
			break;
		case 2: switch (field) {
		case 0: 
			lista = service.findByCategoriaOrderByTitoloAsc(Categoria.FPS);
			break;
		case 1: 
			lista = service.findByCategoriaOrderByPegiDesc(Categoria.FPS);
			break;
		case 2: 
			lista = service.findByCategoriaOrderByPrezzoDesc(Categoria.FPS);
			break;
		}
			break;
		case 3: switch (field) {
		case 0: 
			lista = service.findByOrderByTitoloAsc();
			break;
		case 1: 
			lista = service.findByOrderByPegiAsc();
			break;
		case 2: 
			lista = service.findByOrderByPrezzoAsc();
			break;
		}
			break;
		}

		model.addObject("lista", lista);
	
		return model;
	}
	@RequestMapping("/listePegi")
	public ModelAndView findByPegi(@RequestParam("pegi") int categoria, @RequestParam("field") int field) {
		ModelAndView model = new ModelAndView("liste");
		List<Videogioco> lista = null;
		

		switch (categoria) {
		case 0: switch (field) {
		case 0: 
			lista = service.findByPegiOrderByTitoloAsc(Pegi.DICIOTTO);
			break;
		case 1: 
			lista = service.findByPegiOrderByCategoriaDesc(Pegi.DICIOTTO);
			break;
		case 2: 
			lista = service.findByPegiOrderByPrezzoDesc(Pegi.DICIOTTO);
			break;
		}
			break;
		case 1: switch (field) {
		case 0: 
			lista = service.findByPegiOrderByTitoloAsc(Pegi.SEDICI);
			break;
		case 1: 
			lista = service.findByPegiOrderByCategoriaDesc(Pegi.SEDICI);
			break;
		case 2: 
			lista = service.findByPegiOrderByPrezzoDesc(Pegi.SEDICI);
			break;
		}
			break;
		case 2: switch (field) {
		case 0: 
			lista = service.findByPegiOrderByTitoloAsc(Pegi.TRE);
			break;
		case 1: 
			lista = service.findByPegiOrderByCategoriaDesc(Pegi.TRE);
			break;
		case 2: 
			lista = service.findByPegiOrderByPrezzoDesc(Pegi.TRE);
			break;
		}
			break;
		case 3: switch (field) {
		case 0: 
			lista = service.findByOrderByTitoloAsc();
			break;
		case 1: 
			lista = service.findByOrderByPegiAsc();
			break;
		case 2: 
			lista = service.findByOrderByPrezzoAsc();
			break;
		}
			break;
		}

		model.addObject("lista", lista);
	
		return model;
	}
	
}
