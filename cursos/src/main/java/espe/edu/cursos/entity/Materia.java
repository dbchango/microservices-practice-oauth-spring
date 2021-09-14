package espe.edu.cursos.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.util.List;

@Table(name = "materias")
@Entity
public class Materia {
    @javax.persistence.Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @NotBlank
    @Column(name = "nombre")
    @Size(max = 50)
    private String nombre;

    @OneToMany(
            cascade = CascadeType.ALL, mappedBy = "materia"
    )
    private List<Curso> cursos;

    @Column(name = "fecha_creacion")
    private Date fecha_creacion = new Date(System.currentTimeMillis());

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "id_carrera", nullable = false)
    private Carrera carrera;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JsonManagedReference(value = "materia_cursos")
    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    @JsonBackReference(value = "carrera_materias")
    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Materia() {
    }

    public Materia(long id, String nombre, List<Curso> cursos, Date fecha_creacion, Carrera carrera) {
        Id = id;
        this.nombre = nombre;
        this.cursos = cursos;
        this.fecha_creacion = fecha_creacion;
        this.carrera = carrera;
    }

    public Materia(String nombre, List<Curso> cursos, Date fecha_creacion, Carrera carrera) {
        this.nombre = nombre;
        this.cursos = cursos;
        this.fecha_creacion = fecha_creacion;
        this.carrera = carrera;
    }

    public Materia(String nombre, Date fecha_creacion, Carrera carrera) {
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.carrera = carrera;
    }
}
