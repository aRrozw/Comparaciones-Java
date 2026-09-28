import java.util.Scanner;

public class ComparacionVentas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar las ventas
        System.out.print("Ingrese ventas del vendedor 1: ");
        double ventas1 = entrada.nextDouble();

        System.out.print("Ingrese ventas del vendedor 2: ");
        double ventas2 = entrada.nextDouble();

        System.out.println();

        // Comparaciones
        System.out.println(ventas1 + " es mayor que " + ventas2 + ": " + (ventas1 > ventas2));

        System.out.println(ventas1 + " es menor que " + ventas2 + ": " + (ventas1 < ventas2));

        System.out.println(ventas1 + " es mayor o igual que " + ventas2 + ": " + (ventas1 >= ventas2));

        System.out.println(ventas1 + " es menor o igual que " + ventas2 + ": " + (ventas1 <= ventas2));

        System.out.println(ventas1 + " es igual a " + ventas2 + ": " + (ventas1 == ventas2));

        System.out.println(ventas1 + " es diferente de " + ventas2 + ": " + (ventas1 != ventas2));

        System.out.println();

        // Determinar quién realizó más ventas
        if (ventas1 > ventas2) {
            System.out.println("El vendedor 1 realizó más ventas.");
        } else if (ventas2 > ventas1) {
            System.out.println("El vendedor 2 realizó más ventas.");
        } else {
            System.out.println("Ambos vendedores realizaron las mismas ventas.");
        }

        // Calcular la diferencia
        double diferencia = Math.abs(ventas1 - ventas2);

        System.out.println("La diferencia es: S/ " + diferencia);

        entrada.close();
    }
}
