import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.Account;

public class MainDemo {

	public static void main(String[] args) {
		Account acc1 = new Account(1234, "Jackie Chan");
		System.out.println(acc1.getAccNo());
		System.out.println(acc1.getAccName());
		
		System.out.println("---------------------");
		
		// here we have created the spring core container which reads the anyName.xml configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anyName.xml");
		
		// just ask the container for the object
		// Account acc2 = new Account();
		
		// Account acc2 = new Account(1050, "Michael Jakson");
		
		// Account acc2 = new Account();
		// acc2.setAccNum(2060);
		// acc2.setAccName("Will Smith");
		Account acc2 = context.getBean("account", Account.class); 
		System.out.println(acc2.getAccNo());
		System.out.println(acc2.getAccName());
		
		
	}

}
