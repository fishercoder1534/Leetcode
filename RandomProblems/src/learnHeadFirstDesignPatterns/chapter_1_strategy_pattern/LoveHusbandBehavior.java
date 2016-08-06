package learnHeadFirstDesignPatterns.chapter_1_strategy_pattern;

public class LoveHusbandBehavior implements LoveBehavior {

	@Override
	public void showLove() {
		System.out.println("I love my husband Steve Sun, he is just awesome!");
	}

}
