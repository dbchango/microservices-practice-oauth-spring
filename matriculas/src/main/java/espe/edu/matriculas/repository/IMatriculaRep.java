package espe.edu.matriculas.repository;

import espe.edu.matriculas.entities.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMatriculaRep extends JpaRepository<Matricula, Long> {
    List<Matricula> findAllByIdpersona(Long id_persona);
}
