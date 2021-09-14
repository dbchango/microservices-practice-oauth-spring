package espe.edu.cursos.repository;

import espe.edu.cursos.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRep extends JpaRepository<Curso, Long> {
    Curso findByNrc(String nrc);

    boolean existsByNombre(String nombre);

    boolean existsByNrc(String nrc);

}
