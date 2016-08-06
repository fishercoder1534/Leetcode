package learnHeadFirstDesignPatterns.chapter_1_strategy_pattern;

public class ModelWife extends Wife {

	public ModelWife() {
		loveBehavior = new LoveHusbandBehavior();
		cookBehavior = new CookRiceFlour();
	}
	
}
