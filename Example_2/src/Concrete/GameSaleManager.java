package Concrete;

import Abstract.GameSaleService;
import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public class GameSaleManager implements GameSaleService{

	@Override
	public void sell(Game game, Player player, Campaign campaign) {
		
        double lastPrice = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100);
        
        System.out.println("Player Name : "+ player.getFirstName());
		System.out.println("Game Name : " + game.getGameName());
		System.out.println("Game Price : " + game.getPrice());
		System.out.println("Campaign Name : "+ campaign.getCampainName());
		System.out.println("Campaign Discount : "+ campaign.getDiscount());
		System.out.println("Last Price : "+ lastPrice);

	}

}
