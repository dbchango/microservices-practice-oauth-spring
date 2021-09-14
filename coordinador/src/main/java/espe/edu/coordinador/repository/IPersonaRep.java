package espe.edu.coordinador.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import espe.edu.coordinador.entities.Persona;

import java.util.concurrent.ExecutionException;

public interface IPersonaRep {

    Persona findByCedula(String ci) throws ExecutionException, InterruptedException, JsonProcessingException;

    Boolean existsByCedula(String ci) throws ExecutionException, InterruptedException, JsonProcessingException;

}
