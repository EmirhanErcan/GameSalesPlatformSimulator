package test;

import java.time.LocalDate;

import abstracts.CampaignService;
import abstracts.GameService;
import abstracts.PlayerService;
import abstracts.SaleService;
import adapters.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.PlayerManager;
import concrete.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class Main {

	public static void main(String[] args) {
		Player gamer = new Player();
		gamer.setFirstName("BBBBB");
		gamer.setLastName("AAAAA");
		gamer.setNationalityId("11111111111");
		gamer.setDateOfBirth(LocalDate.of(3142, 12, 12));
	
		PlayerService gamerService = new PlayerManager(new MernisServiceAdapter());
		gamerService.add(gamer);
		
		System.out.println("---------------------");
		
		Game game = new Game();
		game.setGameName("FIFA");
		game.setGameCategory("Sports");
		game.setGamePrice(31);
		
		GameService gameService = new GameManager();
		gameService.add(game);
		
		System.out.println("---------------------");
		
		Campaign campaign = new Campaign(1, "SPRING10", 10);
		
		CampaignService campaignService = new CampaignManager();
		campaignService.add(campaign);
		
		System.out.println("---------------------");
		
		SaleService saleService = new SaleManager(new MernisServiceAdapter());
		saleService.saleWithCampaign(gamer, game, campaign);
		
		
		

	}

}
