package spring_import_annotation;

/** This is a class to demo @Import annotation.
 * Pay special attention to Config classes and normal classes, they are used
 * in different places, don't misuse them.
 * 
 * This pkg of application didn't use beans.xml at all! Cool! 
 * All annotation based configuration to use Spring!*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import common.TextEditor;

public class MainAppForDemoImportAnnotation {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(App2Config.class);
		// now both beans A and B will be available...
		App1 app1 = ctx.getBean(App1.class);
		App2 app2 = ctx.getBean(App2.class);
		app2.doCool();
		app1.doCooler();

		common.TextEditor te = ctx.getBean(TextEditor.class);

		System.out.println("That's the end of the program.");
	}

}
