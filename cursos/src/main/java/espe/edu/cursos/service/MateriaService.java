package espe.edu.cursos.service;

import espe.edu.cursos.entity.Curso;
import espe.edu.cursos.entity.Materia;
import espe.edu.cursos.repository.IMateriaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MateriaService implements IMateriaService{

    @Autowired
    private IMateriaRep dao;

    @Override
    public void save(Materia materia) {
        dao.saveAndFlush(materia);
    }

    @Override
    public List<Materia> findAll() {
        return dao.findAll();
    }

    @Override
    public void delete(Materia materia) {
        dao.delete(materia);
    }

    @Override
    public List<Curso> findMateriaCursos(long id) {
        return null;
    }

}
