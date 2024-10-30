import java.util.Scanner;

public class AreaPerimetroDeRectangulo {

    /*Crea un programa que calcule el área y el perímetro de un rectángulo.
    Solicita al usuario la longitud y el ancho del rectángulo. */

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        // Se solicita la longitud del rectangulo y se guarda en la variable 'length'
        System.out.print("Ingrese la longitud del rectangulo: ");
        double length = scanner.nextDouble();

        // Se solicita el ancho del rectangulo y se guarda en la variable 'width'
        System.out.print("Ingrese el ancho del rectangulo: ");
        double width = scanner.nextDouble();

        // Se realiza la operación para calcular el perímetro del rectangulo y se guarda en la variable 'perimeter'
        var perimeter = (length * 2) + (width * 2);

        // Se imprime el resultado del perímetro
        System.out.println("El perímetro del rectangulo es: " + perimeter);

        scanner.close();

    }
}
