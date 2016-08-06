package learnHeadFirstJava.another_serialization_example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is a combo class that combines the other two classes together:
 * SerializeDemo and DeserializeDemo, makes it easier to read and play with.
 */
public class MainApp {
	private static final String FILE_DIRECTORY = "/tmp/employee.ser";

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-configuration/serialization-spring-configuration.xml");
		Employee employee = (Employee) context.getBean("employee");

		// Employee employee = new Employee();//I don't need this line any more,
		// since I quickly set up a component-scan using Spring to auto wire
		// this employee bean for me, this is so cool! I feel so at home with
		// Spring dependency injection now! Praise the Lord!a
		employee.setName("Steve Sun");
		employee.setAge(26);
		employee.setAddress("1860 Charmeran Ave, San Jose, USA. 2015/08/08");
		employee.setSSN(12345678);
		employee.setSalary(103000);

		try {
			FileOutputStream fos = new FileOutputStream(FILE_DIRECTORY);
			ObjectOutputStream ous = new ObjectOutputStream(fos);
			ous.writeObject(employee);
			ous.close();
			fos.close();
			System.out.println("Serialized data is saved in " + FILE_DIRECTORY
					+ ".");
		} catch (IOException e) {
			e.printStackTrace();
		}

		Employee emp = null;

		try {
			FileInputStream fis = new FileInputStream(FILE_DIRECTORY);
			ObjectInputStream ois = new ObjectInputStream(fis);
			emp = (Employee) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {
			System.out.println("Caught IOException");
			e.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			System.out.println("Employee class not found");
			e.printStackTrace();
			return;
		}

		System.out.println("Deserialized employee.ser is: " + emp.toString()
				+ ".");
	}
}
