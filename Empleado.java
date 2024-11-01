public class Empleado {
    protected String nombre;
    protected double sueldo;
    protected long id;
    protected static long idActual = 1;
    protected int antiguedad;

    // Constuctor.
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.id = idActual++;
    }

    // Metodo que calcula los dias de vacaciones.
    public int calcularDiasDeVacaciones() {
        int numeroDias = 0;
        if (antiguedad < 2) {
            numeroDias = 12;
        } else if (antiguedad < 10) {
            numeroDias = 14;
        } else if (antiguedad < 15) {
            numeroDias = 18;
        } else {
            numeroDias = 25;
        }

        return numeroDias;
    }

    // Getters y setters.
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "ID: " + id + " Nombre: " + nombre + " Salario: " + sueldo;
    }
}
