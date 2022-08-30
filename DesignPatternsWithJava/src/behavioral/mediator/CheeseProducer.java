package behavioral.mediator;

import java.math.BigDecimal;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class CheeseProducer extends Producer {

    public CheeseProducer(String name, BigDecimal price, Mediator mediator) {
        super(name, EnumProduct.CHEESE, price, mediator);
    }
}
