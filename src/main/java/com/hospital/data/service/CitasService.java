package com.hospital.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.data.model.Citas;
import com.hospital.data.model.CitasDTO;
import com.hospital.data.repository.CitasRepository;

@Service
public class CitasService {
	
	private final CitasRepository citaRepository;
	
	@Autowired
	public CitasService(CitasRepository citaRepository) {
		super();
		this.citaRepository = citaRepository;
	}

	public List<CitasDTO> getAll() {
		return citaRepository.findAllCitas();
	}

	public CitasDTO getCita(Long id_cita) {
		// TODO Auto-generated method stub
		return null;
	}

	public Citas saveCita(Citas cita) {
		return citaRepository.save(cita);
	}

	public Citas deleteCita(Long id_cita) {
		// TODO Auto-generated method stub
		return null;
	}

	public CitasDTO updateCita(Long id_cita, Citas cita) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTodo() {
		return "LO QUIERO TODO";
	}

}
