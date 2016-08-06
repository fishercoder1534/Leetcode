/**
 * 
 */
package sporadic.thread.synchronization.withoutSynchronization;

/**
 * @author jiahuan
 * This produces DIFFERENT result every time you run this program, in contrast to the one with synchronization.
 * Here is a simple example which may or may not print counter value in sequence and every time we run it, it produces different result based on CPU availability to a thread.
 * Copied from this link: http://www.tutorialspoint.com/java/java_thread_synchronization.htm, refer to this link for further info.
 * 
 */
public class TestThread {
	public static void main(String args[]) {

	      PrintDemo PD = new PrintDemo();

	      ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
	      ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );

	      T1.start();
	      T2.start();

	      // wait for threads to end
	      try {
	         T1.join();
	         T2.join();
	      } catch( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }

}


class PrintDemo {
	   public void printCount(){
	    try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Counter   ---   "  + i );
	         }
	     } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	     }
	   }

	}

	class ThreadDemo extends Thread {
	   private Thread t;
	   private String threadName;
	   PrintDemo  PD;

	   ThreadDemo( String name,  PrintDemo pd){
	       threadName = name;
	        PD = pd;
	   }
	   public void run() {
	     PD.printCount();
	     System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }

	}
