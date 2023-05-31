package com.cibertec.air.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.air.domain.ProgramaVuelo;
import com.cibertec.air.domain.Vuelo;
import com.cibertec.air.service.ProgramaVueloService;
import com.cibertec.air.service.VueloService;

@Controller
public class VueloController {
	
	@Autowired
	private VueloService vueloService;
	
	@Autowired
	private ProgramaVueloService progamaVueloService;

	
	@GetMapping("/vuelo")
	public String listarVuelos(Model model) {
		List<Vuelo> listaVuelo = vueloService.listarVuelo();
		model.addAttribute("vuelos", listaVuelo);
		return "listarVuelos";
	}
	
	@GetMapping("/nuevoVuelo")
	public String agregarVuelo(Model model){
		List<ProgramaVuelo> listaPrograma = progamaVueloService.listarProgramaVuelo();
		model.addAttribute("programas", listaPrograma);
		model.addAttribute("vuelo", new Vuelo());
		return "agregarVuelo";
	}
	
	@PostMapping("/guardarVuelo")
	public String guardarVuelo(@ModelAttribute Vuelo vuelo, RedirectAttributes attribute) {
		vueloService.guardar(vuelo);
		attribute.addFlashAttribute("mensaje","Grabado con exito");
		return "redirect:/vuelo";
	}
	
	
	@GetMapping("/editarVuelo/{idVuelo}")
	public String editarAeropuerto(@ModelAttribute Vuelo vuelo, Model model) {
			List<ProgramaVuelo> listaPrograma = progamaVueloService.listarProgramaVuelo();
			vuelo = vueloService.encontrarVuelo(vuelo);			
			model.addAttribute("programas", listaPrograma);			
			model.addAttribute("vuelo", vueloService.encontrarVuelo(vuelo));
			return "editarVuelo";
		
			
	}
	
	@PostMapping("/actualizarVuelo/{idVuelo}")
	public String actualizarAerpuerto(@ModelAttribute Vuelo vuelo,RedirectAttributes attribute) {
		Vuelo actualizaVuelo = vueloService.encontrarVuelo(vuelo);
		actualizaVuelo.setProgramaVuelo(vuelo.getProgramaVuelo());
		actualizaVuelo.setFecha(vuelo.getFecha());
		actualizaVuelo.setPlazasVacias(vuelo.getPlazasVacias());
		actualizaVuelo.setEstado(vuelo.getEstado());
		vueloService.guardar(actualizaVuelo);		
		attribute.addFlashAttribute("mensaje","Actualizacion Guardada con exito");
		return "redirect:/vuelo";
	}
	
	@GetMapping("/eliminarVuelo/{idVuelo}")
	public String delete( Vuelo vuelo) {
		vueloService.eliminar(vuelo);
		return "redirect:/vuelo";
	}
	
	
	
}
