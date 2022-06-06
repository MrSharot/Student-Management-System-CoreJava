package com.mushfiqur.rahman.studentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses= null;
	private int tuitionBalance= 0;	
	private static int costOfCourse = 5000;
	private static int id = 1000;
	
	Scanner stdin = new Scanner(System.in);
	
	
	// COnstructor: prompt user to name students name and year
	public Student() {
		
		System.out.println("Enter first name: ");
		this.firstName = stdin.nextLine();
		System.out.println("Enter last name: ");
		this.lastName = stdin.nextLine();
		System.out.print("1. Freshman\n2. 2nd Year\n3. 3rd Year\n4. Final Year\nEnter student class level: ");
		this.gradeYear = stdin.nextInt();

		setStudentId();
		
		
	}
	
	// Generate id
	private void setStudentId() {
		// grade level + static id
		id++;
		this.studentId= gradeYear+ ""+ id;
		
	}
	
	// Enroll in course
	public void enroll() {
		// getting inside a loop
		do {
			System.out.print("Enter courses to enroll or (Q to quit): ");
			String course = stdin.nextLine();
			if(!course.equals("Q")) {
				courses = courses+ "\n "+ course;
				tuitionBalance += costOfCourse; 
			}
			else {
				break;
			}
			
		}while(1 !=0);

		//System.out.println("Tuition balance: "+ tuitionBalance);
	}
	
	
	// view balance
	public void viewBalance() {
		System.out.println("The amount you need to pay is: BDT"+ tuitionBalance);
		
	}
	
	// pay tuition 
	public void payTuition() {
		viewBalance();
		
		System.out.println("Enter your payment: BDT");
		int payment = stdin.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment BDT"+payment);
		viewBalance();
		
		
	}
	
	// show status
	public String toString() {
		
		return "Name: "+firstName + " "+lastName+" "+
				"\nGrade Level: "+ gradeYear+
				"\nStudent Id:"+studentId+"\nCourse Enrolled: "+courses+
				"\nBalance: BDT"+tuitionBalance;
		
	}
	
	
	

}
