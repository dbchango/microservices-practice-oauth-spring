package espe.edu.matriculas.service;

import espe.edu.matriculas.entities.Cuenta;
import espe.edu.matriculas.repository.ICuentaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaService implements ICuentaService{
    @Autowired
    ICuentaRep dao;

    @Override
    public List<Cuenta> findAll() {
        return dao.findAll();
    }

    @Override
    public void save(Cuenta cuenta) {
        dao.saveAndFlush(cuenta);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return dao.existsById(id);
    }

    @Override
    public Cuenta findById(Long id) {
        return dao.findById(id).get();
    }


}
