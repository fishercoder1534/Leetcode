package spring_import_annotation;

/** This is a class used for MainApp to demo @Import annotation. */
public class App2 {
	public App2() {
		setup();
		work();
		cleanup();
	}

	private void cleanup() {
		System.out.println("This is App2: I'm cleaning myself up!");
	}

	private void work() {
		System.out.println("This is App2: I'm working now!");
	}

	private void setup() {
		System.out.println("This is App2: I'm setting myself up!");
	}

	public void doCool() {
		System.out.println("This is App2: doing something cool!");
	}
}
