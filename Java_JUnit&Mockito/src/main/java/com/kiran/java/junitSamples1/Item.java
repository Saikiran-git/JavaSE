package com.kiran.java.junitSamples1;

public class Item {
	private final String name;
	private final int qty;
	private final double unitPrice;

	public Item(String name, int qty, double unitPrice) {
		this.name = name;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return name;
	}

	public int getQty() {
		return qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}
	
	public double getTotalPrice() {
		return unitPrice * qty;
	}
	
}
