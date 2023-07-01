package concrete;

import abstracts.PlayerCheckService;
import abstracts.PlayerService;
import entities.Player;

public class PlayerManager implements PlayerService{
	
	PlayerCheckService gamerCheckService;
	
	

	public PlayerManager(PlayerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Player gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Saved to database: " + gamer.getFirstName());
		}
		
		else {
			System.out.println("Unvalid Person");
		}
		
	}

	@Override
	public void update(Player gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Gamer information updated: " + gamer.getFirstName());
		}
		
		else {
			System.out.println("Unvalid Person");
		}
		
	}

	@Override
	public void delete(Player gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Deleted from database: " + gamer.getFirstName());
		}
		
		else {
			System.out.println("Unvalid Person");
		}
		
	}
	
	

}
