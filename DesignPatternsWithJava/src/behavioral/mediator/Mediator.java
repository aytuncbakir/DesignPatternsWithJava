package behavioral.mediator;
/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public interface Mediator {

    void addProducer(Producer producer);
    void addMarket(Market market);

    void buyFromProducer(Producer producer);
    void sellToMarket(Market market);
}
