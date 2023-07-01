package concrete;

import abstracts.PlayerCheckService;
import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class SaleManager implements SaleService{
	
	PlayerCheckService gamerCheckService;
	
	
	public SaleManager(PlayerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void sale(Player player, Game game) {
		if(gamerCheckService.checkIfRealPerson(player)) {
			System.out.println(game.getGameName() + "purchased by " + player.getFirstName());
		}
		
		else {
			System.out.println("The purchase did not take place because the user is invalid. "
					+ "Please check that your information is correct and try again.");
		}
		
		
	}

	@Override
	public void saleWithCampaign(Player player, Game game, Campaign campaign) {
		if(gamerCheckService.checkIfRealPerson(player)) {
			System.out.println("Game: " + game.getGameName() + "; Selling price: " + game.getGamePrice() + 
					"; Player Name: " + player.getFirstName() + "; Campaign Code: " + campaign.getCampaignName() 
					+ "; Discounted Price After Campaign: " + discountCalculator(game.getGamePrice(),
							campaign.getDiscountPercetage()) );
		
		}
		
		else {
			System.out.println("The purchase did not take place because the user is invalid. "
					+ "Please check that your information is correct and try again.");
		}
		}
	
	public double discountCalculator(double price, double discountPercentage) {
		double priceAfterDiscount = price -(price*discountPercentage/100); 
		return priceAfterDiscount ;
	}

}
