package mutable;

import java.text.NumberFormat;

public class Ex03StringBufferVsBuilder {
	public static void main(String[] args) {
		System.out.println("Thread#main - start ");
		
		Mutable task= new Mutable();
		Thread t0 = new Thread(task,"thread0");
		t0.start();
		Thread t1 = new Thread(task,"thread0");
		t1.start();
		try {
			t0.join();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(task.length());
		
		
		System.out.println("Thread#main - end");
	}
	private static class Mutable implements Runnable{
		// mutable threads could access this task with share data
		// share data
		private StringBuffer mutable;
		private int count=50000;
		public Mutable() {
			mutable= new StringBuffer();
		}
		@Override
		public void run() {
			for(int i=1 ;i<= count;i++) {
				mutable.append("A");
			}
	}
		public int length() {
			return mutable.length();
		}
}
}
