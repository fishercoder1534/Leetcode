package com.sun.steve.VisitorPatternExample;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
