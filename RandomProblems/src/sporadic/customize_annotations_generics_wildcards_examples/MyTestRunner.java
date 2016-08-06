package sporadic.customize_annotations_generics_wildcards_examples;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class MyTestRunner {
	public void run(Class<?>... klasses) {
		for (Class<?> testClass : klasses) {
			runTestClass(testClass);
		}
	}
	
	//an overloaded method to the above one, so that it could accept a list of classes, not just a simple array of classes
	public void run(List<Class<?>> testCaseClasses) {
		for (Class<?> testClass : testCaseClasses) {
			runTestClass(testClass);
		}
	}

	private void runTestClass(Class<?> klass) {
		for (Method method : klass.getMethods()) {
			SteveSunFirstCustomAnnotation annotation = method
					.getAnnotation(SteveSunFirstCustomAnnotation.class);
			if (annotation != null)
				runTestMethod(klass, method, annotation);
		}
	}

	private void runTestMethod(Class<?> klass, Method method,
			SteveSunFirstCustomAnnotation annotation) {
		if (annotation.state() != MyTestState.ACTIVE)
			return;
		try {
			System.out.println("Running test: "
					+ getTestName(method, annotation));
			Object testInstance = klass.newInstance();
			method.invoke(testInstance);
			System.out.println("SUCCESS");
		} catch (InstantiationException e) {
			System.err.println("FAILED: Failed to instantiate class "
					+ klass.getName());
		} catch (IllegalAccessException e) {
			System.err.println("FAILED: Failed to call test method "
					+ method.getName());
		} catch (InvocationTargetException e) {
			checkThrowable(annotation, e.getCause());
		}
	}

	private static String getTestName(Method method,
			SteveSunFirstCustomAnnotation annotation) {
		return !annotation.name().isEmpty() ? annotation.name() : method
				.getName();
	}

	private void checkThrowable(SteveSunFirstCustomAnnotation annotation,
			Throwable th) {
		if (annotation.expected() == th.getClass())
			System.out.println("annotation.expected() executes: SUCCESS");
		else if (annotation.ignore() == th.getClass()) {
			System.out.println("annotation.ignore() executes: SUCCESS");
		} else {
			System.out.println("FAILED: " + th.getMessage());
		}
	}
}
