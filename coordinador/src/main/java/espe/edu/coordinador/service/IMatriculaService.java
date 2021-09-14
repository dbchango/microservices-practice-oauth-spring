package espe.edu.coordinador.service;

import espe.edu.coordinador.entities.Matricula;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public interface IMatriculaService {
    public Matricula save(Matricula matricula) throws IOException, ExecutionException, InterruptedException;
    public List<Matricula> getPersonaMatriculas(Long idpersona) throws IOException, ExecutionException, InterruptedException;
}
