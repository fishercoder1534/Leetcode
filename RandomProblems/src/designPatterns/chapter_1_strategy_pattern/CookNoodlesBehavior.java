package designPatterns.chapter_1_strategy_pattern;

public class CookNoodlesBehavior implements CookBehavior {

	@Override
	public void cook() {
		System.out.println("I'm also fond of cooking Chinese noodles!");
	}

}
