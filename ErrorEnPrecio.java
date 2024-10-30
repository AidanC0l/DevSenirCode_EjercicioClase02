
public class ErrorEnPrecio{

    /* En el mercado, podemos encontrar que el precio del producto **Pernil Iberic D'Engreix Llen. Azuaga**
    en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€.
    ¿Crees que es correcto el precio?
    En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto.*/

    public static void main(String[] args) {
        
        var precioCienGramos = 5.95F;
       // var precioKilo = 29.75F;

        double precioCorrecto = precioCienGramos * 10;

        System.out.println("El precio por kilo que dice el vendedor es incorrecto");
        System.out.println("El precio correcto por kilo del producto Pernil Iberic D'Engreix Llen. Azuaga es: " + precioCorrecto + " Euros");

    }
}