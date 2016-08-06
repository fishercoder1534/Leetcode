package learnHeadFirstDesignPatterns.chapter_2_observer_pattern;

/**NOTE: I didn't really implement the Observer pattern from Head First book here.
 * Just implemented the introduction part here. Could continue if interests arise in the future. - 10/04/2015*/

/**
 * The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.
 * 
 * Subjects + Observers = Observer Pattern */

/**Design principle:
 * Strive for loosely coupled designs between objects that interact.*/
public class ObserverPatternTestDrive {

	public static void main(String[] args) {
		CoreFamily coreFamily = new CoreFamilyImpl(" 1 Peter ", "Steve Sun & Sophie Yan", 1, 7);
		Relative eason = new RelativeImpl("Eason", coreFamily);
		coreFamily.registerRelative(eason);
		Relative motherInLaw = new RelativeImpl("Jinzhi Lin", coreFamily);
		coreFamily.registerRelative(motherInLaw);
		Relative fatherInLaw = new RelativeImpl("Jianlin Yan", coreFamily);
		coreFamily.registerRelative(fatherInLaw);
		
		coreFamily.setCoreFamilyAttributes("Sophie and Steve NEW NAME", 8, 2, "1 John");
		System.out.print("Program ended.");
	}

}
