package com.hospital.data.model;

public class CitasDTO {
	private String nombre;
	private String ap_pat;
	private String ap_mat;
	private String especialidad;
	private String num_cons;
	private String piso;
	private String hora_consulta;
	private String nom_paciente;
	
	public CitasDTO(String nombre, String ap_pat, String ap_mat, String especialidad, String num_cons, String piso,
			String hora_consulta, String nom_paciente) {
		super();
		this.nombre = nombre;
		this.ap_pat = ap_pat;
		this.ap_mat = ap_mat;
		this.especialidad = especialidad;
		this.num_cons = num_cons;
		this.piso = piso;
		this.hora_consulta = hora_consulta;
		this.nom_paciente = nom_paciente;
	}

	public CitasDTO() {
		super();
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

	public String getNum_cons() {
		return num_cons;
	}

	public void setNum_cons(String num_cons) {
		this.num_cons = num_cons;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
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
		return "CitasDTO [nombre=" + nombre + ", ap_pat=" + ap_pat + ", ap_mat=" + ap_mat + ", especialidad="
				+ especialidad + ", num_cons=" + num_cons + ", piso=" + piso + ", hora_consulta=" + hora_consulta
				+ ", nom_paciente=" + nom_paciente + "]";
	}
	
	
	
}
