package common;

import lombok.Getter;

public class TextEditor {
	@Getter
	private SpellChecker spellChecker;

	// I have to comment this out when using inner bean method to inject
	// dependency
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	// I have to comment out the setter method if I'm using constructor based
	// dependency injection
	// a setter method to inject the dependency.
	// public void setSpellChecker(SpellChecker spellChecker) {
	// System.out.println("Inside setSpellChecker.");
	// this.spellChecker = spellChecker;
	// }

	// a getter method to return spellChecker
//	public SpellChecker getSpellChecker() {
//		return spellChecker;
//	}

	public void init() {
		System.out.println("Inside init() method.");
	}

	public void cleanup() {
		System.out.println("Inside cleanup() method.");
	}
}
