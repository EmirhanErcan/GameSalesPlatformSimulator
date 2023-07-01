package entities;

import abstracts.Entities;

public class Game implements Entities{
	private int id;
    private String gameName;
    private double gamePrice;
    private String gameCategory;
    
	public Game() {
	}
	
	public Game(int id, String gameName, double gamePrice, String gameCategory) {
		this.id = id;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.gameCategory = gameCategory;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	public String getGameCategory() {
		return gameCategory;
	}
	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}


    
    

}
