import java.util.Scanner;

public class ComparacionKm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese kilómetros del conductor 1: ");
        int km1 = scanner.nextInt();

        System.out.print("Ingrese kilómetros del conductor 2: ");
        int km2 = scanner.nextInt();

        System.out.println();

        // Comparaciones relacionales
        System.out.println(km1 + " es mayor que " + km2 + ": " + (km1 > km2));
        System.out.println(km1 + " es menor que " + km2 + ": " + (km1 < km2));
        System.out.println(km1 + " es mayor o igual que " + km2 + ": " + (km1 >= km2));
        System.out.println(km1 + " es menor o igual que " + km2 + ": " + (km1 <= km2));
        System.out.println(km1 + " es igual a " + km2 + ": " + (km1 == km2));
        System.out.println(km1 + " es diferente de " + km2 + ": " + (km1 != km2));

        System.out.println();

        // Determinar quién recorrió más y calcular la diferencia
        if (km1 > km2) {
            System.out.println("El conductor 1 recorrió más kilómetros.");
            System.out.println("Diferencia: " + (km1 - km2) + " km.");
        } else if (km2 > km1) {
            System.out.println("El conductor 2 recorrió más kilómetros.");
            System.out.println("Diferencia: " + (km2 - km1) + " km.");
        } else {
            System.out.println("Ambos conductores recorrieron la misma cantidad de kilómetros.");
            System.out.println("Diferencia: 0 km.");
        }

        scanner.close();
    }
}
