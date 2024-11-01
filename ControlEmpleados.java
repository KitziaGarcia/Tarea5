import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ControlEmpleados {
    private ArrayList<Empleado> misEmpleados;

    // Constructor.
    public ControlEmpleados() {
        misEmpleados = new ArrayList<>();
    }

    // Metodo que solicita al usuario la informacion necesaria al momento de registrar un nuevo empleado.
    public void agregarEmpleado(String puesto) {
        Scanner input = new Scanner(System.in);
        String nombre;
        double sueldo;
        float bono;
        String area;
        int asistencias;

        if (puesto.equals("jefe") || puesto.equals("Jefe") || puesto.equals("JEFE")) {
            System.out.println("\nIngrese nombre del empleado: ");
            nombre = input.nextLine();
            System.out.println("\nIngrese sueldo del empleado: ");
            sueldo = input.nextDouble();
            System.out.println("\nIngrese bono del empleado: ");
            bono = input.nextInt();
            System.out.println();
            misEmpleados.add(new Jefe(nombre, sueldo, bono));
        } else if (puesto.equals("auxiliar") || puesto.equals("Auxiliar") || puesto.equals("AUXILIAR")) {
            System.out.println("\nIngrese nombre del empleado: ");
            nombre = input.nextLine();
            System.out.println("\nIngrese sueldo del empleado: ");
            sueldo = input.nextDouble();
            input.nextLine();
            System.out.println("\nIngrese area del empleado: ");
            area = input.nextLine();
            System.out.println("\nIngrese asistencias del empleado: ");
            asistencias = input.nextInt();
            System.out.println();
            misEmpleados.add(new Auxiliar(nombre, sueldo, area, asistencias));
        } else {
            System.out.println("\nPuesto invalido.\n");
        }
    }

    // Metodo que recorre el ArrayList de empleados e imprime cada uno con su informacion.
    public String mostrarTodosLosEmpleados() {
        StringBuilder cadena = new StringBuilder();
        System.out.println("\nEmpleados: ");
        misEmpleados.forEach(empleado -> cadena.append(empleado.toString() + "\n"));
        return cadena.toString();
    }

    // Metodo que recorre el ArrayList de empleados e imprime las vacaciones disponibles de cada uno.
    public String mostrarDiasDeVacaciones() {
        StringBuilder cadena = new StringBuilder();
        misEmpleados.forEach(empleado -> cadena.append(empleado.getNombre() + " tiene " + empleado.calcularDiasDeVacaciones() + " de vacaciones.\n"));
        return cadena.toString();
    }

    // Metodo que recorre el ArrayList de empleados e imprime cada uno en orden alfabetico.
    public void ordenarEmpleadosPorNombre() {
        System.out.println("\nEmpleados en orden alfabetico: ");
        Collections.sort(misEmpleados, Comparator.comparing(Empleado::getNombre));
        misEmpleados.forEach((empleado -> System.out.println(empleado.toString())));
        System.out.println();
    }

    // Metodo que recorre el ArrayList de empleados e imprime cada uno en orden de su sueldo.
    public void ordenarEmpleadosPorSueldo() {
        System.out.println("\nEmpleados en orden por sueldo: ");
        Collections.sort(misEmpleados, Comparator.comparing(Empleado::getSueldo));
        misEmpleados.forEach((empleado -> System.out.println(empleado.toString())));
        System.out.println();
    }
}
