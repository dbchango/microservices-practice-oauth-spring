package espe.edu.personas.repository;

import espe.edu.personas.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRep extends JpaRepository<Persona, Long> {

    boolean existsById(Long id);

    boolean existsByCedula(String ci);

    Persona findByCedula(String ci);

}
