package com.gyojincompany.ditest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student = new Student();
//		
//		student.setName("홍길동");
//		student.setAge(10);
//		student.setHeight(170);
//		student.setWeight(75);
//		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//컨테이너 생성
		
		
		
		Student stu1 = ctx.getBean("student2", Student.class);
		
		System.out.println(stu1.getName());//홍길동
		
		
		
	}

}
