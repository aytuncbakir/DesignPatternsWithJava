package structural_patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Game {

	private static List<Player> createPlayers(){
   	 List<Player> playerList = new ArrayList<>();

        StrongPlayer strongPlayer = new StrongPlayer();
        playerList.add(strongPlayer);
        
        PremiumPlayer premiumPlayer = new PremiumPlayer();
        playerList.add(premiumPlayer);
        
        for (int i = 0; i < 100; i++){
            NormalPlayer normalPlayer = new NormalPlayer();
            playerList.add(normalPlayer);
        }
        return playerList;
   }
   
	public static void start() {
		List<Player> playerList =  createPlayers();
   	 	for (Player player : playerList) {
            player.fire();
        }

        for (Player player : playerList) {
            player.serialFire();
        }
   }
}
