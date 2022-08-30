package behavioral.strategy;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public interface Exchange {

   double exchage(double amount);
   
   double takeCommission(double amount);
}
