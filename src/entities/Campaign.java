package entities;

public class Campaign {
	
	private int id;
	private String campaignName;
	private double discountPercetage;
	
	public Campaign() {
	}

	public Campaign(int id, String campaignName, double discountPercetage) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountPercetage = discountPercetage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountPercetage() {
		return discountPercetage;
	}

	public void setDiscountPercetage(double discountPercetage) {
		this.discountPercetage = discountPercetage;
	}
	
	
	

}
