package com;

import com.model.Student;

public class First {
	public String one(){
		return "Welcome to Web Service";
	}
public int cal(int num1,int num2){
	return num1+ num2;
}
public Student getStudentById(int stdId){
	Student student=new Student();
	if(stdId==10){
		student.setStdId(10);
		student.setStdName("hii");
	}
	if(stdId==20){
		student.setStdId(20);
		student.setStdName("wake up");
		
	}
	return student;

}}