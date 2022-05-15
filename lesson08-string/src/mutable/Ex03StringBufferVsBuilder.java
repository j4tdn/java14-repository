package mutable;

public class Ex03StringBufferVsBuilder {
	public static void main(String[] args) {
		System.out.println("Thread#main - start");

		MutableTask task = new MutableTask();

		Thread t0 = new Thread(task, "Thread-0");
		t0.start();

		Thread t1 = new Thread(task, "Thread-0");
		t1.start();

		// make sure thread-main run affer thread t0

		try {
			t0.join();
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("length: " + task.length());
		System.out.println("Thread#main - end");

	}

	private static class MutableTask implements Runnable {

		// mutable threads could access this task with share data
		// share data: StringBuffer || StringBuilder
		private StringBuffer mutable;
		// private StringBuilder mutable;
		private int count = 70000;

		public MutableTask() {
			mutable = new StringBuffer();
			// mutable = new StringBuilder
		}

		@Override
		public void run() {
			for (int i = 1; i <= count; i++) {
				mutable.append("A");
			}
		}

		public int length() {
			return mutable.length();
		}

	}
}
