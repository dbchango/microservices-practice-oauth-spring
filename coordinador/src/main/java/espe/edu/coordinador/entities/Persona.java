package espe.edu.coordinador.entities;

import java.io.Serializable;
import java.util.List;

public class Persona implements Serializable {
    private Long Id;

    private String cedula;

    private int edad;

    private String nombres;

    private String apellidos;

    private String correo;

    private String direccion;


    public Persona() {
    }

    public Persona(long id, int edad, String nombres, String cedula, String apellidos, String correo, String direccion) {
        Id = id;
        this.edad = edad;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.direccion = direccion;
    }

    public Persona(String cedula, int edad, String nombres, String apellidos, String correo, String direccion) {
        this.cedula = cedula;
        this.edad = edad;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.direccion = direccion;
    }



    public Persona(String cedula, String nombres, String apellidos) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getId() {
        return Id;
    }


}
