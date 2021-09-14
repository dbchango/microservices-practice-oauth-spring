package espe.edu.cursos.repository;

import espe.edu.cursos.entity.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMateriaRep extends JpaRepository<Materia, Long> {


}
