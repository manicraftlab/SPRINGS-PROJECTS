package com.nit.beans;

import lombok.Data;

@Data
public class Student {

    private int rollNumber;
    private String studentName;
    private String course;
    
    public void displayStudent() 
    {
    	
    	System.out.println("Roll Number  : " + rollNumber);
    	System.out.println("Student Name : " + studentName);
    	System.out.println("Course       : " + course);
    	
    }
}
        
        

//    // Setter Methods
//
//    public void setRollNumber(int rollNumber) 
//    {
//        this.rollNumber = rollNumber;
//    }
//
//    public void setStudentName(String studentName) 
//    {
//        this.studentName = studentName;
//    }
//
//    public void setCourse(String course) 
//    {
//        this.course = course;
//    }
//
//    // Display Method
//
