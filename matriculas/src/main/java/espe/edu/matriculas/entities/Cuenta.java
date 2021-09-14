package espe.edu.matriculas.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cuentas")
public class Cuenta implements Serializable {
    @Id
    @Column(name = "id_matricula")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "estado")
    private boolean estado = true;

    /*
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "id_matricula", nullable = false)
    */
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id_matricula")
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


    //@JsonBackReference(value = "cuenta_matricula")
    @JsonIgnore
    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }


}