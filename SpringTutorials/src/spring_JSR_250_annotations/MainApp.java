package spring_JSR_250_annotations;

/**Following is the content of the MainApp.java file. Here you 
 * need to register a shutdown hook registerShutdownHook() method that 
 * is declared on the AbstractApplicationContext class. 
 * This will ensures a graceful shutdown and calls the relevant destroy methods.*/

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring_JSR_250_annotations/Beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		context.registerShutdownHook();

		System.out.print("\nThe end!\n");
	}
}
