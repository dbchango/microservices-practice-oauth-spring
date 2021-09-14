package espe.edu.personas.service;

import espe.edu.personas.entities.Persona;

import java.util.List;

public interface IPersonaService {
    public void save(Persona persona);

    public List<Persona> findAll();

    public void delete(Long id);

    public boolean existsById(Long id);

    public boolean existsByCedula(String ci);

    public Persona findById(Long id);

    public Persona findByCedula(String ci);
}
