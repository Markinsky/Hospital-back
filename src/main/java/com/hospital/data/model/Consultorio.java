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
public class Consultorio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consultorio")
	private long id;
	private String num_cons;
	private String piso;
	@OneToMany(mappedBy = "consultorio")
	private List<Citas> citas;
	
	public Consultorio(long id, String num_cons, String piso, List<Citas> citas) {
		super();
		this.id = id;
		this.num_cons = num_cons;
		this.piso = piso;
		this.citas = citas;
	}

	public Consultorio() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public List<Citas> getCitas() {
		return citas;
	}

	public void setCitas(List<Citas> citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "Consultorio [id=" + id + ", num_cons=" + num_cons + ", piso=" + piso + ", citas=" + citas + "]";
	}
	
	
	
	
}
