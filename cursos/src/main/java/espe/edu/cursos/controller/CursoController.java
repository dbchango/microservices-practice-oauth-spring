package espe.edu.cursos.controller;

import espe.edu.cursos.entity.Curso;
import espe.edu.cursos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/cursos")

public class CursoController {

    @Autowired
    CursoService cursoService;

    @GetMapping("")
    public List<Curso> list(){
        return cursoService.findAll();
    }

    @PostMapping("")
    public Curso save(@RequestBody Curso curso){
        cursoService.save(curso);
        return curso;
    }

    @GetMapping("/{id}")
    public Curso findById(@PathVariable Long id){
        return cursoService.findById(id);
    }

    @GetMapping("/{nrc}/exists-by-nrc")
    public boolean existsByNrc(@PathVariable String nrc){
        return cursoService.existsByNrc(nrc);
    }

    @GetMapping("/{nrc}/find-by-nrc")
    public Curso findByNrc(@PathVariable String nrc){
        return cursoService.findByNrc(nrc);
    }

}
