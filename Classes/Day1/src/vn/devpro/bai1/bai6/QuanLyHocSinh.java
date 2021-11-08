package vn.devpro.bai1.bai6;

public class QuanLyHocSinh {
	public static void main(String[] args) {
		// Khai bao 3 doi tuong hoc sinh
		
		HocSinh hs1 = new HocSinh();
		HocSinh hs2 = new HocSinh();
		HocSinh hs3 = new HocSinh();
		
		// Nhap du lieu lan luot cho 3 hoc sinh
		
		System.out.println("Nhap cac thong tin cua hoc sinh thu 1");
		hs1.nhap();
//		System.out.println("Nhap cac thong tin cua hoc sinh thu 2");
//		hs2.nhap();
//		System.out.println("Nhap cac thong tin cua hoc sinh thu 3");
//		hs3.nhap();
		
		// Hien thi danh sach
		System.out.printf("%3s %-23s %-10s %-9s %7s %-10s %n", "STT", "	Ho va ten", " Ngay sinh",
				"Gioi tinh", "Diem TB", "  XLDD");
		int stt = 1;
		System.out.printf("%-3d ", stt++);
		hs1.hienThi();
//		System.out.printf("%-3d ", stt++);
//		hs2.hienThi();
//		System.out.printf("%-3d ", stt++);
//		hs3.hienThi();
	}
}
