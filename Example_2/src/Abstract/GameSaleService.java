package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public interface GameSaleService {
	void sell(Game game, Player player, Campaign campaign);

}
