package Entities;

import Abstract.Entity;

public class Campaign implements Entity{
	
	private int id;
	private String gameName;
	private double discountPrice;
	
	public Campaign(int id, String gameName, double discountPrice) {
	
		this.id = id;
		this.gameName = gameName;
		this.discountPrice = discountPrice;
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

	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	

}
