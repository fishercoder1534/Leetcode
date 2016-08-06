/**
 * 
 */
package sporadic.producer_consumer_example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * 在 Java 中可以用 wait、notify 和 notifyAll 来实现线程间的通信。
 * 举个例子，如果你的Java程序中有两个线程——即生产者和消费者，那么生产者可以通知消费者，让消费者开始消耗数据，
 * 因为队列缓冲区中有内容待消费（不为空）。相应的，消费者可以通知生产者可以开始生成更多的数据，
 * 因为当它消耗掉某些数据后缓冲区不再为满。
 * 
 * 如何使用Wait
 * 尽管关于wait和notify的概念很基础，它们也都是Object类的函数，但用它们来写代码却并不简单。
 * 如果你在面试中让应聘者来手写代码，用wait和notify解决生产者消费者问题，我几乎可以肯定他们中的大多数都会无所适从或者犯下一些错误，
 * 例如在错误的地方使用 synchronized 关键词，没有对正确的对象使用wait，或者没有遵循规范的代码方法。
 * 说实话，这个问题对于不常使用它们的程序员来说确实令人感觉比较头疼。
 * 
 * 第一个问题就是，我们怎么在代码里使用wait()呢？
 * 因为wait()并不是Thread类下的函数，我们并不能使用Thread.call()。
 * 事实上很多Java程序员都喜欢这么写，因为它们习惯了使用Thread.sleep()，所以他们会试图使用wait() 来达成相同的目的，但很快他们就会发现这并不能顺利解决问题。
 * 
 * 正确的方法是对在多线程间共享的那个Object来使用wait。
 * 
 * 在生产者消费者问题中，这个共享的Object就是那个缓冲区队列。
 * 
 * 第二个问题是，既然我们应该在synchronized的函数或是对象里调用wait，那哪个对象应该被synchronized呢？
 * 答案是，那个你希望上锁的对象就应该被synchronized，即那个在多个线程间被共享的对象。在生产者消费者问题中，应该被synchronized的就是那个缓冲区队列。*/

/**
 * Simple Java program to demonstrate How to use wait, notify and notifyAll()
 * method in Java by solving producer consumer problem.
 * 
 * @author Javin Paul
 */
public class ProducerConsumerInJava {
	public static void main(String args[]) {
		System.out.println("How to use wait and notify method in Java");
		System.out.println("Solving Producer Consumper Problem");
		Queue<Integer> sharedQueueOrBuffer = new LinkedList<>();
		int maxSize = 10;
		Thread producer = new Producer(sharedQueueOrBuffer, maxSize, "PRODUCER");
		Thread consumer = new Consumer(sharedQueueOrBuffer, maxSize, "CONSUMER");
		producer.start();
		consumer.start();
	}
}

/**
 * Producer Thread will keep producing values for Consumer to consumer. It will
 * use wait() method when Queue is full and use notify() method to send
 * notification to Consumer Thread.
 * 
 */
class Producer extends Thread {
	private Queue<Integer> queue;
	private int maxSize;

	public Producer(Queue<Integer> queue, int maxSize, String name) {
		super(name);
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.size() == maxSize) {
					try {
						System.out.println("Queue is full, "
								+ "Producer thread waiting for "
								+ "consumer to take something from queue");
						queue.wait();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				Random random = new Random();
				int i = random.nextInt();
				System.out.println("Producing value : " + i);
				queue.add(i);
				queue.notifyAll();
			}
		}
	}
}

/**
 * Consumer Thread will consume values form shared queue. It will also use
 * wait() method to wait if queue is empty. It will also use notify method to
 * send notification to producer thread after consuming values from queue.
 * 
 */
class Consumer extends Thread {
	private Queue<Integer> queue;
	private int maxSize;

	public Consumer(Queue<Integer> queue, int maxSize, String name) {
		super(name);
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.isEmpty()) {
					System.out.println("Queue is empty,"
							+ "Consumer thread is waiting"
							+ " for producer thread to put something in queue");
					try {
						queue.wait();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				System.out.println("Consuming value : " + queue.remove());
				queue.notifyAll();
			}
		}
	}
}