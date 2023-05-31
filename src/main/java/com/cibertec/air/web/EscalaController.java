package com.cibertec.air.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.air.domain.Escala;
import com.cibertec.air.domain.ProgramaVuelo;
import com.cibertec.air.service.EscalaService;
import com.cibertec.air.service.ProgramaVueloService;

@Controller
public class EscalaController {
	
	@Autowired
	private EscalaService escalaService;
	
	@Autowired
	private ProgramaVueloService programaVueloService;
	
	
	@GetMapping("/escala")
	public String listarEscalas(Model model) {
		List<Escala> listaEscala = escalaService.listarEscala();
		model.addAttribute("escalas", listaEscala);
		return "listarEscalas";
	}
	
	@GetMapping("/nuevoEscala")
	public String agregarEscala(Model model){
		List<ProgramaVuelo> listaPrograma = programaVueloService.listarProgramaVuelo();
		model.addAttribute("programas", listaPrograma);
		model.addAttribute("escala", new Escala());
		return "agregarEscala";
	}
	
	@PostMapping("/guardarEscala")
	public String guardarEscala(@ModelAttribute Escala escala, RedirectAttributes attribute) {
		escalaService.guardar(escala);
		attribute.addFlashAttribute("mensaje","Grabado con exito");
		return "redirect:/escala";
	}
	
	@GetMapping("/editarEscala/{idEscala}")
	public String editarAeropuerto(@ModelAttribute Escala escala, Model model) {
			List<ProgramaVuelo> listaPrograma = programaVueloService.listarProgramaVuelo();
			escala = escalaService.encontrarEscala(escala);		
			model.addAttribute("programas", listaPrograma);			
			model.addAttribute("escala", escalaService.encontrarEscala(escala));
			return "editarEscala";
		
			
	}
	
	@PostMapping("/actualizarEscala/{idEscala}")
	public String actualizarAerpuerto(@ModelAttribute Escala escala,RedirectAttributes attribute) {
		Escala actualizaEscala = escalaService.encontrarEscala(escala);
		actualizaEscala.setNroOrden(escala.getNroOrden());
		actualizaEscala.setNroEscalas(escala.getNroEscalas());
		actualizaEscala.setSubePasajeros(escala.getSubePasajeros());
		actualizaEscala.setBajanPasajeros(escala.getBajanPasajeros());
		actualizaEscala.setProgramaVuelo(escala.getProgramaVuelo());
		actualizaEscala.setEstado(escala.getEstado());
		escalaService.guardar(actualizaEscala);		
		attribute.addFlashAttribute("mensaje","Actualizacion Guardada con exito");
		return "redirect:/escala";
	}
	
	@GetMapping("/eliminarEscala/{idEscala}")
	public String delete( Escala escala) {
		escalaService.eliminar(escala);
		return "redirect:/escala";
	}
	

}
