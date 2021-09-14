package espe.edu.coordinador.entities;

import java.util.Date;
import java.util.List;

public class Curso {
    private Long Id;

    private String nombre;

    private String nrc;

    private String descripcion;

    private Date fecha_creacion = new Date(System.currentTimeMillis());;

    private Long idmateria;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Long getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(Long idmateria) {
        this.idmateria = idmateria;
    }

    public Curso() {
        super();
    }

    public Curso(Long id, String nombre, String nrc, String descripcion, Date fecha_creacion, Long idmateria) {
        Id = id;
        this.nombre = nombre;
        this.nrc = nrc;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.idmateria = idmateria;
    }

    public Curso(String nombre, String nrc, String descripcion, Date fecha_creacion, Long idmateria) {
        this.nombre = nombre;
        this.nrc = nrc;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.idmateria = idmateria;
    }

    public Curso(String nombre, String nrc, Long idmateria) {
        this.nombre = nombre;
        this.nrc = nrc;
        this.idmateria = idmateria;
    }
}
