package learnHeadFirstDesignPatterns.chapter_3_decorator_pattern;

/**Classes should be open for extension and closed for modification.
 * 
 * Decorator pattern: attach additional responsibilities to an object dynamically.*/
public class DecoratorPatternTestDrive {
	
	public static void main(String... args){
		System.out.println("Program started.");
		Beverage espresso = new Espresso();
		print(espresso);
		
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Mocha(houseBlend);
		print(houseBlend);
		
		houseBlend = new Soy(houseBlend);
		print(houseBlend);
		
		houseBlend = new Whip(houseBlend);
		print(houseBlend);
		
		System.out.println("Program ended.");
	}

	/**
	 * @param beverage
	 */
	protected static void print(Beverage beverage) {
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
}
