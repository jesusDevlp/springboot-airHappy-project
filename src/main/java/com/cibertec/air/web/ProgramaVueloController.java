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
import com.cibertec.air.domain.Aeropuerto;
import com.cibertec.air.domain.ProgramaVuelo;
import com.cibertec.air.service.AerolineaService;
import com.cibertec.air.service.AeropuertoService;
import com.cibertec.air.service.ProgramaVueloService;

@Controller
public class ProgramaVueloController {
	
	@Autowired
	private ProgramaVueloService programaVueloService;
	
	@Autowired
	private AerolineaService aerolineaService;
	
	@Autowired
	private AeropuertoService aeropuertoService;
	
	@GetMapping("/programaVuelo")
	public String listarProgramas(Model model) {
		List<ProgramaVuelo> listaPrograma = programaVueloService.listarProgramaVuelo();
		model.addAttribute("programas", listaPrograma);
		return "listarProgramas";
	}
	
	@GetMapping("/nuevoPrograma")
	public String agregarPrograma(Model model){
		List<Aerolinea> listaAerolinea = aerolineaService.listarAerolineas();
		List<Aeropuerto> listaAeropuertos = aeropuertoService.listarAeropuerto();
		model.addAttribute("aerolineas", listaAerolinea);
		model.addAttribute("aeropuertos", listaAeropuertos);
		model.addAttribute("programa", new ProgramaVuelo());
		return "agregarPrograma";
	}
	
	@PostMapping("/guardarPrograma")
	public String guardarPrograma(@ModelAttribute ProgramaVuelo programaVuelo, RedirectAttributes attribute) {
		programaVueloService.guardar(programaVuelo);
		attribute.addFlashAttribute("mensaje","Grabado con exito");
		return "redirect:/programaVuelo";
	}
	
	@GetMapping("/editarPrograma/{idPrograma}")
	public String editarPrograma(@ModelAttribute ProgramaVuelo programaVuelo, Model model) {
			List<Aerolinea> listaAerolinea = aerolineaService.listarAerolineas();
			List<Aeropuerto> listaAeropuertos = aeropuertoService.listarAeropuerto();
			programaVuelo = programaVueloService.encontrarProgramaVuelo(programaVuelo);
			model.addAttribute("aerolineas", listaAerolinea);
			model.addAttribute("aeropuertos", listaAeropuertos);			
			model.addAttribute("programa", programaVueloService.encontrarProgramaVuelo(programaVuelo));
			return "editarPrograma";
	
	}
	
	@PostMapping("/actualizarPrograma/{idPrograma}")
	public String actualizarAerpuerto(@ModelAttribute ProgramaVuelo programaVuelo,RedirectAttributes attribute) {
		ProgramaVuelo actualizaPrograma = programaVueloService.encontrarProgramaVuelo(programaVuelo);
		actualizaPrograma.setAerolinea(programaVuelo.getAerolinea());
		actualizaPrograma.setDiasDisponibles(programaVuelo.getDiasDisponibles());
		actualizaPrograma.setLugarDespegue(programaVuelo.getLugarDespegue());
		actualizaPrograma.setLugarLlegada(programaVuelo.getLugarLlegada());
		actualizaPrograma.setAeropuerto(programaVuelo.getAeropuerto());
		actualizaPrograma.setEstado(programaVuelo.getEstado());
		programaVueloService.guardar(actualizaPrograma);	
		attribute.addFlashAttribute("mensaje","Actualizacion Guardada con exito");
		return "redirect:/programaVuelo";
	}
	
	@GetMapping("/eliminarPrograma/{idPrograma}")
	public String delete( ProgramaVuelo programaVuelo) {
		programaVueloService.eliminar(programaVuelo);
		return "redirect:/programaVuelo";
	}
	
}
