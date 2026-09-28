import java.util.Scanner;

public class ComparacionPromedios {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar los promedios
        System.out.print("Ingrese el promedio del estudiante 1: ");
        double promedio1 = entrada.nextDouble();

        System.out.print("Ingrese el promedio del estudiante 2: ");
        double promedio2 = entrada.nextDouble();

        System.out.println();

        // Comparaciones
        System.out.println(promedio1 + " es mayor que " + promedio2 + ": " + (promedio1 > promedio2));

        System.out.println(promedio1 + " es menor que " + promedio2 + ": " + (promedio1 < promedio2));

        System.out.println(promedio1 + " es mayor o igual que " + promedio2 + ": " + (promedio1 >= promedio2));

        System.out.println(promedio1 + " es menor o igual que " + promedio2 + ": " + (promedio1 <= promedio2));

        System.out.println(promedio1 + " es igual a " + promedio2 + ": " + (promedio1 == promedio2));

        System.out.println(promedio1 + " es diferente de " + promedio2 + ": " + (promedio1 != promedio2));

        System.out.println();

        // Determinar cuál estudiante obtuvo el mejor promedio
        if (promedio1 > promedio2) {
            System.out.println("El estudiante 1 obtuvo el mejor promedio.");
        } else if (promedio2 > promedio1) {
            System.out.println("El estudiante 2 obtuvo el mejor promedio.");
        } else {
            System.out.println("Ambos estudiantes obtuvieron el mismo promedio.");
        }

        // Calcular la diferencia entre los promedios
        double diferencia = Math.abs(promedio1 - promedio2);

        System.out.println("La diferencia entre ambos promedios es: " + diferencia);

        entrada.close();
    }
}
