package com.jlm.juridiccion.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jlm.juridiccion.entity.Juridiccion;


@Repository("juridiccionRepository")
public interface JuridiccionRepository extends JpaRepository<Juridiccion, Serializable>{
	
	@Query("SELECT t FROM Juridiccion t WHERE t.ID_JURISDICCION_ALTO_RIESGO = ?1")
	Juridiccion findJuridiccionBy(int ID_JURISDICCION_ALTO_RIESGO);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Juridiccion t WHERE t.ID_JURISDICCION_ALTO_RIESGO = ?1")
	void removeJuridiccion(int ID_JURISDICCION_ALTO_RIESGO);

	@Transactional
	@Modifying
	@Query("UPDATE Juridiccion t SET t.JURISDICCION_ALTO_RIESGO = ?1, ESTATUS = ?2 WHERE t.ID_JURISDICCION_ALTO_RIESGO = ?3")
	void updateJuridiccionBy(String JURISDICCION_ALTO_RIESGO, String ESTATUS, int ID_JURISDICCION_ALTO_RIESGO );
	

}
