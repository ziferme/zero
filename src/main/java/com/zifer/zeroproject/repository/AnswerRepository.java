package com.zifer.zeroproject.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zifer.zeroproject.entity.Answer;
import com.zifer.zeroproject.entity.Author;

@Repository("answerRepository")
public interface AnswerRepository extends JpaRepository<Answer, Serializable>{


	
	@Query("SELECT t FROM Answer t WHERE t.ID_ANSWER = ?1")
	Answer findAnswerBy(int ID_ANSWER);
	
	/*@Transactional
	@Modifying
	@Query("DELETE FROM Juridiccion t WHERE t.ID_JURISDICCION_ALTO_RIESGO = ?1")
	void removeAuthor(int ID_JURISDICCION_ALTO_RIESGO);

	@Transactional
	@Modifying
	@Query("UPDATE Juridiccion t SET t.JURISDICCION_ALTO_RIESGO = ?1, ESTATUS = ?2 WHERE t.ID_JURISDICCION_ALTO_RIESGO = ?3")
	void updateAuthorBy(String JURISDICCION_ALTO_RIESGO, String ESTATUS, int ID_JURISDICCION_ALTO_RIESGO );
	 */

}
