package espe.edu.coordinador.service;

import espe.edu.coordinador.entities.Matricula;
import espe.edu.coordinador.repository.MatriculaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class MatriculaService implements IMatriculaService {

    @Autowired
    MatriculaRep matriculaRep;

    @Override
    public Matricula save(Matricula matricula) throws IOException, ExecutionException, InterruptedException {
        return matriculaRep.save(matricula);
    }

    @Override
    public List<Matricula> getPersonaMatriculas(Long idpersona) throws IOException, ExecutionException, InterruptedException {
        return matriculaRep.getPersonaMatriculas(idpersona);
    }
}
