
public class OperacionMatematica {

    /*En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )" utilizando las instrucciones necesarias.
    * ¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
    * Explique por que la otra calculadora genera un resultado diferente.*/

    public static void main(String[] args) {
        byte num1 = 1;
        byte num2 = 2;
        byte num3 = 6;


        var operation1 = num3 / num2 * ( num1 + num2 );
        var operation2 = num3 / (num2 * ( num1 + num2 ));

        System.out.printf("En este reto deberás programar la operación matemática 6 / 2 ( 1 + 2 ) utilizando las instrucciones necesarias%n");
        System.out.printf("El resultado de la operación 6 / 2 ( 1 + 2 ) es %d%n", operation1);

        System.out.printf("¿Cuál es el resultado correcto de la operación? ¿1 ó 9?%n");
        System.out.printf("El resultado correcto de la operación matematica es: %d%n", operation2);
        System.out.printf("Explique por que la otra calculadora genera un resultado diferente.%n");
        System.out.printf("Si escribimos de manera literal la operación matemática que nos dan '6 / 2 ( 1 + 2 )' en java el resultado es: %d%n", operation1);
        System.out.printf("Pero si queremos el resultado matematicamente correcto se debe escribir '(6 /( 2 ( 1 + 2 ))' lo que nos da: %d", operation2);

    }
}