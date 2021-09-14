package espe.edu.cursos.service;

import espe.edu.cursos.entity.Curso;
import espe.edu.cursos.repository.ICursoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements ICursoService{

    @Autowired
    private ICursoRep dao;

    @Override
    public void save(Curso curso) {
        dao.saveAndFlush(curso);
    }

    @Override
    public List<Curso> findAll() {
        return dao.findAll();
    }

    @Override
    public void delete(Curso curso) {
        dao.delete(curso);
    }

    @Override
    public Curso findById(Long id) {
        return dao.findById(id).get();
    }

    @Override
    public Curso findByNrc(String nrc) {
        return dao.findByNrc(nrc);
    }

    @Override
    public boolean existsByNrc(String nrc) {
        return dao.existsByNrc(nrc);
    }

    @Override
    public boolean existsByNombre(String nombre) {
        return dao.existsByNombre(nombre);
    }

}
