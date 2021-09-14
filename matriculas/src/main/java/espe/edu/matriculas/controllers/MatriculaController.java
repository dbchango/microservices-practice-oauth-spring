package espe.edu.matriculas.controllers;

import espe.edu.matriculas.entities.Cuenta;
import espe.edu.matriculas.entities.Matricula;
import espe.edu.matriculas.service.CuentaService;
import espe.edu.matriculas.service.MatriculaService;
import espe.edu.matriculas.utils.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {
    @Autowired
    MatriculaService matriculaService;

    @Autowired
    CuentaService cuentaService;

    @GetMapping("")
    public List<Matricula> list(){
        return matriculaService.findAll();
    }

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody Matricula matricula){
        try{
            matriculaService.save(matricula);
            Cuenta cuenta = new Cuenta(matricula);
            cuentaService.save(cuenta);
            matricula = matriculaService.findById(matricula.getId());
            return ResponseEntity.ok().body(matricula);
        }catch (JpaSystemException e){
            return new ResponseEntity(new MessageResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public Matricula findByID(@PathVariable Long id){
        return matriculaService.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            Matricula matricula = matriculaService.findById(id);
            matriculaService.delete(matricula);
            return ResponseEntity.ok().body(new MessageResponse("Recurso eliminado correctamente."));
        }catch (JpaSystemException e){
            return new ResponseEntity(new MessageResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/personas/{id_persona}")
    public List<Matricula> findAllById_persona(@PathVariable Long id_persona){
        return matriculaService.findAllByIdpersona(id_persona);
    }


}
