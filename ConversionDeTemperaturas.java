import java.util.Scanner;

public class ConversionDeTemperaturas {

/*Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin.
Usa las siguientes fórmulas:
```
Fahrenheit = Celsius * 9/5 + 32
Kelvin = Celsius + 273.15
``` */

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        // Se solicita la temperatura que desea convertir y se guarda en la variable 'celsius'
        System.out.print("Ingrese la temperatura en grados Celsius que desea convertir: ");
        double celsius = scanner.nextDouble();

        // Se realizan los calculos de conversión
        var fahrenheit = celsius * 9 / 5 + 32;
        var kelvin = celsius + 273.15;

        System.out.println(celsius + "° Celsius convertidos a Fahrenheir son: " + fahrenheit + "°.");
        System.out.println(celsius + "° Celsius convertidos a Kelvin son: " + kelvin + "°.");

        scanner.close();

    }
    
}
