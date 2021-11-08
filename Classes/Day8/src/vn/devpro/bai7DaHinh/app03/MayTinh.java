package vn.devpro.bai7DaHinh.app03;

public class MayTinh extends HangDienTu{

	private double hdd;
	private double ram;
	private double cpu;
	
	
	public void hienThi() {
		super.hienThi();
		System.out.printf("%-10.2f %9.2f %8.2f%n", hdd, ram, cpu);
	}
	
	public MayTinh() {
		super();
	}
	
	public MayTinh(String mHang, String tenHang, double soLuong, double giaTien, String hangSX, double congSuat,
			double hdd, double ram, double cpu) {
		super(mHang, tenHang, soLuong, giaTien, hangSX, congSuat);
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
	}
	public double getHdd() {
		return hdd;
	}
	public void setHdd(double hdd) {
		this.hdd = hdd;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	
	
	
	
}
