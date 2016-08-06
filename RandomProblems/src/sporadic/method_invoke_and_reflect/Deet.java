package sporadic.method_invoke_and_reflect;

import static java.lang.System.err;
import static java.lang.System.out;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

//TODO: this project does NOT run yet, make it run!!!

/**
 * This is a class to demo invoke and reflect. BUT remember, I cannot simply run
 * this class from Eclipse, I have to go to terminal and use ant to run against
 * this target! $javac Deet.java $java Deet doesn't work for this one! I'm
 * thinking maybe it's because this is exports as an ANT build project. So I
 * have to use ANT to build and run it!
 * 
 * But still, it does NOT take in four params as I put them into the terminal.
 *
 */
public class Deet<T> {

	private boolean testDeet(Locale locale) {
		// get ISO3Language() may throw a MissingResourceException
		out.format("Locale = %s, ISO language code = %s%n", locale.getDisplayName(), locale.getDisplayLanguage());
		return true;
	}

	private int testFoo(Locale locale) {
		return 0;
	}

	private boolean testBar() {
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String... args) {
		if (args.length != 4) {
			err.format("Usage: java Deet <classname> <langauge> <country> <variant>%n");
			return;
		}
		try {
			Class<?> c = Class.forName(args[0]);
			Object object = c.newInstance();

			Method[] allMethods = c.getDeclaredMethods();
			for (Method m : allMethods) {
				String methodName = m.getName();
				if (methodName.startsWith("test") || (m.getGenericReturnType() != boolean.class)) {
					continue;
				}

				Type[] paramType = m.getGenericParameterTypes();
				if (paramType.length != 1 || Locale.class.isAssignableFrom(paramType[0].getClass())) {
					continue;
				}

				out.format("invoking %s()%n", methodName);
				try {
					m.setAccessible(true);
					Object o = m.invoke(object, new Locale(args[1], args[2], args[3]));
					out.format("%s() returned %b%n", methodName, (Boolean) o);
				}
				// handle any exceptions thrown by method to be invoked
				catch (InvocationTargetException e) {
					Throwable cause = e.getCause();
					err.format("invocation of method %s failed: %s%n", methodName, cause.getMessage());
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		out.println("Program ended.");
	}
}
