package espe.edu.cursos.service;

import espe.edu.cursos.entity.Carrera;
import espe.edu.cursos.entity.Materia;
import espe.edu.cursos.repository.ICarreraRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraService implements ICarreraService {
    @Autowired
    private ICarreraRep dao;

    @Override
    public void save(Carrera carrera) {
        dao.saveAndFlush(carrera);
    }

    @Override
    public List<Carrera> findAll() {
        return dao.findAll();
    }
    @Override
    public void delete(Carrera carrera) {
        dao.delete(carrera);
    }

    @Override
    public List<Materia> findCarreraMaterias(long id){
        return dao.findById(id).get().getMaterias();
    }

    @Override
    public Carrera findById(Long id) {
        return dao.findById(id).get();
    }

}
