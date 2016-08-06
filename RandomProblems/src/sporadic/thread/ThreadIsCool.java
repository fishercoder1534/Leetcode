package sporadic.thread;

/** This is a cool and small program to show that threads don't run in the order that you can control, it's all scheduled by the thing called
 * Thread Scheduler.*/

public class ThreadIsCool implements Runnable{

	public static void main(String [] args){
		ThreadIsCool threadIsCool = new ThreadIsCool();
		Thread abc = new Thread(threadIsCool);
		Thread def = new Thread(threadIsCool);
		Thread ghi = new Thread(threadIsCool);
		abc.setName("abc");
		def.setName("def");
		ghi.setName("ghi");
		System.out.println("Now the three threads kick off:");
		
		abc.start();
		try {
		    /* Start second thread(def) only when first thread(abc) is dead*/
            abc.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		def.start();
		try {
            def.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		ghi.start();
		try {
            ghi.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Now the Program ended.");
	}
	
	@Override
	public void run(){
		for(int i = 0; i < 5; i++){
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " is running!");
		}
		System.out.println(Thread.currentThread().getName() + " is sleeping for 3 seconds");
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
}
