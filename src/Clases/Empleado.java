package Clases;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String id;
    private String nombre;
    private String apellido;
    private String fechaContratacion;
    private String tipoContrato; // "permanente" o "temporal"
    private String email;
    private String telefono;
    private String direccion;
    private Departamento departamento;

    public Empleado(String id, String nombre, String apellido, String fechaContratacion, String tipoContrato, String email, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
        this.tipoContrato = tipoContrato;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Métodos getter y setter
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getFechaContratacion() { return fechaContratacion; }
    public String getTipoContrato() { return tipoContrato; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }
    public String getDireccion() { return direccion; }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String generarReporteDesempeño() {
        return "Reporte de Desempeño de " + nombre + " " + apellido;
    }
}
