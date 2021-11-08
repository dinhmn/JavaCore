package vn.devpro.bai7Inheritance.bai2;

public class XuongSX {

	private String tenXuong;
	private String quanDoc;
	private int soCongNhan;
	
	
	public void nhap() {
		System.out.print("Nhap ten xuong: "); tenXuong = QuanLiNhanSu.scanner.nextLine();
		System.out.print("Nhap quan doc: "); quanDoc = QuanLiNhanSu.scanner.nextLine();
		System.out.print("Nhap so luong cong nhan: "); soCongNhan = Integer.parseInt(QuanLiNhanSu.scanner.nextLine());
		
	}
	public void hienThi() {
		System.out.printf("%15s %20s %7d ", tenXuong, quanDoc, soCongNhan);
	}
	
	public XuongSX() {
		super();
	}

	public XuongSX(String tenXuong, String quanDoc, int soCongNhan) {
		super();
		this.tenXuong = tenXuong;
		this.quanDoc = quanDoc;
		this.soCongNhan = soCongNhan;
	}

	public String getTenXuong() {
		return tenXuong;
	}

	public void setTenXuong(String tenXuong) {
		this.tenXuong = tenXuong;
	}

	public String getQuanDoc() {
		return quanDoc;
	}

	public void setQuanDoc(String quanDoc) {
		this.quanDoc = quanDoc;
	}

	public int getSoCongNhan() {
		return soCongNhan;
	}

	public void setSoCongNhan(int soCongNhan) {
		this.soCongNhan = soCongNhan;
	}
	
	
	
}
