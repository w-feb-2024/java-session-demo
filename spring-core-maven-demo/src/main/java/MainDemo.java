import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.AppConfig;
import mybeans.Account;
import mybeans.Address;

public class MainDemo {

	public static void main(String[] args) {
//		Account acc1 = new Account(1234, "Jackie Chan");
//		System.out.println(acc1.getAccNo());
//		System.out.println(acc1.getAccName());
		
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
		
		System.out.println("------------------------------");
		// creating objects without spring core container
		Address add1 = new Address("Trichy", "Tamil Nadu");
		Account acc3 = new Account(6789, "Danial Radcliff", add1);
		System.out.println(acc3);
		System.out.println("------------------------------");
		
		// creating objects using spring core container
//		Account acc4 = (Account) context.getBean("account");
		Account acc4 = context.getBean("account", Account.class);
		System.out.println(acc4);
		
		acc4.setAccName("test");
		System.out.println(acc4);
		
		Account acc5 = context.getBean("account", Account.class);
		System.out.println(acc5);
		
		System.out.println("----------------------------");
		// one way
		//use annoattion-beans.xml, if you want to specify that it is annotation based configuration 
			//and specify the base packages to be scanned in the xml file
		//ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("annotation-beans.xml");
		
		// the other way - if you dont want to use xml file, then use AnnotationConfigApplicationContext and pass
			// the base package in the constructor
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext("mybeans");
		Account account1 = context1.getBean("account", Account.class);
		System.out.println(account1);
		
		System.out.println("----------------------------");
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
		Account account2 = context2.getBean("retrieveAccount", Account.class);
		System.out.println(account2);
	}

}
