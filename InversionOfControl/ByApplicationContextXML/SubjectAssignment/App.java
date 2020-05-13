package com.InversionControl.SubjectAssignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AssignmentInter obj = context.getBean("Assignment", AssignmentInter.class);
		System.out.println(obj.GetAssignment());
		context.close();

	}

}
