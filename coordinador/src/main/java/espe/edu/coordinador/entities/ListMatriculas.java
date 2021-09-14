package espe.edu.coordinador.entities;

import java.io.Serializable;
import java.util.List;

public class ListMatriculas implements Serializable {
    private List<Matricula> matriculas;

    public ListMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public ListMatriculas() {
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
