package vn.devpro.QuanLiSinhVien.qlmh;

public class MonHoc {

	private String maMonHoc;
	private String tenMonHoc;
	private double hsMonHoc;
	
	public void display() {
		System.out.printf("%8s %30s %10.1f %n", maMonHoc, tenMonHoc, hsMonHoc);
	}
	
	public MonHoc() {
		super();
	}
	public MonHoc(String maMonHoc, String tenMonHoc, double hsMonHoc) {
		super();
		this.maMonHoc = maMonHoc;
		this.tenMonHoc = tenMonHoc;
		this.hsMonHoc = hsMonHoc;
	}
	public String getMaMonHoc() {
		return maMonHoc;
	}
	public void setMaMonHoc(String maMonHoc) {
		this.maMonHoc = maMonHoc;
	}
	public String getTenMonHoc() {
		return tenMonHoc;
	}
	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}
	public double getHsMonHoc() {
		return hsMonHoc;
	}
	public void setHsMonHoc(double heSo) {
		this.hsMonHoc = heSo;
	}

	
	
}
