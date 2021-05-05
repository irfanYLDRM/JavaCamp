package Entities;

import Abstract.Entity;

public class Campaign implements Entity {
	private int id;
	private int gameId;
	private String gameName;
	private int discount;
	
	public Campaign() {
		
	}
	public Campaign(int id, int gameId, String gameName, int discount) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.gameName = gameName;
		this.setDiscount(discount);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getCampaignCode() {
		return this.id+this.gameName.substring(0,3)+this.gameId;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
