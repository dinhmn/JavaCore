package vn.devpro.bai7DaHinh.app03;

public class HangHoa {

	protected String maHang;
	protected String tenHang;
	protected double soLuong;
	protected double giaTien;
	
	public void hienThi() {
		System.out.printf(" %-12s %-25s %-8.2f %13.2f ", maHang, tenHang, soLuong, giaTien);
	}
	
	
	public HangHoa() {
		super();
	}
	public HangHoa(String maHang, String tenHang, double soLuong, double giaTien) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.giaTien = giaTien;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String mHang) {
		this.maHang = mHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public double getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}
	public double getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}
	
	
	
}
