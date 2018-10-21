package com.java.design.pattern.visitor.model;

import com.java.design.pattern.visitor.Visitable;
import com.java.design.pattern.visitor.Visitor;

public class Book implements Visitable{

	private double price;
	private double weight;

	
	
	public Book(double price, double weight) {
		super();
		this.price = price;
		this.weight = weight;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}

	public double getWeight() {
		return weight;
	}

}
