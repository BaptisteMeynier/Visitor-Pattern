
package com.java.design.pattern.visitor;

import com.java.design.pattern.visitor.model.Book;
import com.java.design.pattern.visitor.model.Mail;

public class PostageVisitor implements Visitor {

	private static double STAMP_PRICE=0.50d;
	private double totalPostageForCart;

	public void visit(Book book) {
		if(book.getPrice() < 10.0) {
			totalPostageForCart += book.getWeight() * 2;
		}
	}

	public void visit(Mail mail) {
		totalPostageForCart +=mail.getPrice()+ STAMP_PRICE;
	}

	public double getTotalPostage() {
		return totalPostageForCart;
	}

}
