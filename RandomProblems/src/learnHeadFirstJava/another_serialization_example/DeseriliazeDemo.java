package learnHeadFirstJava.another_serialization_example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeseriliazeDemo {
	private static final String FILE_DIRECTORY = "/tmp/employee.ser";
	static Employee e = null;
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(FILE_DIRECTORY);
			ObjectInputStream ois  = new ObjectInputStream(fis);
			e = (Employee) ois.readObject();
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
		
		System.out.println("Deserialized employee.ser is: " + e.toString() + ".");
	}

}
