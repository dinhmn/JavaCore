package vn.devpro.bai8.arayListExam;

public class HocVien {

	private int ma;
	private String hoDem;
	private String ten;
	private String ngaySinh;
	private String gioiTinh;
	private String khoaHoc;
	
	public void hienThi() {
		System.out.printf("%10d %-25s %10s %-9s %-30s %n", ma, hoDem + " " + ten, ngaySinh, gioiTinh, khoaHoc);
	}
	
	public HocVien() {
		super();
	}
	public HocVien(int ma, String hoDem, String ten, String ngaySinh, String gioiTinh, String khoaHoc) {
		super();
		this.ma = ma;
		this.hoDem = hoDem;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.khoaHoc = khoaHoc;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
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
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getKhoaHoc() {
		return khoaHoc;
	}
	public void setKhoaHoc(String khoaHoc) {
		this.khoaHoc = khoaHoc;
	}
	
	
	
}
