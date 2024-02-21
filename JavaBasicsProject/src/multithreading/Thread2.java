package multithreading;

public class Thread2 implements Runnable{
	
	String threadName;
	Thread t;
	
	public Thread2(String threadName) {
		this.threadName = threadName;
		t = new Thread(this);
		t.setName(threadName);
	}
	
	@Override
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(threadName + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(threadName + " completed");

	}

}
