package vn.devpro.QuanLiSinhVien.qlmh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import vn.devpro.QuanLiSinhVien.qlds.QLDIEM;
import vn.devpro.QuanLiSinhVien.qlsv.SinhVien;

public class QLMH {

	public static ArrayList<MonHoc> list = new ArrayList<>();
	
	
	static Scanner sc = new Scanner(System.in);

	public static void capNhat() {
		int chon = -1;
		
		do {
			System.out.println("\n=============CAP NHAT THONG TIN SINH VIEN==============");
			System.out.println("\t1. Them moi mon hoc");
			System.out.println("\t2. Hien thi danh sach mon hoc");
			System.out.println("\t3. Sua thong tin mon hoc");
			System.out.println("\t4. Xoa thong tin mon hoc");
			System.out.println("\t5. Sap xep danh sach ten mon");
			System.out.println("\t0. Quay lai");
			
			
			System.out.print("Lua chon cap nhat: ");
			
			try {
				chon = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			switch(chon) {
			case 1: themMonHoc(); break;
			case 2: hienThiDs(); break;			
			case 3: suaMonHoc(); break;
			case 4: xoaMonHoc(); break;
			case 5: sapXepDs(); break;
			case 0: return;
			default: System.out.println("Error choice. Please select again!!!!!!!!!");
			}
		} while (true); 
		
	}


	private static void themMonHoc() {
		System.out.println("\n===============THEM MON HOC MOI VAO DANH SACH===============");
		
		String maMon;
		do {
			System.out.print("\tNhap ma mon hoc: ");
			maMon = sc.nextLine();
			
		} while (indexOf(maMon) != -1);

		
		System.out.print("\tNhap ten mon hoc: ");
		String tenMon = sc.nextLine();
		if (tenMon.trim().length() == 0) {
			System.out.println("\tTen mon hoc khong duoc de trong");
			return;
		}
		System.out.print("\tNhap he so mon hoc: ");
		double heSo = Double.parseDouble(sc.nextLine());
		if ( heSo <= 0) {
			System.out.println("\tHe so khong am");
			return;
		}
		

		MonHoc mh = new MonHoc(maMon, tenMon, heSo);
		list.add(mh);


		
	}

	private static void hienThiDs() {
		System.out.println("\n------------DANH SACH MON HOC-------------");
		System.out.printf("%3s %8s %30s %-10s %n", "STT", "Ma MH", "Ten mon hoc", "He so mon");
		int stt = 1;
		for(MonHoc mh : list) {
			System.out.printf("%-3d  ", stt++);
			mh.display();
		}
		if (stt == 1) {
			System.out.println("\nDanh sach mon hoc rong !");
		}
		
	}

	private static void suaMonHoc() {
		int chon = -1;
		System.out.println("\n----------------SUA THONG TIN MON HOC---------------");
		System.out.print("\tNhap ma mon hoc can sua: ");
		String maMh = sc.nextLine();
		// Kiem tra mon hoc co trong danh sach
		int index = indexOf(maMh);
		if (index == -1) {
			System.out.println("\nMon hoc co ma = " + index + " khong co trong danh sach");
			return;
		}
		
		do {
			System.out.println("\tChon thong tin mon hoc can sua");
			System.out.println("\t1. Sua ten mon hoc");
			System.out.println("\t2. Sua he so mon");
			System.out.println("\t0. Quay lai");
			System.out.print("Lua chon cua ban?: ");

			try {
				chon = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			switch (chon) {
			case 1: suaTenMonHoc(index); break;
			case 2: suaHeSoMon(index); break;
			case 0: return;
			default:
				System.out.println("Error choice. Please select again!!!!!!!!!");
			}
		} while (true);
		
		
	}

	private static void suaTenMonHoc(int index) {
		System.out.print("\nNhap ten mon hoc moi: ");
		String tenMh = sc.nextLine();
		
		if (tenMh.trim().length() == 0) {
			System.out.println("\nTen mon hoc khong duoc de trong");
			return;
		}
		list.get(index).setTenMonHoc(tenMh);
		System.out.println("\tSua thanh cong");
		
	}

	private static void suaHeSoMon(int index) {
		System.out.print("\nNhap he so mon hoc moi: ");
		double heSo = Double.parseDouble(sc.nextLine());
		
		if (heSo <= 0) {
			System.out.println("\nHe so mon hoc phai khong am");
			return;
		}
		list.get(index).setHsMonHoc(heSo);
		System.out.println("\tSua thanh cong");
		
	}

	private static void xoaMonHoc() {
		System.out.println("\n----------------XOA THONG TIN MON HOC---------------");
		System.out.print("\tNhap ma mon hoc can xoa: ");
		String maMh = sc.nextLine();
		
		int index = indexOf(maMh);
		if (index == -1) {
			System.out.println("\nMon hoc co ma = " + index + " khong co trong danh sach");
			return;
		}
		int i  = 0; 
		while ( i < QLDIEM.list.size() && QLDIEM.list.get(i).getMaMonHoc().compareToIgnoreCase(maMh) != 0) {
			i++;
		}
		if (i < QLDIEM.list.size()) {
			System.out.println("\tSinh vien da hoc, khong the xoa");
			return;
		}
		
/*		for (int i = 0; i < QLDIEM.list.size(); i++) {
			if (QLDIEM.list.get(i).getMaMonHoc().compareToIgnoreCase(list.get(index).getMaMonHoc()) == 0) {
				if ( QLDIEM.list.get(i).getDiem() >= 0) {
					System.out.println("\tKhong xoa duoc ma sinh vien");
					break;
				} else {
					list.remove(index);
					System.out.println("\tXoa thanh cong!");
				}
			}
						
		}*/
		list.remove(index);
		System.out.println("\tXoa thanh cong!");
		
		/*
		 * 
		 * Xu ly phan sinh vien da co diem mon hoc
		 * list.remove(index);
		 *	System.out.println("\tXoa thanh cong!");
		 * 
		 * */

		
		
		
	}

	private static void sapXepDs() {
		Collections.sort(list, new Comparator<MonHoc>() {
			@Override
			public int compare(MonHoc o1, MonHoc o2) {
				// TODO Auto-generated method stub
				return o1.getTenMonHoc().trim().compareToIgnoreCase(o2.getTenMonHoc().trim());
			}
		});
		
	}


	public static int indexOf(String maMh) {
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).getMaMonHoc().trim().compareToIgnoreCase(maMh.trim()) == 0) {
				return index;
			}
		}
		return -1;
	}


	public static double coefficient(String maMh) {
		
		for (MonHoc d : list) {
			if (d.getMaMonHoc().trim().compareToIgnoreCase(maMh.trim()) == 0) {
				return d.getHsMonHoc();
			}
		}
		return -1;
	}
}
