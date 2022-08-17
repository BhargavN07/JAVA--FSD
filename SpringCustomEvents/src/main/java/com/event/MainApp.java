package com.event;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   ClassPathXmlApplicationContext context = 
         new ClassPathXmlApplicationContext("application.xml");

	   CustomEventPublisher cvp = 
		         (CustomEventPublisher) context.getBean("customEventPublisher");
	   
	   cvp.publish();  
	      cvp.publish();
   }
}