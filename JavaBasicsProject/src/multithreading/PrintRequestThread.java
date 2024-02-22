package multithreading;

public class PrintRequestThread implements Runnable{
	String msg;
	ResourcePrinter printer;
	Thread t;

	public PrintRequestThread(String msg, ResourcePrinter printer) {
		super();
		this.msg = msg;
		this.printer = printer;
		this.t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		//
		//
		synchronized(printer) {
			printer.display(msg);
		}
		
		//
		//
		//
	}
	

}
