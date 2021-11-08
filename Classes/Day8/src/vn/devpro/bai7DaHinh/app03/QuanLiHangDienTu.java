package vn.devpro.bai7DaHinh.app03;

public class QuanLiHangDienTu {

	static HangHoa[] list = {
			new Tivi("TV001", "Tivi Sony", 11, 1300000, "Sony", 35.5, "Plasma", 48.5),
			new MayTinh("MT001", "May tinh Acer", 15, 1500000, "ACER", 12, 256, 8, 2.4),
			new MayTinh("MT002", "May tinh HP", 15, 1600000, "ACER", 12, 256, 8, 2.4),
			new Tivi("TV002", "Tivi Samsung", 17, 12500000, "Sam sung", 45.5, "Nhan hieu", 50),
			new MayTinh("MT003", "May tinh HP", 15, 1800000, "ACER", 15, 512, 16, 2.4),
			new Tivi("TV002", "Tivi LG", 17, 23500000, "LG", 65.5, "Nhan hieu", 75),
			new MayTinh("MT004", "May tinh Dell", 10, 1400000, "Dell", 15, 512, 16, 2.6)
	};
	
	public static void hienThiDs() {
		System.out.printf("%3s %-12s %-25s %-8s %-13s %-15s %9s %-20s %8s %n", "STT", "Ma hang", "Ten hang", "So luong", "Gia tien"
				, "Hang SX", "Cong suat", "Nhan hieu/ HDD - RAM", "MH / CPU");
		int stt = 1;
		for(HangHoa h : list) {
			System.out.printf("%3d", stt++);
			h.hienThi();
		}
	}
	
	public static void hienThiDsTv() {
		System.out.println("\t\t\tDANH SACH TIVI");
		System.out.printf("%3s %-12s %-25s %-8s %-13s %-15s %9s %-20s %8s %n", "STT", "Ma hang", "Ten hang", "So luong", "Gia tien"
				, "Hang SX", "Cong suat", "Nhan hieu/ HDD - RAM", "MH / CPU");
		int stt = 1;
		for(HangHoa h : list) {
			if (h instanceof Tivi) {
				System.out.printf("%3d", stt++);
				h.hienThi();
			}

		}
	}
	public static void hienThiDsMayTinh() {
		System.out.println("\t\t\tDANH SACH MayTinh");
		System.out.printf("%3s %-12s %-25s %-8s %-13s %-15s %9s %-20s %8s %n", "STT", "Ma hang", "Ten hang", "So luong", "Gia tien"
				, "Hang SX", "Cong suat", "Nhan hieu/ HDD - RAM", "MH / CPU");
		int stt = 1;
		for(HangHoa h : list) {
			if (h instanceof MayTinh) {
				System.out.printf("%3d", stt++);
				h.hienThi();
			}

		}
	}
	public static void main(String[] args) {
		System.out.println("Danh sach hang dien tu");
		hienThiDs();
		hienThiDsTv();
		hienThiDsMayTinh();
	}

}
