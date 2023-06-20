package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MailApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		EmailClient emailClient = context.getBean("emailClient",EmailClient.class);
		emailClient.sendEmail("hello");
	}
 
}
