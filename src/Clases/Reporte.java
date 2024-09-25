package Clases;


public class Reporte {
    private Empleado empleado;
    private String desempeno;

    public Reporte(Empleado empleado, String desempeño) {
        this.empleado = empleado;
        this.desempeno = desempeno;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getDesempeno() {
        return desempeno;
    }

    public void setDesempeno(String desempeño) {
        this.desempeno = desempeño;
    }

    @Override
    public String toString() {
        return "ReporteDesempeño{" +
                "empleado=" + empleado +
                ", desempeño='" + desempeno + '\'' +
                '}';
    }
}
