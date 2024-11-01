public class Auxiliar extends Empleado {
    private String area;
    private float bonoPorAsistencia;
    private int asistencias;

    // Constructor.
    public Auxiliar(String nombre, double sueldo, String area, int asistencias) {
        super(nombre, sueldo);
        this.area = area;
        this.asistencias = asistencias;
    }


    // Metodo que calcula el bono dependiendo de las asistencias del empleado.
    public float calcularBonoPorAsistencia() {
        switch (asistencias) {
            case 20:
                bonoPorAsistencia += 500;
            break;
            case 25:
                bonoPorAsistencia += 750;
            break;
            case 30:
                bonoPorAsistencia += 1000;
            break;
        }
        return bonoPorAsistencia;
    }

    // Getters y setters.
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public float getBonoPorAsistencia() {
        return bonoPorAsistencia;
    }

    public void setBonoPorAsistencia(float bonoPorAsistencia) {
        this.bonoPorAsistencia = bonoPorAsistencia;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
}