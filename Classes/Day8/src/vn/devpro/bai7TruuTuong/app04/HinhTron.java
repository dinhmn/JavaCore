package vn.devpro.bai7TruuTuong.app04;

public class HinhTron extends HinhPhang{
	
	private double r;

	public HinhTron(double r) {
		super();
		this.r = r;
	}
	
	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * r;
	}
	
	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(r, 2);
	}
}
