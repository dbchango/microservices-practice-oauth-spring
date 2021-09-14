package espe.edu.matriculas.repository;

import espe.edu.matriculas.entities.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICuentaRep extends JpaRepository<Cuenta, Long> {
    boolean existsById(Long id);

}