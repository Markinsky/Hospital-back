package com.hospital.data.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doctor")
	private long id;
	private String nombre;
	private String ap_pat;
	private String ap_mat;
	private String especialidad;
	@OneToMany(mappedBy = "doctor")
	private List<Citas> citas;
	
	public Doctor(long id, String nombre, String ap_pat, String ap_mat, String especialidad, List<Citas> citas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ap_pat = ap_pat;
		this.ap_mat = ap_mat;
		this.especialidad = especialidad;
		this.citas = citas;
	}

	public Doctor() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp_pat() {
		return ap_pat;
	}

	public void setAp_pat(String ap_pat) {
		this.ap_pat = ap_pat;
	}

	public String getAp_mat() {
		return ap_mat;
	}

	public void setAp_mat(String ap_mat) {
		this.ap_mat = ap_mat;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public List<Citas> getCitas() {
		return citas;
	}

	public void setCitas(List<Citas> citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", nombre=" + nombre + ", ap_pat=" + ap_pat + ", ap_mat=" + ap_mat
				+ ", especialidad=" + especialidad + ", citas=" + citas + "]";
	}
	
	
}
