package behavioral.state;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {

        Player player = new Player();
        
        Game game = new Game();
        game.setPlayer(player);
        game.start();
       
      
        
    }
}
