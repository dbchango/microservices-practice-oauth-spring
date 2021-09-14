package espe.edu.coordinador.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import espe.edu.coordinador.entities.Curso;
import espe.edu.coordinador.repository.CursoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class CursoService implements ICursoService {
    @Autowired
    CursoRep cursoRep;

    @Override
    public Curso findByNrc(String nrc) throws ExecutionException, InterruptedException, JsonProcessingException {
        return cursoRep.findByNrc(nrc);
    }

    @Override
    public Boolean existsByNrc(String nrc) throws ExecutionException, InterruptedException, JsonProcessingException {
        return cursoRep.existsByNrc(nrc);
    }
}
