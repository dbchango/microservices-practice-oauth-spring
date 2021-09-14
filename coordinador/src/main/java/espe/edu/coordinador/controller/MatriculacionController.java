package espe.edu.coordinador.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import espe.edu.coordinador.entities.Curso;
import espe.edu.coordinador.entities.Matricula;
import espe.edu.coordinador.entities.Persona;
import espe.edu.coordinador.service.CursoService;
import espe.edu.coordinador.service.MatriculaService;
import espe.edu.coordinador.service.PersonaService;
import espe.edu.coordinador.utils.MessageResponse;
import espe.edu.coordinador.utils.SolicitudMatricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/coordinador")

public class MatriculacionController {

    @Autowired
    PersonaService personaService;

    @Autowired
    CursoService cursoService;

    @Autowired
    MatriculaService matriculaService;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @PostMapping("/matricular")
    public ResponseEntity<?> test(@RequestBody SolicitudMatricula solicitudMatricula)  throws InterruptedException, ExecutionException, IOException {
        if(!personaService.existsByCedula(solicitudMatricula.getCedula_persona())) return ResponseEntity.badRequest().body(new MessageResponse("La persona con la cédula: "+solicitudMatricula.getCedula_persona()+" no está registrada en la base de datos."));
        if(!cursoService.existsByNrc(solicitudMatricula.getNrc_curso()))return  ResponseEntity.badRequest().body(new MessageResponse("El curso con el nrc: "+solicitudMatricula.getNrc_curso()+" no existe en la base de datos."));

        Persona persona = personaService.findByCedula(solicitudMatricula.getCedula_persona());
        List<Matricula> matriculas = matriculaService.getPersonaMatriculas(persona.getId());

        int cuentasPendientes = 0;
        for (Matricula m:
                matriculas) {
            if(m!=null){
                if(m.getCuenta().isEstado()==true) cuentasPendientes++;
            }
        }
        return ResponseEntity.ok(persona.getApellidos());
    }

}
