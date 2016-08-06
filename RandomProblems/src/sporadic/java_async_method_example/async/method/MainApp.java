package sporadic.java_async_method_example.async.method;

/**This package was used to demo the difference between sync and async methods, but right now, there's really no difference between the impl of SyncClientImpl and AsyncClientImpl classes,
 * I need to rewrite them to deepen my understanding!*/
public class MainApp {

	public static void main(String... args) {
		SyncClient syncClient = new SyncClientImpl();

		syncClient.executeSynchronous("this is executing synchronous method!");

		AsyncClient asyncClient = new AsyncClientImpl();
		asyncClient
				.executeAsynchronous("this is executing Asynchronous method!");

		System.out.println("That's the end of MainApp!");
	}
}
