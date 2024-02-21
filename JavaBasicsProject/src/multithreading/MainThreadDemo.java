package multithreading;
public class MainThreadDemo {

	// Thread t1 = new Thread(m);
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
//		System.out.println(mainThread.getName());
//		System.out.println(mainThread.getPriority());
//		System.out.println(mainThread.isAlive());
//		System.out.println(mainThread.isDaemon());
//		System.out.println(mainThread.getThreadGroup());
//		System.out.println(mainThread.getState());
//		
//		mainThread.setName("myMainThread");
//		System.out.println(mainThread.getName());
//		
//		mainThread.setPriority(Thread.NORM_PRIORITY + 2);
//		System.out.println(mainThread.getPriority());

		Thread1 child1 = new Thread1("ONE"); // the thread obj is created at java level
												// here the OS is not aware of a child to be created
		child1.start(); // this method tells the OS to create the thread at OS level
						// by this the child thread is spawned from the parent thread
						// this method in turn calls the run()
		Thread2 child2 = new Thread2("TWO");
		child2.t.start();
//		Thread child2 = new Thread(child);
//		child2.start();
		for(int i=1;i<=5;i++) {
			System.out.println(mainThread.getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			child1.join();
			child2.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(mainThread.getName() + " completed");
	}

}
