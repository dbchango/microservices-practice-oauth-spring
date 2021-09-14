package espe.edu.cursos.repository;

import espe.edu.cursos.entity.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarreraRep extends JpaRepository<Carrera, Long> {

}
