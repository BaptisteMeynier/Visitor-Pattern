package com.java.design.pattern.visitor;

import com.java.design.pattern.visitor.model.Book;
import com.java.design.pattern.visitor.model.Mail;

public interface Visitor{

	public void visit(Book book);

	public void visit(Mail mail);

}
