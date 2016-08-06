package sporadic.exceptionsCanBeSelfDefined;

/**
 * This is a simple program to help myself better understand what it really
 * means to catch/throw an exception.
 * 
 * "catch" means to catch the possible exception while executing that method, if
 * the potential exception is not caught in time, the calling method will be
 * interrupted, and all the calling trace up to the main method will be
 * interrupted subsequently, then the whole program is interrupted/stopped.
 * 
 * But with catch statement, the possible exception is caught, or in other
 * words, the exception is being handled/taken care of. Thus the calling method
 * and the whole program could continue. Cool! p.s. swallow the exception just
 * means not to catch it.
 * 
 * This "catch" block can be kind of equivalent to "throws" statement in the
 * method definition/declaration, I can do either one, It's just that "throws"
 * cannot catch that exception, but it lets the compiler be aware that it's
 * possible that this method will throw an exception.
 * 
 * However, with a "throw" statement, I throw this caught exception back to the
 * running program, this way, the program will be interrupted/stopped again!
 */

public class UnderstandExceptionTryCatch {

	private static void divide(int a, int b) {
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("It enters ArithmeticException branch.");
			ae.printStackTrace();
			// throw ae;
		} catch (RuntimeException re) {
			System.out.println("It enters RuntimeException branch.");
			re.printStackTrace();
			// throw re;
		} catch (Exception e) {
			System.out.println("It enters Exception branch.");
			e.printStackTrace();
			// throw e;
		} catch (Throwable t) {
			System.out.println("It enters Throwable branch.");
			t.printStackTrace();
			// throw t;
		}
	}

	public static void main(String[] args) {
		divide(2, 0);
		System.out.println("That's the end of the program!");
	}
}
