package vn.devpro.bai2ToanTu.bai5;

import java.util.Scanner;

public class StudentManagement {
	public static Scanner scanner = new Scanner(System.in);
	static Subject[] sub = new Subject[5];
	
	
	public static Subject inputSubjectInfo() {		
		Subject sub = new Subject();
		
		System.out.print("Enter subject code: "); sub.subjectCode = scanner.nextLine();
		System.out.print("Enter subject name: "); sub.subjectName = scanner.nextLine();
		System.out.print("Enter subject coefficient: "); sub.subjectCoefficient= scanner.nextDouble();
		System.out.print("Enter subject point: "); sub.subjectPoint = scanner.nextDouble();
		
		return sub;
	}
	
	
	public static void showInfoSubject(Subject sub) {
		System.out.print("\nEnter subject code: " + sub.subjectCode); 
		System.out.print("\nEnter subject name: " + sub.subjectName); 
		System.out.print("\nEnter subject coefficient: " + sub.subjectCoefficient); 
		System.out.print("\nEnter subject point: " + sub.subjectPoint); 
	}
	
	public static Subject[] inputArraySubject() {
//		Subject[] sub = new Subject[5];
		
		for (int i = 0; i < sub.length; i++) {
			System.out.print("Enter subject " + (i + 1) + "\n");	
			sub[i] = inputSubjectInfo();
			scanner.nextLine();
		}
		
		return sub;
	}
	public static void showArraySubject(Subject[] sub) {
		System.out.println("\n\tDisplays information of five subjects");
		for (int i = 0; i < sub.length; i++) {
			showInfoSubject(sub[i]);
			System.out.println();
		}
		
	}
	public static Student inputInfo() {
		Student student = new Student();
//		Subject[] sub = new Subject[5];
		System.out.println("Enter student information and subjects");
		System.out.print("Enter student code: "); student.studentCode = scanner.nextLine();
		System.out.print("Enter last name: "); student.lastName = scanner.nextLine();
		System.out.print("Enter name: "); student.name = scanner.nextLine();
		System.out.print("Enter date: "); student.dateOfBirth = scanner.nextLine();
		
		sub = inputArraySubject();		
		return student;
		
	}
	
	public static void showInfo(Student student) {
		System.out.println("\n\n\tInformation and subject of student");
		System.out.print("\nEnter student code: " + student.studentCode); 
		System.out.print("\nEnter name: " + student.lastName + " " + student.name);
		System.out.print("\nEnter date: " + student.dateOfBirth);
		showArraySubject(sub);
		
	}
	
	public static double totalPoints(Subject[] sub) {
		double total = 0;
		double totalCoefficient = 0;
		for (int i = 0; i < sub.length; i++) {
			total += sub[i].total();
			totalCoefficient += sub[i].subjectCoefficient;
		}
		return total / totalCoefficient;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student;
		student = inputInfo();
		showInfo(student);
		System.out.print("\nTotal average: " + totalPoints(sub));
		
	}

}
