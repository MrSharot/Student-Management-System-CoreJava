package com.mushfiqur.rahman.studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		// how many students to add
		System.out.println("Enter number of students to enroll: ");
		int numOfStudents = stdin.nextInt();
		Student[] students = new Student[numOfStudents];

		// create a number of students
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}

		for (int i = 0; i < numOfStudents; i++) {
			System.out.println(students[i].toString());

		}

	}
}
