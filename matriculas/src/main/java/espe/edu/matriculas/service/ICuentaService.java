package espe.edu.matriculas.service;

import espe.edu.matriculas.entities.Cuenta;

import java.util.List;

public interface ICuentaService {

    public List<Cuenta> findAll();

    public void save(Cuenta cuenta);

    public void delete(Long id);

    public boolean existsById(Long id);

    public Cuenta findById(Long id);

}
