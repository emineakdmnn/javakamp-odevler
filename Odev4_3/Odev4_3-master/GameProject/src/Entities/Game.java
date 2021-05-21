package Entities;

import Abstract.Entity;

public class Game implements Entity{
	
	private int id;
	private String name;
	private double unitPrice;
	private int unitInStock;
	
	public Game(int id, String name, double unitPrice, int unitInStock) {
		
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	

}
