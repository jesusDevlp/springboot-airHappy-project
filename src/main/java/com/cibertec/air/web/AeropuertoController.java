package com.cibertec.air.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.air.domain.Aeropuerto;
import com.cibertec.air.domain.Pais;
import com.cibertec.air.service.AeropuertoService;
import com.cibertec.air.service.PaisService;

@Controller
public class AeropuertoController {
	
	@Autowired
	private AeropuertoService aeropuertoService;
	
	@Autowired
	private PaisService paisService;

	
	@GetMapping("/aeropuertos")
	public String listarAeropuertos(Model model) {
		List<Aeropuerto> listaAeropuerto = aeropuertoService.listarAeropuerto();
		model.addAttribute("aeropuertos", listaAeropuerto);
		return "listarAeropuertos";
	}
	
	@GetMapping("/nuevoAeropuerto")
	public String agregarAerpuerto(Model model){
		List<Pais> listaPais = paisService.listarPaises();
		model.addAttribute("paises", listaPais);
		model.addAttribute("aeropuerto", new Aeropuerto());
		return "agregarAeropuerto";
	}
	
	@PostMapping("/guardarAeropuerto")
	public String guardarAeropuerto(@ModelAttribute Aeropuerto aeropuerto, RedirectAttributes attribute) {
		aeropuertoService.guardar(aeropuerto);
		attribute.addFlashAttribute("mensaje","Grabado con exito");
		return "redirect:/aeropuertos";
	}
	
	
	@GetMapping("/editarAeropuerto/{idAeropuerto}")
	public String editarAeropuerto(@ModelAttribute Aeropuerto aeropuerto, Model model) {
			List<Pais> listaPais = paisService.listarPaises();
			aeropuerto =aeropuertoService.encontrarAeropuerto(aeropuerto);			
			model.addAttribute("paises", listaPais);			
			model.addAttribute("aeropuerto", aeropuertoService.encontrarAeropuerto(aeropuerto));
			return "editarAeropuerto";
		
			
	}
	
	
	@PostMapping("/actualizarAeropuerto/{idAeropuerto}")
	public String actualizarAerpuerto(@ModelAttribute Aeropuerto aeropuerto,RedirectAttributes attribute) {
		Aeropuerto actualizaAeropuerto = aeropuertoService.encontrarAeropuerto(aeropuerto);
		actualizaAeropuerto.setNombre(aeropuerto.getNombre());
		actualizaAeropuerto.setCiudad(aeropuerto.getCiudad());
		actualizaAeropuerto.setPais(aeropuerto.getPais());
		actualizaAeropuerto.setCantAterrizajes(aeropuerto.getCantAterrizajes());
		actualizaAeropuerto.setCantDespegues(aeropuerto.getCantDespegues());
		actualizaAeropuerto.setEstado(aeropuerto.getEstado());
		aeropuertoService.guardar(actualizaAeropuerto);
			
		attribute.addFlashAttribute("mensaje","Actualizacion Guardada con exito");
		return "redirect:/aeropuertos";
	}
	
	@GetMapping("/eliminarAeropuerto/{idAeropuerto}")
	public String delete( Aeropuerto aeropuerto) {
		aeropuertoService.eliminar(aeropuerto);
		return "redirect:/aeropuertos";
	}
		
	
}
