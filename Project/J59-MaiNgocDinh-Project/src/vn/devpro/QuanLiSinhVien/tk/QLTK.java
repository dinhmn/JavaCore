package vn.devpro.QuanLiSinhVien.tk;

import java.util.Scanner;

import vn.devpro.QuanLiSinhVien.qlht.QLHT;
import vn.devpro.QuanLiSinhVien.qlmh.QLMH;
import vn.devpro.QuanLiSinhVien.qlsv.QLSV;

public class QLTK {
	static Scanner sc = new Scanner(System.in);
	
	public static void timKiem() {
			int chon = -1;
			do {
				System.out.println("\n=============HIEN THI BANG DIEM==============");
				System.out.println("\t1. Tim kiem theo ma sinh vien.");
				System.out.println("\t2. Tim kiem theo ma mon hoc.");
				System.out.println("\t0. Quay lai.");
				
				
				System.out.print("Lua chon cap nhat: ");
				
				try {
					chon = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				switch(chon) {
				case 1: timKiemTheoMaSinhVien(); break;			
				case 2: timKiemTheoMaMonHoc(); break;
				case 0: return;
				default: System.out.println("Error choice. Please select again!!!!!!!!!");
				}
			} while (true); 
		
		}

	private static void timKiemTheoMaSinhVien() {
		int index = -1;
		System.out.print("\tNhap ma sinh vien can tim kiem: ");
		int maSv = Integer.parseInt(sc.nextLine());
		System.out.println("---------------------------------------------------------------------");
		for (int i = 0; i < QLSV.list.size(); i++) {
			
			if (QLSV.list.get(i).getMaSinhVien() == maSv) {
				String name = QLSV.list.get(i).getFullName(QLSV.list.get(i).getHoDem(), QLSV.list.get(i).getTen());
				System.out.println("\t\t\tKET QUA TIM KIEM CUA SINH VIEN " + name);
				System.out.println("\tTen sinh vien: " + name);
				QLHT.hienThiDiemMotSinhVien(i);
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("\n\tKhong co sinh vien trong danh sach");
		}
		
	}

	private static void timKiemTheoMaMonHoc() {
		int index = -1;
		System.out.print("\tNhap ma mon can tim kiem: ");
		String maMh = sc.nextLine();

		
		System.out.println("---------------------------------------------------------------------");
		for (int i = 0; i < QLMH.list.size(); i++) {	
			
			if (QLMH.list.get(i).getMaMonHoc().trim().compareToIgnoreCase(maMh) == 0) {
				String name = QLMH.list.get(i).getTenMonHoc();
				System.out.println("\t\t\tKET QUA TIM KIEM CUA MON " + name);
				System.out.println("\tTen mon: " + QLMH.list.get(i).getTenMonHoc());
				QLHT.hienThiDiemMotMonHoc(i);
				index = i;
				break;
			}
		
		}
		if (index == -1) {
			System.out.println("\n\tKhong co mon hoc trong danh sach");
		}
	}
}
