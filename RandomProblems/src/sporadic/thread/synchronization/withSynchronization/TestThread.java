/**
 * 
 */
package sporadic.thread.synchronization.withSynchronization;

/**
 * This produces the SAME result every time you run this program, in contrast to
 * the one without synchronization. Copied from this link:
 * http://www.tutorialspoint.com/java/java_thread_synchronization.htm, refer to
 * this link for further info.
 * 
 * When we start two or more threads within a program, there may be a situation
 * when multiple threads try to access the same resource and finally they can
 * produce unforeseen result due to concurrency issue. For example if multiple
 * threads try to write within a same file then they may corrupt the data
 * because one of the threads can overrite data or while one thread is opening
 * the same file at the same time another thread might be closing the same file.
 * 
 * So there is a need to synchronize the action of multiple threads and make
 * sure that only one thread can access the resource at a given point in time.
 * This is implemented using a concept called monitors. Each object in Java is
 * associated with a monitor, which a thread can lock or unlock. Only one thread
 * at a time may hold a lock on a monitor.
 * 
 * Java programming language provides a very handy way of creating threads and
 * synchronizing their task by using synchronized blocks. You keep shared
 * resources within this block. Following is the general form of the
 * synchronized statement:
 * 
 * synchronized(objectidentifier) { 
 * // Access shared variables and other shared resources 
 * }
 * 
 * Here, the objectidentifier is a reference to an object whose lock associates
 * with the monitor that the synchronized statement represents. Now we are going
 * to see two examples where we will print a counter using two different
 * threads. When threads are not synchronized, they print counter value which is
 * not in sequence, but when we print counter by putting inside synchronized()
 * block, then it prints counter very much in sequence for both the threads.
 */
public class TestThread {
	public static void main(String args[]) {

		PrintDemo PD = new PrintDemo();

		ThreadDemo T1 = new ThreadDemo("Thread - 1 ", PD);
		ThreadDemo T2 = new ThreadDemo("Thread - 2 ", PD);

		T1.start();
		T2.start();

		// wait for threads to end
		try {
			T1.join();
			T2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}

class PrintDemo {
	public void printCount() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Counter   ---   " + i);
			}
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
	}

}

class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	PrintDemo PD;

	ThreadDemo(String name, PrintDemo pd) {
		threadName = name;
		PD = pd;
	}

	public void run() {
		synchronized (PD) {//Here's all the difference between the two examples! It uses this synchronized keyword to identify the resources that need to be synchronized!
			PD.printCount();
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}
