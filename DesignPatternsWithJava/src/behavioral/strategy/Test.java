package behavioral.strategy;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {

    	Money money = new Dolar(100);
        Customer customer =  new Customer(money);
        System.out.println("-------------------------------------------------------------------------------------------------");
        DolarToTurkishLira exchangeOffice = new DolarToTurkishLira();
        System.out.println("Customer gives to exchange office "+ customer.getMoney().getAmount()+ " dolar");
        double amount = exchangeOffice.exchage(customer.getMoney().getAmount());
        System.out.println("Customer takes from exchange office "+ amount+ " turkish lira");
        
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println();
        money = new Euro(100);
        customer =  new Customer(money);
        
        EuroToTurkishLira exchangeOffice1 = new EuroToTurkishLira();
        System.out.println("Customer gives to exchange office "+ customer.getMoney().getAmount()+ " euro");
        amount = exchangeOffice1.exchage(customer.getMoney().getAmount());
        System.out.println("Customer takes from exchange office "+ amount+ " turkish lira");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

   
}
