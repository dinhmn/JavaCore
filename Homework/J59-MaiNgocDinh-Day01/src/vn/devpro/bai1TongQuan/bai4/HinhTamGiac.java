package vn.devpro.bai1TongQuan.bai4;

import java.util.Scanner;

public class HinhTamGiac {

	private double a, b, c;
	
	public void inputValuesOfTriangle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input values of the triangular shape is");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
	}
	public double area() {
		double p = (a+b+c) /2;
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
	}
	public double circumference() {
		return a + b + c;
	}
	
	public void showValuesOfTriangle() {
		System.out.printf("\nThe area value of the triangular shape is: %.2f", area());
		System.out.printf("\nThe circumference value of the triangular shape is: %.2f", circumference());
	}
}
