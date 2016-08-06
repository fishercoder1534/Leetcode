package designPatterns.chapter_3_decorator_pattern;

import lombok.Getter;

public abstract class Beverage {
	@Getter
	String description = "Unknown beverage";
	
	public abstract double cost();
}
