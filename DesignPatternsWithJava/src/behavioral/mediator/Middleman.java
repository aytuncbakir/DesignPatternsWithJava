package behavioral.mediator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Middleman implements Mediator {

    private List<Producer> producerList;
    private List<Market> marketList;

    public Middleman() {
    	producerList = new ArrayList<>();
    	marketList = new ArrayList<>();
    }
    
    @Override
	public void buyFromProducer(Producer producer) {
    	  Market market = findWhoGivesHighestPrice(producer.getProduct()); 
          sell(producer, market);
	}

	@Override
	public void sellToMarket(Market market) {
		 Producer producer = findWhoGivesCheapest(market.getProduct()); 
	     sell(producer, market);
	}

    @Override
    public void addProducer(Producer producer) {
    	producerList.add(producer);
    }

    @Override
    public void addMarket(Market market) {
    	marketList.add(market);
    }


    private Producer findWhoGivesCheapest(EnumProduct product) {

        Producer producerWhoGivesCheapest = null;
        for (Producer producer : producerList) {
            if (product.equals(producer.getProduct())){
                BigDecimal producerProductPrice = producer.getPrice();
                if (producerWhoGivesCheapest == null ||
                		producerWhoGivesCheapest.getPrice().compareTo(producerProductPrice) > 0){
                	producerWhoGivesCheapest = producer;
                }
            }
        }
        return producerWhoGivesCheapest;
    }

    private Market findWhoGivesHighestPrice(EnumProduct product) {

        Market marketWhoGiveHighest = null;
        for (Market market : marketList) {
            if (product.equals(market.getProduct())){
                BigDecimal producerPrice = market.getPrice();
                if (marketWhoGiveHighest == null ||
                		marketWhoGiveHighest.getPrice().compareTo(producerPrice) < 0){
                	marketWhoGiveHighest = market;
                }
            }
        }
        return marketWhoGiveHighest;
    }

    private void sell(Producer producer, Market market) {
        System.out.println("Producer "+ producer.getName() + " his product price "+ producer.getPrice()
               +" -  " + market.getName() + " buys product " + producer.getProduct().getProductName() + " " + market.getPrice() + "\n" );
    }

	
}
