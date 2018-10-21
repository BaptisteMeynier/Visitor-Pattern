package com.java.design.pattern.visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.java.design.pattern.visitor.model.Book;
import com.java.design.pattern.visitor.model.Mail;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitorTest {

	@Test
	public void should_not_compute_price() {
		ShoppingCart cart=new ShoppingCart();
		assertEquals(0,(int) cart.calculatePostage());
	}
	
	@Test
	public void should_compute_price() {
		ShoppingCart cart=new ShoppingCart();
		cart.purchaseItem(new Book(9.99,5d));
		cart.purchaseItem(new Book(35,20d));
		cart.purchaseItem(new Book(10,10d));
		cart.purchaseItem(new Mail(2d));
		assertTrue(cart.calculatePostage() > 0);
	}
	
	@Test
	public void should_compute_price2() {
		ShoppingCart cart=new ShoppingCart();
		cart.purchaseItem(new Book(9.99,5d));
		cart.purchaseItem(new Book(35,20d));
		cart.purchaseItem(new Book(10,10d));
		cart.purchaseItem(new Mail(2d));
		assertEquals(12, (int)cart.calculatePostage() );
	}
	
}
