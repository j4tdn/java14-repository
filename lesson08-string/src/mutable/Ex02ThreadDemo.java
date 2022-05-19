package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02ThreadDemo {
	public static void main(String[] args) {
		System.out.println("Ex02#main - start");
		
		// create a thread to run parallel with thread main
		Thread t0 = new Thread(new Task(), "thread-0");
		t0.start(); // JVM automatically call Runnable#run
		
		// execute a task took 2 seconds
		doATask(2);
		
		System.out.println("Ex02#main - end");
	}
	
	// nested class
	private static class Task implements Runnable {

		@Override
		public void run() {
			doATask(4);
			System.out.println(Thread.currentThread().getName() + " is running ...");
			System.out.println("Task#executing ...");
		}
	}
	
	private static void doATask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
