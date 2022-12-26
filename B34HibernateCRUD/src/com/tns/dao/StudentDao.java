package com.tns.dao;

import com.tns.entity.Student;

public interface StudentDao {
 
    public abstract void addStudent(Student student);
    public abstract void updateStudent(Student student);
	public abstract void deleteStudent(Student student);
	public abstract Student getStudentById(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
