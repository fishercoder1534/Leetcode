package learnHeadFirstDesignPatterns.chapter_3_decorator_pattern;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip (Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .77 + beverage.cost();
	}

}
