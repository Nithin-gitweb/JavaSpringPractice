package com.DependencyInjection.StudentDetails;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterObject details = context.getBean("Student",InterObject.class);
		details.Welcome();
		details.DisplayingDetails();
		context.close();

	}

}
