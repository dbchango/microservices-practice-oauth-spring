package espe.edu.coordinador.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import espe.edu.coordinador.entities.Curso;

import java.util.concurrent.ExecutionException;

public interface ICursoService {
    public Curso findByNrc(String nrc) throws ExecutionException, InterruptedException, JsonProcessingException;
    public Boolean existsByNrc(String nrc) throws ExecutionException, InterruptedException, JsonProcessingException;
}
