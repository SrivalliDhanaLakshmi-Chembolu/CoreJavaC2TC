package com.tns.client;

import com.tns.entity.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		
		student.setSid(3);
		student.setSname("Jo");
		student.setCgpa(7.8f);
		service.addStudent(student);
		System.out.println("Data Inserted");
		
	}

}
