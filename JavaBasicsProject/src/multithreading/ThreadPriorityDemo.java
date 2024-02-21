package multithreading;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority("ONE");
		ThreadPriority tp2 = new ThreadPriority("TWO");
		
		tp1.t.setPriority(Thread.MIN_PRIORITY);
		tp2.t.setPriority(Thread.MAX_PRIORITY);
		
		tp1.t.start();
		tp2.t.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tp1.t.stop();
		tp2.t.stop();
		
		System.out.println(tp1.t.getName() + ":" + tp1.counter);
		System.out.println(tp2.t.getName() + ":" + tp2.counter);
	}

}
