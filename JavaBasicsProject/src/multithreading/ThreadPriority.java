package multithreading;

public class ThreadPriority implements Runnable{

	String name;
	Thread t;
	long counter;
	
	public ThreadPriority(String name) {
		this.name = name;
		t = new Thread(this);
		t.setName(name);
		//t.start();
	}
	@Override
	public void run() {
		while(true) {
			counter++;
		}
	}
	
	

}
