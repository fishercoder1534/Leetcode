/**
 * This is a class to help me understand "CLASS" in java.
 */
package sporadic;

/**
 * @author SteveSun
 *
 */
public class UnderstandClass {

	/**
	 * 
	 */
	public UnderstandClass() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UnderstandClass uc = new UnderstandClass();
		Class c1 = UnderstandClass.class;
		Class c2 = uc.getClass();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1 == c2);
		Class c3 = null;
		try {
			c3 = Class.forName("sporadic.UnderstandClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c3);
		System.out.println("End of the program.");
	}

}
