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

	@RequestMapping("/liste")
	public ModelAndView findBy(@RequestParam int scelta, @RequestParam String string) {
		ModelAndView model = new ModelAndView("liste");
		List<Videogioco> lista = null;

		switch (scelta) {
		case 0:
			lista = service.findByTitolo(string);
			break;
		case 1:
			lista = service.findByPrezzo(Long.parseLong(string));
			break;
		case 2:
			lista = service.findByCategoria(string);
			break;
		case 3:
			lista = service.findByPegi(string);
			break;

		}

		model.addObject("lista", lista);
		return model;
	}
}
