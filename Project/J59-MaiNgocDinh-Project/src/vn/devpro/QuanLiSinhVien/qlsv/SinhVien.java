package vn.devpro.QuanLiSinhVien.qlsv;

public class SinhVien {

	private int maSinhVien;
	private String hoDem;
	private String ten;
	private int namSinh;
	private String gioiTinh;
	
	public void display() {
		System.out.printf("%8d %23s %8d %9s %n", maSinhVien, getFullName(this.hoDem, this.ten), namSinh, gioiTinh);
	}
	
	public SinhVien() {
		super();
	}
	public SinhVien(int maSinhVien, String hoDem, String ten, int namSinh, String gioiTinh) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoDem = hoDem;
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoDem() {
		return hoDem;
	}
	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getFullName(String hoDem, String ten) {
		return hoDem + " " + ten;
	}
	
}
