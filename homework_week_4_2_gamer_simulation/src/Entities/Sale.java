package Entities;

import Abstract.Entity;

public class Sale implements Entity{
	private int id;
	private int gamerId;
	private int gameId;
	private double price;
	private String campaignCode;
	
	public Sale() {
		
	}
	public Sale(int id, int gamerId, int gameId, double price, String campaignCode) {
		super();
		this.id = id;
		this.gamerId = gamerId;
		this.gameId = gameId;
		this.price = price;
		this.campaignCode = campaignCode;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}
}
