package sporadic.java_async_method_example.async.method;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {

	private final String userId;

    public Task(String userId) {
        this.userId = userId;   
    }

    @Override
    public String call() throws Exception {
    	Thread.sleep(1500);
		return Thread.currentThread().getName() + " " + userId;
    }

}
