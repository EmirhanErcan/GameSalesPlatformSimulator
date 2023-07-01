package concrete;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " added to the system.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " deleted from the system.");
		
	}
	
	
	

}
