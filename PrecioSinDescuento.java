
public class PrecioSinDescuento {

/*En España, las rebajas de invierno suelen comenzar entre los días 1 y 7 de enero y finalizan a final de marzo.
Por otro lado, las rebajas de verano empiezan durante la primera semana del mes de julio y finalizan durante el mes
de septiembre.
Para aprovechar la temporada de rebajas he salido de compras. He pagado 34€ por unos pantalones que tenían un
descuento del 15%. ¿Qué precio tenían antes de aplicar el descuento? */

    public static void main(String[] args) {
        
        byte pricePaid = 34; //precio pagado
        //Discount = 15%

        byte percentagePaid = 85; //porcentaje pagado
        byte percentageTotal = 100; //Porcentaje total

        var priceWithoutDiscount = pricePaid * percentageTotal / percentagePaid;

        System.out.println("¿Qué precio tenían antes de aplicar el descuento?");;
        System.out.println("El precio sin descuento por los pantalones es de: " + priceWithoutDiscount + " Euros.");

    }
}