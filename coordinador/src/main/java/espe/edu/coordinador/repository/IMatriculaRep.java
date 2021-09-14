package espe.edu.coordinador.repository;

import espe.edu.coordinador.entities.Matricula;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public interface IMatriculaRep {

    Matricula save(Matricula matricula) throws IOException, ExecutionException, InterruptedException;

    List<Matricula> getPersonaMatriculas(Long idpersona) throws IOException, ExecutionException, InterruptedException;

}
