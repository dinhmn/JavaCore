package vn.devpro.bai1TongQuan.bai5;

import java.util.Scanner;

public class HinhHopChuNhat {
	private double a, b, h;
	public void inputValuesOfRectangularBoxShape() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input values of the rectangular box shape is");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		h = scanner.nextDouble();
	}
	public double surroundingArea() {
		return 2 * h * (a + b);
	}
	public double totalArea() {
		return surroundingArea() + 2 * a * b;
	}
	
	public void showValuesOfRectangularBoxShape() {
		System.out.printf("\nThe surrounding area value of the rectangular box shape is: %.2f", surroundingArea());
		System.out.printf("\nThe total area value of the rectangular box shape is: %.2f", totalArea());
	}
}
