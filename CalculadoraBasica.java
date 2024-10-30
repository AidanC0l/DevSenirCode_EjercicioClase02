import java.util.Scanner;

public class CalculadoraBasica {
    
/*Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma, resta,
multiplicación y división con esos números. Muestra los resultados en la consola. */

    public static void main(String[] args) {
    
        var scanner = new Scanner(System.in);

        // Se pide el primer numero al usuario y se convierte en double
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        // Se pide el segundo numero al usuario y se convierte en double
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
 

        // Se realiza las operaciones
        var sum = num1 + num2;
        var subtraction = num1 - num2;
        var multiplication = num1 * num2;
        var division = num1 / num2;

        // Se muestra los resultados
        System.out.println("La suma de los dos numeros ingresados es: " + sum);
        System.out.println("La resta de los dos numeros ingresados es: " + subtraction);
        System.out.println("La multiplicación de los dos numeros ingresados es: " + multiplication);
        
        /*Se revisa si el usuario no puso un 0, en caso tal de que lo haya puesto se imprime un comentario,
        ya que no se puede dividir en 0 */
        if (num2 != 0) {

            System.out.println("La división de los dos numeros ingresados es: " + division);
    
        } else {
            System.out.println("No se puede dividir entre 0");
        }

        scanner.close();
    }

}
