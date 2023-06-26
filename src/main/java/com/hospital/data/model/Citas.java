package com.hospital.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Citas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_citas")
	private long id;
	@ManyToOne
	@JoinColumn(name = "id_consultorio")
	private Consultorio consultorio;
	@ManyToOne
	@JoinColumn(name = "id_doctor")
	private Doctor doctor;
	private String hora_consulta;
	private String nom_paciente;
	
	public Citas(long id, Consultorio consultorio, Doctor doctor, String hora_consulta, String nom_paciente) {
		super();
		this.id = id;
		this.consultorio = consultorio;
		this.doctor = doctor;
		this.hora_consulta = hora_consulta;
		this.nom_paciente = nom_paciente;
	}

	public Citas() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Consultorio getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getHora_consulta() {
		return hora_consulta;
	}

	public void setHora_consulta(String hora_consulta) {
		this.hora_consulta = hora_consulta;
	}

	public String getNom_paciente() {
		return nom_paciente;
	}

	public void setNom_paciente(String nom_paciente) {
		this.nom_paciente = nom_paciente;
	}

	@Override
	public String toString() {
		return "Citas [id=" + id + ", consultorio=" + consultorio + ", doctor=" + doctor + ", hora_consulta="
				+ hora_consulta + ", nom_paciente=" + nom_paciente + "]";
	}
	

	
}
