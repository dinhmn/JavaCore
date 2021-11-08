package vn.devpro.bai7keThua.app01;

import java.util.Scanner;

public class Diem {

	private double x;
	private double y;
	
	Scanner scanner = new Scanner(System.in);
	
	public void nhapDiem() {
		System.out.print("Nhap hoanh do: ");
		x = Double.parseDouble(scanner.nextLine());
		System.out.print("Nhap tung do: ");
		y = Double.parseDouble(scanner.nextLine());
	}
	
	public double khoangCach(Diem B) {
		return Math.sqrt((B.x - this.x) * (B.x - this.x) + (B.y - this.y) * (B.y - this.y));
	}
	
	public Diem() {
		super();
	}

	public Diem(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	
}
