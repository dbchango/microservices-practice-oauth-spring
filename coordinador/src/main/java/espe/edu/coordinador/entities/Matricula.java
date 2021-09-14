package espe.edu.coordinador.entities;

import java.io.Serializable;
import java.util.Date;

public class Matricula implements Serializable {

    private Long Id;

    private Long idcurso;

    private Long idpersona;

    private Cuenta cuenta = new Cuenta();

    private Date fecha_creacion = new Date(System.currentTimeMillis());

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Long idcurso) {
        this.idcurso = idcurso;
    }

    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Matricula(Long id, Long idcurso, Long idpersona, Date fecha_creacion) {
        Id = id;
        this.idcurso = idcurso;
        this.idpersona = idpersona;
        this.fecha_creacion = fecha_creacion;
    }

    public Matricula() {
    }

    public Matricula(Long idcurso, Long idpersona) {
        this.idcurso = idcurso;
        this.idpersona = idpersona;
    }

    public Matricula(Long id, Long idcurso, Long idpersona) {
        Id = id;
        this.idcurso = idcurso;
        this.idpersona = idpersona;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }



}