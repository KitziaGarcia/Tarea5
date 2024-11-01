public class Jefe extends Empleado {
    private float bono;

    // Constructor.
    public Jefe(String nombre, double sueldo, float bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    // Dias de vacaciones definidos para los jefes.
    @Override
    public int calcularDiasDeVacaciones() {
        return 31;
    }

    @Override
    public String toString() {
        return super.toString() + " Bono: " + bono;
    }

    // Getters y setters.
    public float getBono() {
        return bono;
    }

    public void setBono(float bono) {
        this.bono = bono;
    }
}