package multable;

public class Ex03StringBufferVsStringBuilder {
	public static void main(String[] args) {
		
		System.out.println("Thread#main - start");

		MultableTask multableTask = new MultableTask();

		Thread t0 = new Thread(multableTask, "thread-0");
		t0.start();

		Thread t1 = new Thread(multableTask, "thread-1");
		t1.start();

		Thread t2 = new Thread(multableTask, "thread-0");
		t2.start();

		try {
			t0.join();
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("length : " + multableTask.length());

		System.out.println("Thread#main - end");
	}

	private static class MultableTask implements Runnable {
		// multable threads could access this task with share data
		// share data StringBuffer || StringBuilder
		private StringBuffer multable;
		private int count = 70000;

		public MultableTask() {
			// multable = new StringBuilder();
			multable = new StringBuffer();
		}

		@Override
		public void run() {
			for (int i = 1; i <= count; i++) {
				multable.append("A");
			}

		}

		public int length() {
			// get length share data
			return multable.length();
		}
	}
}
