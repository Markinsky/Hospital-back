package com.hospital.data.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.data.model.Citas;
import com.hospital.data.model.CitasDTO;
import com.hospital.data.service.CitasService;

@RestController
@RequestMapping(path = "/citas/")
public class CitasController {
	
	private final CitasService citasService;
	
	@Autowired
	public CitasController(CitasService citasService) {
		super();
		this.citasService = citasService;
	}

	
	@GetMapping
	public List<CitasDTO> getAll(){
		return citasService.getAll();
	}
	
	@GetMapping(path = "/todo/")
	public String getTodo() {
		return citasService.getTodo();
	}
	
	/*
	@GetMapping
	public String getAll(){
		return "Si entra";
	}
	*/
	
	@GetMapping(path = "{id_cita}")
	public CitasDTO getCita(@PathVariable("id_cita") Long id_cita) {
		return citasService.getCita(id_cita);
	}
	
	@PostMapping
	public Citas saveCita(@RequestBody Citas cita) {
		return citasService.saveCita(cita);
	}
	
	@DeleteMapping(path = "{id_cita}")
	public Citas deleteCita(@PathVariable("id_cita") Long id_cita) {
		return citasService.deleteCita(id_cita);
	}

	@PutMapping(path = "{id_cita}")
	public CitasDTO updateCita(@PathVariable("id_cita") Long id_cita, @RequestBody Citas cita) {
		return citasService.updateCita(id_cita, cita);
	}
}
