package vn.devpro.bai7Inheritance.bai2;

public class Phong {

	private String tenPhong;
	private String truongPhong;
	
	
	public void nhap() {
		System.out.print("Nhap ten phong: "); tenPhong = QuanLiNhanSu.scanner.nextLine();
		System.out.print("Nhap truong phong: "); truongPhong = QuanLiNhanSu.scanner.nextLine();
	}
	
	public void hienThi() {
		System.out.printf("%15s %20s ", tenPhong, truongPhong);
	}
	
	
	public Phong() {
		super();
	}

	public Phong(String tenPhong, String truongPhong) {
		super();
		this.tenPhong = tenPhong;
		this.truongPhong = truongPhong;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public String getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(String truongPhong) {
		this.truongPhong = truongPhong;
	}
	
	
	
}
