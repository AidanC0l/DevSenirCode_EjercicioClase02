import java.util.Scanner;

public class MediaAritmetica {

/*Crea un programa que calcule la media aritmética de tres números introducidos por el usuario. */

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        // Se le pide al ususario el primer número para la media aritmética
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        // Se le pide al ususario el segundo número para la media aritmética
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Se le pide al ususario el tercer número para la media aritmética
        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        // Se realiza el calculo de la media aritmética
        var arithmeticMean = (num1 + num2 + num3) / 3;

        System.out.println("La media aritmética es: " + arithmeticMean);

        scanner.close();

    }
    
}
