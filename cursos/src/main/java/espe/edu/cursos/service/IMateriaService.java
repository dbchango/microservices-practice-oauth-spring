package espe.edu.cursos.service;

import espe.edu.cursos.entity.Curso;
import espe.edu.cursos.entity.Materia;

import java.util.List;

public interface IMateriaService {
    public void save(Materia materia);

    public List<Materia> findAll();

    public void delete(Materia materia);

    public List<Curso> findMateriaCursos(long id);
}
