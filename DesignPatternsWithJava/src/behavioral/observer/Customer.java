package behavioral.observer;
/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Customer implements Observer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable) {
        ShoppingSite site = (ShoppingSite) observable;
        System.out.println(name + " check the price " + site.getCurrentPrice()+
        " omg");
    }
}
