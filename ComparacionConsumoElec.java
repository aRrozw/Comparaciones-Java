import java.util.Scanner;

public class ComparacionConsumoElec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar el consumo de los dos hogares
        System.out.print("Ingrese consumo del hogar 1: ");
        double hogar1 = sc.nextDouble();

        System.out.print("Ingrese consumo del hogar 2: ");
        double hogar2 = sc.nextDouble();

        // Mostrar todas las comparaciones relacionales
        System.out.println();

        System.out.println(hogar1 + " es mayor que " + hogar2 + ": " + (hogar1 > hogar2));
        System.out.println(hogar1 + " es menor que " + hogar2 + ": " + (hogar1 < hogar2));
        System.out.println(hogar1 + " es mayor o igual que " + hogar2 + ": " + (hogar1 >= hogar2));
        System.out.println(hogar1 + " es menor o igual que " + hogar2 + ": " + (hogar1 <= hogar2));
        System.out.println(hogar1 + " es igual a " + hogar2 + ": " + (hogar1 == hogar2));
        System.out.println(hogar1 + " es diferente de " + hogar2 + ": " + (hogar1 != hogar2));

        // Determinar qué hogar consumió más y calcular la diferencia
        System.out.println();

        if (hogar1 > hogar2) {
            double diferencia = hogar1 - hogar2;
            System.out.println("El hogar 1 consumió más energía.");
            System.out.println("La diferencia es de " + diferencia + " kWh.");
        } else if (hogar2 > hogar1) {
            double diferencia = hogar2 - hogar1;
            System.out.println("El hogar 2 consumió más energía.");
            System.out.println("La diferencia es de " + diferencia + " kWh.");
        } else {
            System.out.println("Ambos hogares consumieron la misma cantidad de energía.");
            System.out.println("La diferencia es de 0 kWh.");
        }

        sc.close();
    }
}
