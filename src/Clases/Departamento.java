package Clases;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String ubicacion;
    private double presupuesto;
    private List<Empleado> empleados;

    public Departamento(String nombre, String ubicacion, double presupuesto) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.presupuesto = presupuesto;
        this.empleados = new ArrayList<>();
    }

    // Métodos getter y setter
    public String getNombre() { return nombre; }
    public String getUbicacion() { return ubicacion; }
    public double getPresupuesto() { return presupuesto; }
    public List<Empleado> getEmpleados() { return empleados; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public void setPresupuesto(double presupuesto) { this.presupuesto = presupuesto; }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", presupuesto=" + presupuesto +
                ", empleados=" + empleados +
                '}';
    }
}
