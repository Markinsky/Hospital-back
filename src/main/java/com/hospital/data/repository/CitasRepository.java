package com.hospital.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital.data.model.Citas;
import com.hospital.data.model.CitasDTO;

@Repository
public interface CitasRepository extends JpaRepository<Citas, Long> {
	
	@Query("SELECT new com.hospital.data.model.CitasDTO (d.nombre, d.ap_pat, d.ap_mat, d.especialidad, con.num_cons, con.piso, c.hora_consulta, c.nom_paciente) FROM Citas c INNER JOIN c.doctor d INNER JOIN c.consultorio con")
	List<CitasDTO> findAllCitas();

}
