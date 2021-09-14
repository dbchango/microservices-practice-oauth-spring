package espe.edu.matriculas.service;

import espe.edu.matriculas.entities.Matricula;
import espe.edu.matriculas.repository.IMatriculaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService  implements IMatriculaService{

    @Autowired
    private IMatriculaRep dao;

    @Override
    public void save(Matricula matricula) {
        dao.saveAndFlush(matricula);
    }

    @Override
    public List<Matricula> findAll() {
        return dao.findAll();
    }

    @Override
    public void delete(Matricula matricula) {
        dao.delete(matricula);
    }

    @Override
    public Matricula findById(Long id) {
        return dao.findById(id).get();
    }

    @Override
    public List<Matricula> findAllByIdpersona(Long id_persona) {
        return dao.findAllByIdpersona(id_persona);
    }

}
