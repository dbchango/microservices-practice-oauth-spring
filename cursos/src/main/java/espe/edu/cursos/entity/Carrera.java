package espe.edu.cursos.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Table(name = "carreras")
@Entity
public class Carrera implements Serializable {

    @javax.persistence.Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @NotBlank
    @Column(name = "nombre")
    @Size(max = 50)
    private String nombre;

    @NotBlank
    @Column(name = "descripcion")
    @Size(max = 200)
    private String descripcion;

    @OneToMany(
            cascade = CascadeType.ALL, mappedBy = "carrera"
    )
    private List<Materia> materias;

    public Carrera() {
    }

    public Carrera(String nombre, String descripcion, List<Materia> materias) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.materias = materias;
    }

    public Carrera(long id, String nombre, long id_departamento, String descripcion) {
        Id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;

    }

    public long getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(long id) {
        Id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @JsonManagedReference(value = "carrera_materias")
    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

}
