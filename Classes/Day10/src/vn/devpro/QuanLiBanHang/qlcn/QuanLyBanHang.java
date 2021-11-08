package vn.devpro.QuanLiBanHang.qlcn;

import java.util.Scanner;

import vn.devpro.QuanLiBanHang.qlbh.QLGH;
import vn.devpro.QuanLiBanHang.qlhh.QLHH;
import vn.devpro.QuanLiBanHang.qlkh.QLKH;
import vn.devpro.QuanLiBanHang.qllh.QLLH;
import vn.devpro.QuanLiBanHang.tk.QLTK;

public class QuanLyBanHang {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		do {
			System.out.println("\n=====================CHUONG TRINH QUAN LY BAN HANG=====================");
			System.out.println("Chon mot chuc nang quan ly");
			System.out.println("\t1. Cap nhat thong tin he thong");
			System.out.println("\t2. Quan ly ban hang");
			System.out.println("\t3. Tim kiem thong tin");
			System.out.println("\t0. Thoat");
			
			System.out.print("Nhap lua chon cua ban: ");
			int chon;
			
			chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				capNhatThongTinHeThong();
				break;
			case 2: quanLyBanHang(); break;
			case 3: timKiemThongTin(); break;
			case 0: System.out.println("Da thoat khoi chuong trinh");
					System.exit(0);
			default:
				System.out.println("Chon chuc nang khong hop le");
			}
		} while (true);

	}

	private static void capNhatThongTinHeThong() {
		int chon = -1;
		

		do {
			System.out.println("\n===============CHUC NANG CAP NHAT===================");			
			System.out.println("Chon mot chuc nang cap nhat");
			System.out.println("\t1. Cap nhat thong tin loai hang");
			System.out.println("\t2. Cap nhat thong tin hang hoa");
			System.out.println("\t3. Cap nhat thong tin khach hang");
			System.out.println("\t0. Quay lai");
		
			
			try {
				System.out.println("Lua chon chuc nang muon cap nhat: ");
				chon = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			
			
			switch(chon) {
			case 1: QLLH.capNhat(); break;
			case 2: QLHH.capNhat(); break;
			case 3: QLKH.capNhat(); break;
			case 0: return;
			default: System.out.println("Lua chon chuc nang cap nhat khong hop le");
			}
			
		} while (true);
		
	}

	private static void quanLyBanHang() {
		// TODO Auto-generated method stub
		System.out.println("\n----------------QUAN LY BAN HANG-----------------");
		System.out.println("Chon chuc nang phu hop");
		System.out.println("\t1. Danh cho khach mua hang");
		System.out.println("\t2. Danh cho nguoi quan ly cua hang");
		System.out.println("\t0. Quay lai");
		System.out.print("Lua chon cua ban: ");
		int chon = Integer.parseInt(sc.nextLine());
		switch (chon) {
		case 1:QLGH.quanLyKhachMuaHang(); break;
		case 2:QLGH.thongKeBanHang(); break;
		case 0: return;
		}
	}

	private static void timKiemThongTin() {
		// TODO Auto-generated method stub
		QLTK.quanLyTimKiem();
	}
}
