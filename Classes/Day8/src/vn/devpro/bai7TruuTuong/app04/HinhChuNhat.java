package vn.devpro.bai7TruuTuong.app04;

public class HinhChuNhat extends HinhPhang {
	private double a;
	private double b;
	
	
	public HinhChuNhat(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return (a + b) * 2;
	}
	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return  a * b;
	}
}
