package mutable;

import java.sql.Time;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Ex02ThreadDemo {
	public static void main(String[] args) {
		
		System.out.println("Ex02main -start");
		
		// create new thread
		Thread t0= new Thread(new Task(), "thread-0");
		t0.start();// JVM automatically call Runnable#run
		
		
		doTask(2);
		System.out.println("Ex02main -end");
	}
	//nested class
	private static class Task implements Runnable{
		@Override
		public void run() {
			doTask(4);
			System.out.println(Thread.currentThread().getName()+" is running...");
			System.out.println("Task#executing...");
			
		}
	}
	private static void doTask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
