package com.kiran.java.junitSamples1;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class BasketBuilder {
	private List<Item> items;
	private Calendar date;

	public BasketBuilder() {
		this.items = new ArrayList<Item>();
		date = Calendar.getInstance();
	}
	
	public BasketBuilder w(String name, double price) {
		items.add(new Item(name, 1, price));
		return this;
	}

	public BasketBuilder w(String name, int qty, double price) {
		return w(name, 1, price);
	}
	
	public Basket build() {
		return new Basket(items, date);
	}
}
