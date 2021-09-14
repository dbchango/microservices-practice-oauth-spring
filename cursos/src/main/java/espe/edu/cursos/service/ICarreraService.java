package espe.edu.cursos.service;

import espe.edu.cursos.entity.Carrera;
import espe.edu.cursos.entity.Materia;

import java.util.List;

public interface ICarreraService {
    public void save(Carrera carrera);

    public List<Carrera> findAll();

    public void delete(Carrera carrera);

    public List<Materia> findCarreraMaterias(long id);

    public Carrera findById(Long id);
}
