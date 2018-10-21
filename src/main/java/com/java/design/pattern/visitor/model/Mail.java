package com.java.design.pattern.visitor.model;

import com.java.design.pattern.visitor.Visitable;
import com.java.design.pattern.visitor.Visitor;

public class Mail implements Visitable{
	private double price;

	
	public Mail(double price) {
		super();
		this.price = price;
	}

	//accept the visitor
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}

	
}
