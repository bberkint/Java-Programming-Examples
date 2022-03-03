import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.PlayerManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Player;
import java.time.LocalDate;
import Abstract.GameService;
import Abstract.PlayerCheckService;

public class Main {

	public static void main(String[] args) {
		
		Player player1 = new Player(1, "Berkin", "Topaloğlu", null, "231");
		Game game1 = new Game(1, "Monopoly", 250);
		Campaign campaign1 = new Campaign(1, "Christmas", 50);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sell(game1, player1, campaign1);
		
	}

}
