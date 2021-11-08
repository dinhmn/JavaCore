package vn.devpro.QuanLiBanHang.tk;

import java.util.ArrayList;
import java.util.Scanner;

import vn.devpro.QuanLiBanHang.qlhh.HangHoa;
import vn.devpro.QuanLiBanHang.qlhh.QLHH;
import vn.devpro.QuanLiBanHang.qlkh.KhachHang;
import vn.devpro.QuanLiBanHang.qlkh.QLKH;
import vn.devpro.QuanLiBanHang.qllh.LoaiHang;
import vn.devpro.QuanLiBanHang.qllh.QLLH;

public class QLTK {

	static Scanner sc = new Scanner(System.in);
	
	public static void quanLyTimKiem() {
		int chon;
		do {
			System.out.println("\n---------TIM KIEM THONG TIN-------------");
			System.out.println("Chon chuc nang tim kiem");
			System.out.println("\t1. Tim kiem thong tin loai hang");
			System.out.println("\t2. Tim kiem thong tin hang hoa");
			System.out.println("\t3. Tim kiem thong tin khach hang");
			System.out.println("\t4. Tim kiem thong tin gio hang");
			System.out.println("\t0. Quay lai");
			System.out.println("Lua chon chuc nang: ");
			chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: tkLoaiHang(); break;
			case 2: tkHangHoa(); break;
			case 3: tkKhachHang(); break;
			case 4: tkGioHang(); break;
			case 0: return;
			default: System.out.println("Chon lai chuc nang");
			}
			
			
		} while (true);
		
	}

	private static void tkLoaiHang() {
		int chon;
		do {
			System.out.println("\n-------------TIM KIEM LOAI HANG----------");
			System.out.println("\tCac tieu chi tim");
			System.out.println("\t1. Tim theo ma loai hang");
			System.out.println("\t2. Tim theo ten loai hang");
			System.out.println("\t0. Quay lai");
			System.out.println("\tLua chon tieu chi");
			
			chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: tkTheoIdLoaiHang(); break;
			case 2: tkTheoTenLoaiHang(); break;
			case 0: return;
			default:
				System.out.println("Chon lai tieu chi");
			}
			
		} while (true);
		
	}

	private static void tkTheoIdLoaiHang() {
		System.out.println("\n-------------TIM KIEM THEO ID LOAI HANG-------------");
		System.out.print("Nhap ma loai hang can tim: ");
		int idkh = Integer.parseInt(sc.nextLine());
		int stt = 1;
		System.out.printf("%3s %%-10s %-25s %n", "STT", "ID", "Name");
		for (LoaiHang h : QLLH.list) {
			if (h.getId() == idkh) {
				stt++;
				System.out.printf("%-3d ",stt);
				h.display();
			}
		}
		if (stt == 1) {
			System.out.println("Khong ton tai khach hang can tim");
		}
		
	}

	private static void tkHangHoa() {
		int chon;
		do {
			System.out.println("\n--------TIM KIEM THONG TIN HANG HOA-----------");
			System.out.println("\tCac tieu chi tim kiem");
			System.out.println("\t1. Tim kiem theo ma hang");
			System.out.println("\t2. Tim kiem theo ten hang");
			System.out.println("\t3. Tim kiem theo ten loai hang");
			System.out.println("\t4. Tim kiem theo khung gia");
			System.out.println("\t0. Quay lai");
			System.out.print("Lua chon tieu chi: ");
			chon = Integer.parseInt(sc.nextLine());
			
			switch (chon) {
			case 1:tkTheoMaHang(); break;
			case 2: tkTheoTenHang(); break;
			case 3: tkTheoTenLoaiHang(); break;
			case 4: tkTheoKhungGia(); break;
			case 0: return;
			default: System.out.println("Lua chon khong hop le.");
				break;
			}
			
		} while (true);
		
	}

	private static void tkTheoMaHang() {
		System.out.println("\n-----------TIM KIEM THEO MA HANG------------");
		System.out.print("\tNhap ma hang (id) can tim: ");
		int id = Integer.parseInt(sc.nextLine());
		int index = QLHH.indexOf(id);
		if (index == -1) {
			System.out.println("\nKhong tim thay ket qua nao");
			return;
		}
		System.out.println("\tThong tin hang hoa tim duoc");
		QLHH.list.get(index).display();
		
	}

	private static void tkTheoTenHang() {
		System.out.println("\n------------TIM KIEM THEO TEN HANG HOA--------------");
		System.out.println("\tNhap ten hang hoa can tim: ");
		String name = sc.nextLine();
		int dem = 0;
		for (HangHoa h : QLHH.list) {
			if (h.getName().trim().indexOf(name.trim()) != -1) {
				dem++;
				System.out.printf("%-3s ", dem);
				h.display();
			}
		}
		if ( dem == 0 ) {
			System.out.println("\tKhong tim thay ket qua nao");
		} else {
			System.out.println("\tTim thay " + dem + " ket qua");
		}

	}

	private static void tkTheoTenLoaiHang() {
		ArrayList<Integer> listIdlh = new ArrayList<>();
		System.out.println("\n----------TIM KIEM THEO TEN LOAI HANG---------");
		System.out.print("\tNhap ten loai hang can tim: ");
		String name = sc.nextLine();
		
		for(LoaiHang lh : QLLH.list) {
			if (lh.getName().trim().indexOf(name.trim()) != -1) {
				listIdlh.add(lh.getId());
			}
		}
		if (listIdlh.size() == 0) {
			System.out.println("\tKhong tim thay ket qua nao");
			return;
		}
		System.out.println("\tTim thay " + listIdlh.size() + " ket qua");
		for(HangHoa h : QLHH.list) {
			boolean checked = false;
			if (listIdlh.indexOf(h.getIdlh()) != -1) {
				h.display();
			}
		}
		
	}

	private static void tkTheoKhungGia() {
		System.out.println("\n----------TIM KIEM THEO KHUNG GIA-----------");
		System.out.println("\tNhap gia dau: ");
		double firstPrice = Double.parseDouble(sc.nextLine());
		System.out.print("\tNhap gia cuoi: ");
		double lastPrice = Double.parseDouble(sc.nextLine());
		int dem = 0;
		for (HangHoa h : QLHH.list) {
			if (h.getPrice() >= firstPrice && h.getPrice() <= lastPrice) {
				dem++;
				System.out.printf("%-3s ", dem);
				h.display();
			}
		}
		if ( dem == 0 ) {
			System.out.println("\tKhong tim thay ket qua nao");
		} else {
			System.out.println("\tTim thay " + dem + " ket qua");
		}
		
	}

	private static void tkKhachHang() {
		int chon;
		do {
			System.out.println("\n-------------TIM KIEM KHACH HANG----------");
			System.out.println("\tCac tieu chi tim");
			System.out.println("\t1. Tim theo ma khach hang");
			System.out.println("\t2. Tim theo ten khach");
			System.out.println("\t0. Quay lai");
			System.out.println("\tLua chon tieu chi");
			
			chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: tkTheoId(); break;
			case 2: tkTheoTenKhachHang(); break;
			case 0: return;
			default:
				System.out.println("Chon lai tieu chi");
			}
			
		} while (true);

		
	}

	private static void tkTheoId() {
		System.out.println("\n-----------------TIM KIEM THEO ID---------------");
		System.out.print("Nhap ma khach hang can tim: ");
		int idkh = Integer.parseInt(sc.nextLine());
		int stt = 1;
		for (KhachHang h : QLKH.list) {
			if (h.getId() == idkh) {
				stt++;
				System.out.printf("%-3d ",stt);
				h.display();
			}
		}
		if (stt == 1) {
			System.out.println("Khong ton tai khach hang can tim");
		}
		
	}

	private static void tkTheoTenKhachHang() {
		System.out.println("\n--------------TIM KIEM THEO TEN---------------");
		System.out.println("Nhap ten khach hang can tim: ");
		String name = sc.nextLine();
		int dem = 0;
		for (KhachHang h : QLKH.list) {
			if (h.getName().trim().indexOf(name.trim()) != -1) {
				dem++;
				System.out.printf("%-3d ", dem);
				h.display();
			}
		}
		if ( dem == 0 ) {
			System.out.println("\tKhong tim thay ket qua nao");
		} else {
			System.out.println("\tTim thay " + dem + " ket qua");
		}
		
	}

	private static void tkGioHang() {
		
		
	}
	
}
