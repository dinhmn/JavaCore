package vn.devpro.bai7daKeThuainterface.app6;

import java.util.Scanner;

public class Circle implements IO, Shape{

	private double r;
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.print("Nhap ban kinh hinh tron: ");
		r = (new Scanner(System.in).nextDouble());
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.printf("%nChu vi hinh tron: %.5f", perimater());
		
		System.out.printf("%nDien tich hinh tron: %.5f", erea());
	}
	
	@Override
	public double erea() {
		// TODO Auto-generated method stub
		return pi * r * r;
	}

	public double perimater() {
		// TODO Auto-generated constructor stub
		return 2 * pi * r;
	}
	
}
