package Entities;

import Abstract.Entity;

public class Game implements Entity{
	private int id;
	private String name;
	private double price;
	private String producer;
	private String distributor;
	
	public Game() {
		
	}
	public Game(int id, String name, double price, String producer, String distributor) {
		super();
		this.id = id;
		this.name = name;
		this.setPrice(price);
		this.producer = producer;
		this.distributor = distributor;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getDistributor() {
		return distributor;
	}
	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}
}
