package designPatterns.chapter_1_strategy_pattern;

public class RealWife extends Wife {

	public RealWife() {
		System.out.println("I'm the real wife - Sophie Yan! I'm Sophie Yan, the wife of Steve Sun, and I like cooking for my husband and family. ");
		this.cookBehavior = new CookRiceFlour();
		this.loveBehavior = new LoveHusbandBehavior();
	}
}
