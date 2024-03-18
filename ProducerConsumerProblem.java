package Strings;

public class ProducerConsumerProblem {
	public static class SharedData {

		private String str = "";
		private boolean empty;

		public SharedData() {
			empty = true;
		}

		public synchronized String getData() {
			String s;
			while (empty) {
				try {
					System.out.println("waiting for data...");
					wait();
				} catch (InterruptedException e) {
				}
			}
			s = str;
			empty = true;
			notifyAll();
			return (s);
		}

		public synchronized void putData(String s) {
			while (!empty) {
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}
			str = s;
			empty = false;
			notifyAll();
		}

	}

	public static class Producer implements Runnable {

		private SharedData sd;
		private String[] messageList = { "hello", "there", "you", "all" };

		public Producer(SharedData s) {
			sd = s;
		}

		public void run() {
			for (int i = 0; i < messageList.length; i++) {
				sd.putData(messageList[i]);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
			}
		}

	}

	public static class Consumer implements Runnable {

		private SharedData sd;

		public Consumer(SharedData s) {
			sd = s;
		}

		public void run() {
			String msg = "";

			for (int i = 0; !msg.equals("all"); i++) {
				msg = sd.getData();
				System.out.println("msg = " + msg);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public static void main(String[] args) {
		SharedData share = new SharedData();
		Producer p = new Producer(share);
		Consumer c = new Consumer(share);

		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}

}
