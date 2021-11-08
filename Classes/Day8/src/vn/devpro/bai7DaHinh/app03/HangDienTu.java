package vn.devpro.bai7DaHinh.app03;

public class HangDienTu extends HangHoa {
	protected String hangSX;
	protected double congSuat;
	
	public void hienThi() {
		super.hienThi();
		System.out.printf("%-15s %9.2f ", hangSX, congSuat);
	}
	
	public HangDienTu() {
		super();
	}

	public HangDienTu(String maHang, String tenHang, double soLuong, double giaTien, String hangSX, double congSuat) {
		super(maHang, tenHang, soLuong, giaTien);
		this.hangSX = hangSX;
		this.congSuat = congSuat;
	}

	public String getHangSX() {
		return hangSX;
	}

	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}

	public double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}
	
	
	
}
