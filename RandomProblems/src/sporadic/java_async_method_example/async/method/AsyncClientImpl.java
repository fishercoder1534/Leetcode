package sporadic.java_async_method_example.async.method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncClientImpl implements AsyncClient {
	ExecutorService executor = Executors.newFixedThreadPool(3);
	
	@Override
	public void executeAsynchronous(String userId) {
		List<Future<String>> list = new ArrayList<Future<String>>();
		
		Callable<String> callable = new Task(userId);
		
		for(int i = 0; i < 10; i++) {
			Future<String> future = executor.submit(callable);
			list.add(future);
		}
		
		for(Future<String> future : list){
			try {
				System.out.println(new Date() + " " + future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		System.out.println("That's the end of the executeAsynchronous method!");
		executor.shutdown();
    }
}
