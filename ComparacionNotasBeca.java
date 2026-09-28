import java.util.Scanner;

public class ComparacionNotasBeca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ingreso de promedios
        System.out.print("Ingrese promedio del estudiante 1: ");
        double estudiante1 = scanner.nextDouble();

        System.out.print("Ingrese promedio del estudiante 2: ");
        double estudiante2 = scanner.nextDouble();

        // Comparaciones relacionales
        System.out.println();

        System.out.println(estudiante1 + " es mayor que " + estudiante2 + ": "
                + (estudiante1 > estudiante2));

        System.out.println(estudiante1 + " es menor que " + estudiante2 + ": "
                + (estudiante1 < estudiante2));

        System.out.println(estudiante1 + " es mayor o igual que " + estudiante2 + ": "
                + (estudiante1 >= estudiante2));

        System.out.println(estudiante1 + " es menor o igual que " + estudiante2 + ": "
                + (estudiante1 <= estudiante2));

        System.out.println(estudiante1 + " es igual a " + estudiante2 + ": "
                + (estudiante1 == estudiante2));

        System.out.println(estudiante1 + " es diferente de " + estudiante2 + ": "
                + (estudiante1 != estudiante2));

        // Determinar quién obtiene la beca
        System.out.println();

        if (estudiante1 > estudiante2) {
            System.out.println("El estudiante 1 obtiene la beca.");
        } else if (estudiante2 > estudiante1) {
            System.out.println("El estudiante 2 obtiene la beca.");
        } else {
            System.out.println("Los dos estudiantes tienen el mismo promedio.");
        }

        scanner.close();
    }
}
