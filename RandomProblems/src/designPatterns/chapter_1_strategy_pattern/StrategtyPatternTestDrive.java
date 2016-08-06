package designPatterns.chapter_1_strategy_pattern;

/**
 * The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from clients that use it.*/

/**Design principle:
 * Favor composition over inheritance.
 * 
 * Not only does it let you encapsulate a family of algorithms into their own set of classes, but it also lets you change behavior at runtime.*/
public class StrategtyPatternTestDrive {

	public static void main(String[] args) {
		Wife wife = new RealWife();
		wife.performLove();
		wife.performCook();;
		
		wife.setCookBehavior(new CookNoodlesBehavior());
		wife.performCook();
	}

}
