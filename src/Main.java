import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Estudiante Informacion = new Estudiante();
        double notaMateria1,notaMateria2,notaMateria3,promedioNotas=0;
        System.out.println("Ingrese las notas de la materia 1, 2 y 3:");
        notaMateria1 = lector.nextDouble();
        notaMateria2 = lector.nextDouble();
        notaMateria3 = lector.nextDouble();
        Informacion.getPromedio(notaMateria1,notaMateria2,notaMateria3,promedioNotas);
    }
}