package vn.devpro.bai1TongQuan.bai2;

import java.util.Scanner;

public class HinhTron {
	
	private double r;
	
	public void inputValueOfCircle() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input value of the circular radius: ");
		r = scanner.nextDouble();
		
	}
	public double area() {
		return Math.PI * Math.pow(r, 2);
	}

	public double circumference() {
		return 2 * Math.PI * r;
	}
	
	public void showValuesOfCircle() {
		System.out.printf("\nThe area of the circle is: %.2f", area());
		System.out.printf("\nThe circumference of the circle is: %.2f", circumference());
	}
}
