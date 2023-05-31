package com.cibertec.air.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.air.domain.Aerolinea;
import com.cibertec.air.service.AerolineaService;


@Controller
public class AerolineaController {

	@Autowired
	private AerolineaService aerolineaService;

	@GetMapping("/")
	public String inicio(Model model) {
		List<Aerolinea> aerolineas = aerolineaService.listarAerolineas();
		model.addAttribute("aerolineas", aerolineas);
		return "listadoAerolineas";

	}

	@GetMapping("/nuevo")
	public String cargarPagina(Model model) {
		model.addAttribute("aeroline", new Aerolinea());
		return "agregarAerolinea";

	}

	@PostMapping("/guardar")
	public String grabarAerolinea(@ModelAttribute Aerolinea aerolinea, Model model, RedirectAttributes attribute) {
		aerolineaService.guardar(aerolinea);
		attribute.addFlashAttribute("mensaje", "Aerolinea Guardada o Actualizada con exito");
		return "redirect:/";
	}

	@GetMapping("/editar/{idAerolinea}")
	public String editarPublicacion(@ModelAttribute Aerolinea aerolinea, Model model) {
		aerolinea = aerolineaService.encontrarAerolinea(aerolinea);
		model.addAttribute("aeroline", aerolineaService.encontrarAerolinea(aerolinea));
		return "editarAerolinea";

	}
	
	@PostMapping("/actualizar/{idAerolinea}")
	public String actualizarAerolinea(@ModelAttribute Aerolinea aerolinea,RedirectAttributes attribute) {
		Aerolinea actualizaAerolinea = aerolineaService.encontrarAerolinea(aerolinea);
		actualizaAerolinea.setNombre(aerolinea.getNombre());
		actualizaAerolinea.setRuc(aerolinea.getNombre());
		actualizaAerolinea.setRuc(aerolinea.getRuc());
		aerolineaService.guardar(actualizaAerolinea);
		attribute.addFlashAttribute("mensaje","Aerolinea Actualizada con Exito");
		return "redirect:/";
		
			
		
	}
	
	@GetMapping("/eliminar/{idAerolinea}")
	public String delete(Aerolinea aerolinea) {
		aerolineaService.eliminar(aerolinea);
		return "redirect:/";
	}

}
