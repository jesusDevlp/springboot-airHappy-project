package com.cibertec.air.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.air.domain.Departamento;
import com.cibertec.air.domain.Empleado;
import com.cibertec.air.service.DepartamentoService;
import com.cibertec.air.service.EmpleadoService;

@Controller
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping("/empleados")
	public String listarEmpleados(Model model) {
		List<Empleado> listaEmpleado = empleadoService.listarEmpleado();
		model.addAttribute("empleados", listaEmpleado);
		return "listarEmpleados";
	}
	
	
	@GetMapping("/nuevoEmpleado")
	public String agregarEmpleado(Model model){
		List<Departamento> listaDepartamento = departamentoService.listarDepartamentos();
		model.addAttribute("departamentos", listaDepartamento);
		model.addAttribute("empleado", new Empleado());
		return "agregarEmpleado";
	}
	
	@PostMapping("/guardarEmpleado")
	public String guardarEmpleado(@ModelAttribute Empleado empleado, RedirectAttributes attribute) {
		empleadoService.guardar(empleado);
		attribute.addFlashAttribute("mensaje","Grabado con exito");
		return "redirect:/empleados";
	}
	
	@GetMapping("/editarEmpleado/{idEmpleado}")
	public String editarAeropuerto(@ModelAttribute Empleado empleado, Model model) {
			List<Departamento> listaDepartamento = departamentoService.listarDepartamentos();
			empleado = empleadoService.encontrarEmpleado(empleado);;			
			model.addAttribute("departamentos", listaDepartamento);			
			model.addAttribute("empleado", empleadoService.encontrarEmpleado(empleado));
			return "editarEmpleado";
		
			
	}
	
	
	@PostMapping("/actualizarEmpleado/{idEmpleado}")
	public String actualizarAerpuerto(@ModelAttribute Empleado empleado,RedirectAttributes attribute) {
		Empleado actualizaEmpleado = empleadoService.encontrarEmpleado(empleado);
		actualizaEmpleado.setNombre(empleado.getNombre());
		actualizaEmpleado.setApellido(empleado.getApellido());
		actualizaEmpleado.setEdad(empleado.getEdad());
		actualizaEmpleado.setSalario(empleado.getSalario());
		actualizaEmpleado.setDepartamento(empleado.getDepartamento());
		actualizaEmpleado.setEstado(empleado.getEstado());
		empleadoService.guardar(actualizaEmpleado);			
		attribute.addFlashAttribute("mensaje","Actualizacion Guardada con exito");
		return "redirect:/empleados";
	}
	
	@GetMapping("/eliminarEmpleado/{idEmpleado}")
	public String delete( Empleado empleado) {
		empleadoService.eliminar(empleado);
		return "redirect:/empleados";
	}
	

}
