package spring_import_annotation;

/** This is a class used for MainApp to demo @Import annotation. */
public class App1 {
	public App1() {
		setup();
		work();
		cleanup();
	}

	private void cleanup() {
		System.out.println("This is App1: I'm cleaning myself up!");
	}

	private void work() {
		System.out.println("This is App1: I'm working now!");
	}

	private void setup() {
		System.out.println("This is App1: I'm setting myself up!");
	}

	public void doCooler() {
		System.out.println("This is App1: doing something cool!");
	}
}
