package vn.devpro.QuanLiBanHang.qlbh;

import java.util.ArrayList;
import java.util.Scanner;

import vn.devpro.QuanLiBanHang.qlkh.KhachHang;
import vn.devpro.QuanLiBanHang.qlkh.QLKH;

public class QLGH {
	public static ArrayList<GioHang> list = new ArrayList<>();
	
	static int autoId = 1;
	static Scanner sc = new Scanner(System.in);
	
	
	public static void quanLyKhachMuaHang() {
		// Khoi tao mot gio hang
		GioHang gio = new GioHang();
		int chon;
		System.out.println("\n---------Chao mung ban, moi ban mua hang---------");
		do {
			System.out.println("Chon chuc nang mua hang");
			System.out.println("\t1. Them hang vao gio");
			System.out.println("\t2. Xem thong tin gio hang");
			System.out.println("\t3. Sua thong tin hang trong gio");
			System.out.println("\t4. Xoa hang trong gio");
			System.out.println("\t5. Thanh toan gio hang");
			System.out.println("\t0. Huy gio hang");
			
			System.out.print("Moi chon chuc nag mua hang: ");
			chon = Integer.parseInt(sc.nextLine());
			
			switch (chon) {
			case 1: gio.themHangVaoGio(); break;
			case 2: gio.hienThiGioHang(); break;
			case 3: gio.suaHangTrongGio(); break;
			case 4: gio.xoaHangTrongGio(); break;
			case 5: thanhToanGioHang(gio); break;
			case 0: gio = null; return;
			default:
				System.out.println("Chon lai chuc nang");
			}
			
		} while (true);
		
	}
//	Thanh toan gio hang
	public static void thanhToanGioHang(GioHang gio) {
		System.out.println("\n---------------THANH TOAN GIO HANG-----------------");
		gio.setId(autoId++);
		System.out.println("\tLua chon loai khach hang");
		System.out.println("\t1. Khach da mua hang (co thong tin KH trong DS khach hang)");
		System.out.println("\t2. Khach hang moi");
		int chon;
		do {
			System.out.print("Moi chon(1 or 2, lua chon sai tru 500k): ");
			chon = Integer.parseInt(sc.nextLine());
		} while (chon != 1 && chon != 2);
		
		if (chon == 2) { // Khach hang moi
			gio.setIdkh(QLKH.autoId);
			String name;
			do {
				System.out.print("Nhap ten khach hang: ");
				name = sc.nextLine();
				if (name.trim().length() == 0) {
					System.out.println("\tTen khach hang khong duoc de trong");
				}
			} while (name.trim().length() == 0);
			//Them khach moi vao danh sach khach hang
			QLKH.list.add(new KhachHang(QLKH.autoId++, name));
		} else {
			System.out.println("\tNhap id khach hang: ");
			int idkh = Integer.parseInt(sc.nextLine());
			int index1 = QLKH.indexOf(idkh);
			if (index1 == -1) {
				System.out.println("\tKhach hang chua co trong danh sach khach hang");
				// Tao moi khach hang
				
				gio.setIdkh(QLKH.autoId);
				String name;
				do {
					System.out.print("Nhap ten khach hang: ");
					name = sc.nextLine();
					if (name.trim().length() == 0) {
						System.out.println("\tTen khach hang khong duoc de trong");
					}
				} while (name.trim().length() == 0);
				//Them khach moi vao danh sach khach hang
				QLKH.list.add(new KhachHang(QLKH.autoId++, name));
			} else {
				gio.setIdkh(idkh);
			}
		}
		//Hien thi hoa don
		gio.hienThiHoaDon();
		//them gio hang vao danh sach quan ly
		list.add(gio);
		System.out.println("\tCam on ban da den voi cua hang, chao than ai!");
		return;
	}
	
	//Các chức năng dành cho người quản lý
	/*
	 * - Thống kê các giỏ hàng
	 * - Tính tông doanh thu
	 * */
	public static void thongKeBanHang() {
		int chon;
		do {
			System.out.println("\n-------------THONG KE BAN HANG-------------");
			System.out.println("Chon 1 chuc nang thong ke");
			System.out.println("\t1. Thong ke danh sach gio hang");
			System.out.println("\t2. Tinh tong doanh thu");
			System.out.println("\t0. Quay lai");
			System.out.println("Lua chon chuc nang: ");
			chon  = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: thongKeGioHang(); break;
			case 2: tongDoanhThu(); break;
			case 0: return;
			default:
				System.out.println("Chon lai chuc nang");	
			}
		} while (true);
		
	}
	private static void thongKeGioHang() {
		System.out.println("\n--------------DANH SACH CAC GIO HANG--------------");
		for (GioHang gio : list) {
			gio.hienThiHoaDon();
			System.out.println("-------------------------------");
		}
	}
	private static void tongDoanhThu() {
		double totalRevenue = 0;
		for( GioHang gio : list) {
			//Tinh tong tien cua gio hang
			double sumTotal = 0;
			for (HangBan h : gio.getList()) {
				sumTotal += h.total();
			}
			totalRevenue += sumTotal;
		}
		System.out.println("\tTong cong co " + list.size() + " gio hang");
		System.out.printf("\tTong doanh thu la %.2fvnd ", totalRevenue);
	}
	
}
