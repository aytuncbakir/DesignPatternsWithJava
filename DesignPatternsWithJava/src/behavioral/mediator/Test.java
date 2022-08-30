package behavioral.mediator;

import java.math.BigDecimal;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {

        Middleman middleman = new Middleman();

        CheeseProducer producer1 = new CheeseProducer("Mike", BigDecimal.valueOf(4), middleman);
        CheeseProducer producer2 = new CheeseProducer("John", BigDecimal.valueOf(3), middleman);

        CheeseMarket marketXX = new CheeseMarket("XX Market", BigDecimal.valueOf(5), middleman);
        CheeseMarket marketYY = new CheeseMarket("YY Market", BigDecimal.valueOf(7), middleman);

        middleman.addProducer(producer1);
        middleman.addProducer(producer2);
        
        middleman.addMarket(marketXX);
        middleman.addMarket(marketYY);

        System.out.println("\n-----------------------------------------------------------------------");
        System.out.println("Producer looks for the highest price");
        System.out.println("-------------------------------------------------------------------------");
        producer1.sellProduct();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Market looks for the lowest price");
        System.out.println("-------------------------------------------------------------------------");
        marketYY.buyProduct();
        System.out.println("-------------------------------------------------------------------------");

    }
}
