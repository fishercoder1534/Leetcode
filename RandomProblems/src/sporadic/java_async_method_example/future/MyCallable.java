package sporadic.java_async_method_example.future;

import java.util.concurrent.Callable;

/**
 * This class is used to help me understand Future class, Future class must be assigned from the Executors. 
 * class's submit() method to process an argument which implements Callable interface, 
 * that's why I have this class called MyCallable here!*/
public class MyCallable implements Callable {

	@Override
	public String call() throws Exception {
		Thread.sleep(1500);
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " is being called now!!!");
		return threadName;
	}
	
}
