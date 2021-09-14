package espe.edu.matriculas.service;

import espe.edu.matriculas.entities.Matricula;

import java.util.List;

public interface IMatriculaService {

    public void save(Matricula matricula);

    public List<Matricula> findAll();

    public void delete(Matricula matricula);

    public Matricula findById(Long id);

    public List<Matricula> findAllByIdpersona(Long id_persona);

}
