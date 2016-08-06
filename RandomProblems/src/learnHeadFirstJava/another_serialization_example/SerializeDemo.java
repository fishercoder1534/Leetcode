package learnHeadFirstJava.another_serialization_example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Java provides a mechanism, called object serialization where an object can be
 * represented as a sequence of bytes that includes the object's data as well as
 * information about the object's type and the types of data stored in the
 * object.
 * 
 * After a serialized object has been written into a file, it can be read from
 * the file and deserialized that is, the type information and bytes that
 * represent the object and its data can be used to recreate the object in
 * memory.
 * 
 * Most impressive is that the entire process is JVM independent, meaning an
 * object can be serialized on one platform and deserialized on an entirely
 * different platform.
 * 
 * Classes ObjectInputStream and ObjectOutputStream are high-level streams that
 * contain the methods for serializing and deserializing an object.
 * 
 * The ObjectOutputStream class contains many write methods for writing various
 * data types, but one method in particular stands out:
 * 
 * public final void writeObject(Object x) throws IOException
 * 
 * The above method serializes an Object and sends it to the output stream.
 * Similarly, the ObjectInputStream class contains the following method for
 * deserializing an object:
 * 
 * public final Object readObject() throws IOException, ClassNotFoundException
 * 
 * This method retrieves the next Object out of the stream and deserializes it.
 * The return value is Object, so you will need to cast it to its appropriate
 * data type.
 */

public class SerializeDemo {

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
		employee.setAddress("1860 Charmeran Ave, San Jose, USA.");
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
	}

}
