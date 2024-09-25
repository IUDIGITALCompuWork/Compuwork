import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Clases.Empleado;
import Clases.Departamento;

public class Main {
    private static List<Empleado> empleados = new ArrayList<>();
    private static List<Departamento> departamentos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea
            try {
                switch (opcion) {
                    case 1:
                        agregarEmpleado();
                        break;
                    case 2:
                        agregarDepartamento();
                        break;
                    case 3:
                        asignarEmpleadoADepartamento();
                        break;
                    case 4:
                        mostrarEmpleados();
                        break;
                    case 5:
                        mostrarDepartamentos();
                        break;
                    case 6:
                        generarReporteDesempeño();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. Agregar Empleado");
        System.out.println("2. Agregar Departamento");
        System.out.println("3. Asignar Empleado a Departamento");
        System.out.println("4. Mostrar Empleados");
        System.out.println("5. Mostrar Departamentos");
        System.out.println("6. Generar Reporte de Desempeño");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarEmpleado() {
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Fecha de Contratación: ");
        String fechaContratacion = scanner.nextLine();
        System.out.print("Tipo de Contrato (permanente/temporal): ");
        String tipoContrato = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        Empleado empleado = new Empleado(id, nombre, apellido, fechaContratacion, tipoContrato, email, telefono, direccion);
        empleados.add(empleado);
        System.out.println("Empleado agregado exitosamente.");
    }

    private static void agregarDepartamento() {
        System.out.print("Nombre del Departamento: ");
        String nombre = scanner.nextLine();
        System.out.print("Ubicación: ");
        String ubicacion = scanner.nextLine();
        System.out.print("Presupuesto: ");
        double presupuesto = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea

        Departamento departamento = new Departamento(nombre, ubicacion, presupuesto);
        departamentos.add(departamento);
        System.out.println("Departamento agregado exitosamente.");
    }

    private static void asignarEmpleadoADepartamento() {
        System.out.print("ID del Empleado: ");
        String idEmpleado = scanner.nextLine();
        System.out.print("Nombre del Departamento: ");
        String nombreDepartamento = scanner.nextLine();

        Empleado empleado = empleados.stream()
                .filter(e -> e.getId().equals(idEmpleado))
                .findFirst()
                .orElse(null);

        Departamento departamento = departamentos.stream()
                .filter(d -> d.getNombre().equals(nombreDepartamento))
                .findFirst()
                .orElse(null);

        if (empleado != null && departamento != null) {
            empleado.setDepartamento(departamento);
            departamento.agregarEmpleado(empleado);
            System.out.println("Empleado asignado al departamento exitosamente.");
        } else {
            System.out.println("Empleado o Departamento no encontrado.");
        }
    }

    private static void mostrarEmpleados() {
        System.out.println("\n--- Lista de Empleados ---");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    private static void mostrarDepartamentos() {
        System.out.println("\n--- Lista de Departamentos ---");
        for (Departamento departamento : departamentos) {
            System.out.println(departamento);
        }
    }

    private static void generarReporteDesempeño() {
        System.out.print("ID del Empleado: ");
        String idEmpleado = scanner.nextLine();

        Empleado empleado = empleados.stream()
                .filter(e -> e.getId().equals(idEmpleado))
                .findFirst()
                .orElse(null);

        if (empleado != null) {
            System.out.println(empleado.generarReporteDesempeño());
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
}