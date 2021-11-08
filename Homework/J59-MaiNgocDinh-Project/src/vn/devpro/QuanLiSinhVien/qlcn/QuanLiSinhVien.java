package vn.devpro.QuanLiSinhVien.qlcn;


import java.io.IOException;
import java.util.Scanner;

import vn.devpro.QuanLiSinhVien.qlds.QLDIEM;
import vn.devpro.QuanLiSinhVien.qlht.QLHT;
import vn.devpro.QuanLiSinhVien.qlmh.QLMH;
import vn.devpro.QuanLiSinhVien.qlsv.QLSV;
import vn.devpro.QuanLiSinhVien.tk.QLTK;

public class QuanLiSinhVien {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choose = -1;
		do {
			System.out.println("=========CHUONG TRINH QUAN LY SINH VIEN==========");
			System.out.println("\t1. Cap nhat danh sach");
			System.out.println("\t2. Hien thi");
			System.out.println("\t3. Tim kiem");
			System.out.println("\t0. Thoat");
			System.out.print("Moi ban chon chuc nang: ");
			try {
				choose = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			switch (choose) {
			case 1:
				capNhatDanhSach();
				break;
			case 2:
				hienThi();
				break;
			case 3:
				timKiem();
				break;
			case 0:
				System.out.println("Exited the program.");
				System.exit(0);
			default:
				System.out.println("Error choice. Please select again!!!!!!!!!");
			}
			
		} while (true);

	}

	private static void capNhatDanhSach() {
		int choose;
		do {
			System.out.println("================CAP NHAT DANH SACH=============");
			System.out.println("\t1. Cap nhat danh sach sinh vien");
			System.out.println("\t2. Cap nhat danh sach mon hoc");
			System.out.println("\t3. Cap nhat bang diem");
			System.out.println("\t0. Quay lai");
			System.out.print("Moi ban chon chuc nang: ");
			choose = Integer.parseInt(sc.nextLine());
			
			switch (choose) {
			case 1:
				QLSV.capNhat();
				break;
			case 2:
				QLMH.capNhat();
				break;
			case 3:
				QLDIEM.capNhat();
				break;
			case 0:
				return;
			default:
				System.out.println("Error choice. Please select again!!!!!!!!!");
			}
			
		} while (true);
		
	}

	private static void hienThi() {
		QLHT.hienThi();	
	}

	private static void timKiem() {
		QLTK.timKiem();
		
	}

}
