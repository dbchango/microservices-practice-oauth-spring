package espe.edu.cursos.controller;

import espe.edu.cursos.entity.Curso;
import espe.edu.cursos.service.MateriaService;
import espe.edu.cursos.entity.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    @Autowired
    MateriaService materiaService;

    @GetMapping("/{id}/list/cursos")
    public List<Curso> listCarrera(@PathVariable Long id){
        return materiaService.findMateriaCursos(id);
    }

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Materia save(@RequestBody Materia materia){
        materiaService.save(materia);
        return materia;
    }

    @GetMapping(value = "")
    public List<Materia> all(){
        return materiaService.findAll();
    }

}