package learnHeadFirstDesignPatterns.chapter_3_decorator_pattern;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return .99 + beverage.cost();
	}

}
