package designPatterns.visitor_pattern;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
