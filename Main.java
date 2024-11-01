import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opc = 0;
        Scanner input = new Scanner(System.in);
        String puesto;
        ControlEmpleados ce = new ControlEmpleados();

        do {
            System.out.println("1. Registrar empleado.");
            System.out.println("2. Mostrar todos los empleados.");
            System.out.println("3. Mostrar dias de vacaciones.");
            System.out.println("4. Mostrar empleados ordenados por nombre.");
            System.out.println("5. Mostrar empleados ordenados por sueldo.");
            System.out.println("6. Salir.");
            System.out.println("Selecciona una opcion: ");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("\nIngrese el tipo de empleado a registrar (jefe o auxiliar): ");
                    puesto = input.next();
                    ce.agregarEmpleado(puesto);
                break;
                case 2:
                    System.out.println(ce.mostrarTodosLosEmpleados());
                break;
                case 3:
                    System.out.println(ce.mostrarDiasDeVacaciones());
                break;
                case 4:
                    ce.ordenarEmpleadosPorNombre();
                break;
                case 5:
                    ce.ordenarEmpleadosPorSueldo();
                break;
                case 6:
                    System.out.println("Programa finalizado.");
                break;
            }
        } while (opc != 6);
    }
}