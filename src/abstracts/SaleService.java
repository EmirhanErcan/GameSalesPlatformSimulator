package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Player;

public interface SaleService {
	
	void sale(Player player, Game game);
	
	void saleWithCampaign(Player player, Game game, Campaign campaign);
	
	

}
