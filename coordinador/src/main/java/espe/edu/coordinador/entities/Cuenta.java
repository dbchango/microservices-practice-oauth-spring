package espe.edu.coordinador.entities;

import java.io.Serializable;

public class Cuenta implements Serializable {

    private Long Id;

    private boolean estado = true;

    private Matricula matricula;

    public Cuenta(Matricula matricula) {

        this.matricula = matricula;
    }

    public Cuenta() {
    }

    public Cuenta(boolean estado, Matricula matricula) {
        this.estado = estado;

        this.matricula = matricula;
    }

    public Cuenta(Long id, boolean estado, Matricula matricula) {
        Id = id;
        this.estado = estado;

        this.matricula = matricula;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

}