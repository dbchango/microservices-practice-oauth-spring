package espe.edu.cursos.controller;

import espe.edu.cursos.entity.Carrera;
import espe.edu.cursos.entity.Materia;
import espe.edu.cursos.service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/carreras")

public class CarreraController {

    @Autowired
    CarreraService carreraService;

    @GetMapping("/{id}/list/materias")
    public List<Materia> listMaterias(@PathVariable Long id){
        return carreraService.findCarreraMaterias(id);
    }

    @PostMapping("")
    public Carrera save(@RequestBody Carrera carrera){
        carreraService.save(carrera);
        return carrera;

    }

    @GetMapping("/{id}")
    public Carrera save(@PathVariable Long id){
        return carreraService.findById(id);
    }

    @GetMapping("")
    public List<Carrera> findAll(){
        return carreraService.findAll();
    }
}
