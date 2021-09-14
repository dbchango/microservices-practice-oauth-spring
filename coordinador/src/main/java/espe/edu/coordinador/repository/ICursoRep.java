package espe.edu.coordinador.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import espe.edu.coordinador.entities.Curso;

import java.util.concurrent.ExecutionException;

public interface ICursoRep {
    Curso findByNrc(String nrc) throws ExecutionException, InterruptedException, JsonProcessingException;

    Boolean existsByNrc(String nrc) throws ExecutionException, InterruptedException;
}
