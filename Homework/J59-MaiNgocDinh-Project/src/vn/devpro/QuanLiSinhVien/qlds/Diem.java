package vn.devpro.QuanLiSinhVien.qlds;

public class Diem {

	private int maSinhVien;
	private String maMonHoc;
	private double diem;
	
	public void display() {
		System.out.printf("%8d %8s %4.2f %n", maSinhVien, maMonHoc, diem);
	}
	
	public Diem() {
		super();
	}
	public Diem(int maSinhVien, String maMonHoc, double diem) {
		super();
		this.maSinhVien = maSinhVien;
		this.maMonHoc = maMonHoc;
		this.diem = diem;
	}
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getMaMonHoc() {
		return maMonHoc;
	}
	public void setMaMonHoc(String maMonHoc) {
		this.maMonHoc = maMonHoc;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	
	
	
}
