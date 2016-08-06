package sporadic.semaphore;

import java.util.concurrent.Semaphore;

/**
 * This is a small program to demo how semaphore can create trouble for us.
 * One rule of thumb is:
 * 	Always release what you acquire!
 * Copied from online.
 *
 */
//this is a bad public class name, it doesn't apply to 
//what this class really do, it's a name from a different class that I copied earlier.
public class ConnectionLimiter {

	private static class DoubleResourceGrabber implements Runnable{
		
		private Semaphore first;
		private Semaphore second;
		
		public DoubleResourceGrabber(Semaphore s1, Semaphore s2){
			first = s1;
			second = s2;
		}

		@Override
		public void run() {
			Thread t = Thread.currentThread();
			
			try {
				first.acquire();
				System.out.println(t.getName() + " acquired " + first);
				
//				Thread.sleep(20);//to demo a deadlock
				
//				second.acquire();
//				System.out.println(t.getName() + " acquired " + second);
				
//				second.release();
//				System.out.println(t.getName() + " released " + second);
				
				first.release();
				System.out.println(t.getName() + " released " + first);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Semaphore s1 = new Semaphore(1);//give it only 1 permit
		Semaphore s2 = new Semaphore(1);//give it only 1 permit as well
		Thread t1 = new Thread(new DoubleResourceGrabber(s1, s2));
		//now reverse them, here comes the trouble
		Thread t2 = new Thread(new DoubleResourceGrabber(s2, s1));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("We got lucky!");
		
	}

}
