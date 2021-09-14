package espe.edu.cursos.service;

import espe.edu.cursos.entity.Curso;

import java.util.List;

public interface ICursoService {
    public void save(Curso curso);

    public List<Curso> findAll();

    public void delete(Curso curso);

    public Curso findById(Long id);

    public Curso findByNrc(String nrc);

    public boolean existsByNrc(String nrc);

    public boolean existsByNombre(String nombre);

}
