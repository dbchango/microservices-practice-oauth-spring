package espe.edu.coordinador.utils;

import java.io.Serializable;

public class SolicitudMatricula implements Serializable {
    private String cedula_persona;
    private String nrc_curso;

    public SolicitudMatricula(String cedula_persona, String nrc_curso) {
        this.cedula_persona = cedula_persona;
        this.nrc_curso = nrc_curso;
    }

    public String getCedula_persona() {
        return cedula_persona;
    }

    public void setCedula_persona(String cedula_persona) {
        this.cedula_persona = cedula_persona;
    }

    public String getNrc_curso() {
        return nrc_curso;
    }

    public void setNrc_curso(String nrc_curso) {
        this.nrc_curso = nrc_curso;
    }
}
