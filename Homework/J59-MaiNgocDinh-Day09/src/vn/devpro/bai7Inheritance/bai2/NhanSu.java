package vn.devpro.bai7Inheritance.bai2;

public abstract class NhanSu {

	protected int maNs;
	protected String hoDem;
	protected String ten;
	protected int namSinh;
	protected String gioiTinh;
	
	
	
	
	public void nhap() {
		System.out.print("Nhap ma nhan su: "); maNs = Integer.parseInt(QuanLiNhanSu.scanner.nextLine());
		System.out.print("Nhap ho dem: "); hoDem = QuanLiNhanSu.scanner.nextLine();
		System.out.print("Nhap ten: "); ten = QuanLiNhanSu.scanner.nextLine();
		System.out.print("Nhap nam sinh: "); namSinh = Integer.parseInt(QuanLiNhanSu.scanner.nextLine());
		System.out.print("Nhap gioi tinh: "); gioiTinh = QuanLiNhanSu.scanner.nextLine();
	}
	public void hienThi() {
		System.out.printf("%8d %23s %8d %9s", maNs, hoDem + " " + ten, namSinh, gioiTinh);
	}
	public abstract double luong();
	
	public NhanSu() {
		super();
	}
	
	public NhanSu(int maNs, String hoDem, String ten, int namSinh, String gioiTinh) {
		super();
		this.maNs = maNs;
		this.hoDem = hoDem;
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}
	
	public int getMaNs() {
		return maNs;
	}
	public void setMaNs(int maNs) {
		this.maNs = maNs;
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
	
	
}
