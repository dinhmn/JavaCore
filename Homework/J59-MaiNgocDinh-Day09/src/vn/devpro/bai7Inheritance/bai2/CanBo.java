package vn.devpro.bai7Inheritance.bai2;

public class CanBo extends NhanSu{

	private Phong phong;
	private String chucVu;
	private double heSoLuong;
	private String xepLoai;
		
	public void nhap() {
		super.nhap();
		phong = new Phong();
		phong.nhap();
		System.out.print("Nhap chuc vu: "); chucVu = QuanLiNhanSu.scanner.nextLine();
		System.out.print("Nhap he so luong: "); heSoLuong = Double.parseDouble(QuanLiNhanSu.scanner.nextLine());
		System.out.print("Nhap xep loai: "); xepLoai = QuanLiNhanSu.scanner.nextLine();
		
	}
	public void hienThi() {
		super.hienThi();
		phong.hienThi();
		System.out.printf("%7.2f %15s %12s %,15.2f %n", heSoLuong, chucVu, xepLoai, luong());
	}
	
	@Override
	public double luong() {
		double tong = 0;
		switch (xepLoai) {
		case "A":
			tong = heSoLuong * 1150000 + 1000000;
			break;
		case "B":
			tong = heSoLuong * 1150000;
			break;
		case "C":
			tong = heSoLuong * 1150000 - 400000;
			break;
		default:
			tong = heSoLuong * 1150000 - 1000000;
			break;
		}
		return tong;
	}
	public CanBo() {
		super();
	}
	
	public CanBo(Phong phong, String chucVu, double heSoLuong, String xepLoai) {
		super();
		this.phong = phong;
		this.chucVu = chucVu;
		this.heSoLuong = heSoLuong;
		this.xepLoai = xepLoai;
	}
	
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public String getXepLoai() {
		return xepLoai;
	}
	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}
	
	
	
}
