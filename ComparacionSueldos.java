import java.util.Scanner;

public class ComparacionSueldos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar los sueldos
        System.out.print("Ingrese sueldo 1: ");
        double sueldo1 = entrada.nextDouble();

        System.out.print("Ingrese sueldo 2: ");
        double sueldo2 = entrada.nextDouble();

        System.out.println();

        // Comparaciones
        System.out.println(sueldo1 + " es mayor que " + sueldo2 + ": " + (sueldo1 > sueldo2));

        System.out.println(sueldo1 + " es menor que " + sueldo2 + ": " + (sueldo1 < sueldo2));

        System.out.println(sueldo1 + " es mayor o igual que " + sueldo2 + ": " + (sueldo1 >= sueldo2));

        System.out.println(sueldo1 + " es menor o igual que " + sueldo2 + ": " + (sueldo1 <= sueldo2));

        System.out.println(sueldo1 + " es igual a " + sueldo2 + ": " + (sueldo1 == sueldo2));

        System.out.println(sueldo1 + " es diferente de " + sueldo2 + ": " + (sueldo1 != sueldo2));

        System.out.println();

        // Determinar quién gana más
        if (sueldo1 > sueldo2) {
            System.out.println("El practicante 1 gana más.");
        } else if (sueldo2 > sueldo1) {
            System.out.println("El practicante 2 gana más.");
        } else {
            System.out.println("Ambos practicantes ganan lo mismo.");
        }

        // Calcular diferencia salarial
        double diferencia = Math.abs(sueldo1 - sueldo2);

        System.out.println("La diferencia salarial es: S/ " + diferencia);

        entrada.close();
    }
}
