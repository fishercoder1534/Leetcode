package learnHeadFirstJava.serializationIsFun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GospelSaverTest {
	public static void main(String[] args) throws ClassNotFoundException {
		GospelBook matthew = new GospelBook("Matthew", "anonymous", 1);
		GospelBook mark = new GospelBook("Mark", "unknown", 2);
		GospelBook luke = new GospelBook("Luke", "not named", 3);
		GospelBook john = new GospelBook("John", "anonymous", 4);
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Gospel.ser"));
			os.writeObject(mark);
			os.writeObject(matthew);
			os.writeObject(luke);
			os.writeObject(john);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		john = null;
		matthew = null;
		luke = null;
		mark = null;
		
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("Gospel.ser"));
			GospelBook restore1 = (GospelBook) is.readObject();
			GospelBook restore2 = (GospelBook) is.readObject();
			GospelBook restore3 = (GospelBook) is.readObject();
			GospelBook restore4 = (GospelBook) is.readObject();
			System.out.println("restore1 name is: " + restore1.getName());
			System.out.println("restore2 name is: " + restore2.getName());
			System.out.println("restore3 name is: " + restore3.getName());
			System.out.println("restore4 cnamelass is: " + restore4.getName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Program ended.");
	}
}
