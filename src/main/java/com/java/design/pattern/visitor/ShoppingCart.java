package com.java.design.pattern.visitor;

import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Visitable> items = new ArrayList<Visitable>();
	
	
	public void purchaseItem(Visitable item) {
		items.add(item);
	}
	
	public double calculatePostage() {
		PostageVisitor visitor = new PostageVisitor();

		for(Visitable item: items) {
			item.accept(visitor);
		}

		double postage = visitor.getTotalPostage();

		return postage;
	}

}
