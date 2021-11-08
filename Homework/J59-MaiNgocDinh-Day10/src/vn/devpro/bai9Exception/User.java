package vn.devpro.bai9Exception;

public class User {

	String ma;
	String taiKhoan;
	String matKhau;
	String hoTen;
	int ngay, thang, namSinh;
	double soDienThoai;
	public User(String ma, String taiKhoan, String matKhau, String hoTen, int ngay, int thang, int namSinh,
			double soDienThoai) {
		super();
		this.ma = ma;
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
		this.hoTen = hoTen;
		this.ngay = ngay;
		this.thang = thang;
		this.namSinh = namSinh;
		this.soDienThoai = soDienThoai;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public double getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(double soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	
	
	
}
