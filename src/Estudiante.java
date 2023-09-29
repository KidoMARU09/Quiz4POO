import java.util.Date;
import java.util.Scanner;
public class Estudiante {
    static Scanner lector = new Scanner(System.in);
    private String nombre;
    private double notaMateria1, notaMateria2, notaMateria3, PromedioNotas;

    private Date fechaNacimiento;

    public Estudiante(double promedioNotas) {
        PromedioNotas = promedioNotas;
    }

    public double getPromedioNotas() {
        return PromedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        PromedioNotas = promedioNotas;
    }

    public Estudiante() {
        this.nombre = nombre;
        this.notaMateria1 = notaMateria1;
        this.notaMateria2 = notaMateria2;
        this.notaMateria3 = notaMateria3;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMateria1() {
        return notaMateria1;
    }

    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    public double getNotaMateria2() {
        return notaMateria2;
    }

    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    public double getNotaMateria3() {
        return notaMateria3;
    }

    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void getEdad() {

    }

    public double getPromedio(double notaMateria1, double notaMateria2, double notaMateria3, double PromedioNotas) {
        PromedioNotas = (notaMateria1 + notaMateria2 + notaMateria3) / 3;
        return PromedioNotas;
    }
}
