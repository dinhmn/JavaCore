package vn.devpro.bai7DaHinh.app03;

public class Tivi extends HangDienTu{

	private String nhanHieu;
	private double manHinh;
	
	public void hienThi() {
		super.hienThi();
		System.out.printf("%-20s %8.1f%n", nhanHieu, manHinh);
	}

	public Tivi() {
		super();
	}

	public Tivi(String mHang, String tenHang, double soLuong, double giaTien, String hangSX, double congSuat,
			String nhanHieu, double manHinh) {
		super(mHang, tenHang, soLuong, giaTien, hangSX, congSuat);
		this.nhanHieu = nhanHieu;
		this.manHinh = manHinh;
	}
	
	
}
