package vn.devpro.bai7keThua.app02;


public class QuanLiHangDienTu {
	
	public static void nhapDs(HangDienTu[] ds) {
		System.out.println("Nhap danh sach cac mat hang dien tu");
		for (int i = 0; i < ds.length ; i++) {
			System.out.println("Nhap hang dien tu thu " + (i + 1));
			ds[i] = new HangDienTu();
			ds[i].nhap();
		}
	}

	public static void tieuDe() {
		System.out.printf("%3s %-12s %-25s %-10s %-9s %-13s %n", "STT", "Ma hang",
				"Ten hang", "Ngay SX","Cong suat", "Gia tien");
		
	}
	
	public static void hienThi(HangDienTu[] ds) {
		System.out.println("\t\tDANH SACH CAC MAT HANG DIEN TU");
		tieuDe();
		int stt = 1;
		for (HangDienTu h : ds) {
			System.out.printf("%3d", stt++);
			h.hienThi();
		}
	}
	
	public static void hienThiDsHdtGtThapNhat(HangDienTu[] ds) {
		System.out.println("\t\tDANH SACH CAC MAT HANG DIEN TU GIA TIEN THAP NHAT");
		// Tim gia tien thap nhat
		double min = ds[0].getGiaTien();
		
		for (HangDienTu h : ds) {
			if (h.getGiaTien() < min) {
				min = h.getGiaTien();
			}
		}
		// Duyet lai danh sach de hien thi thong tin yeu cau
		tieuDe();
		int stt = 1;
		for (HangDienTu h : ds) {
			if (h.getGiaTien() == min) {
				System.out.printf("%3d", stt++);
				h.hienThi();
			}
			
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Nhap so luong mat hang dien tu: ");
		HangDienTu[] ds = new HangDienTu[Integer.parseInt(SanPham.sc.nextLine())];
		nhapDs(ds);
		hienThi(ds);
		hienThiDsHdtGtThapNhat(ds);
	}

}
