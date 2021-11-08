package vn.devpro.QuanLiSinhVien.qlsv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import vn.devpro.QuanLiSinhVien.qlds.QLDIEM;

public class QLSV {

	public static ArrayList<SinhVien> list = new ArrayList<>();
	
	static int autoId = 1;
	
	static Scanner sc = new Scanner(System.in);

	public static void capNhat() {
		// TODO Auto-generated method stub
		int chon = -1;
		
		do {
			System.out.println("\n=============CAP NHAT THONG TIN SINH VIEN==============");
			System.out.println("\t1. Them moi sinh vien");
			System.out.println("\t2. Hien thi danh sach sinh vien");
			System.out.println("\t3. Sua thong tin sinh vien");
			System.out.println("\t4. Xoa thong tin sinh vien");
			System.out.println("\t5. Sap xep danh sach sinh vien");
			System.out.println("\t0. Quay lai");
			
			
			System.out.print("Lua chon cap nhat: ");

			try {
				chon = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			switch(chon) {
			case 1: themSinhVien(); break;
			case 2: hienThiDs(); break;			
			case 3: suaSinhVien(); break;
			case 4: xoaSinhVien(); break;
			case 5: sapXepDs(); break;
			case 0: return;
			default: System.out.println("Error choice. Please select again!!!!!!!!!");
			}
		} while (true); 
	}

	private static void hienThiDs() {
		System.out.println("\n==============DANH SACH SINH VIEN===========");
		System.out.printf("%-3s %8s %-23s %8s %9s %n", "STT", "Ma SV", "Ho va ten", "Nam sinh", "Gioi Tinh");
		int stt = 1;
		for(SinhVien sv : list) {
			System.out.printf("%-3d ", stt++);
			sv.display();
		}
		if (stt == 1) {
			System.out.println("\nDanh sachg loai hang rong !");
		}
		
	}

	private static void themSinhVien() {
		System.out.println("\n----------------THEM SINH VIEN MOI-------------------");
		System.out.println("Nhap thong tin sinh vien moi");
		System.out.print("Nhap ho dem: ");
		String hoDem = sc.nextLine();
		if (hoDem.trim().length() == 0) {
			System.out.println("\tHo dem khong duoc de trong");
			return;
		}
		System.out.print("Nhap ten: ");
		String ten = sc.nextLine();
		if (ten.trim().length() == 0) {
			System.out.println("\tTen khong duoc de trong");
			return;
		}
		System.out.print("Nhap nam sinh: ");
		int namSinh = Integer.parseInt(sc.nextLine());
		if (namSinh <= 0) {
			System.out.println("\tNam sinh khong am");
			return;
		}
		System.out.print("Nhap gioi tinh(Nam or Nu): ");
		String gioiTinh = sc.nextLine();
		if (gioiTinh.trim().length() == 0) {
			System.out.println("\tGioi tinh khong de trong");
			return;
		}
		boolean test = true;
		for (SinhVien sv : list) {
			if (sv.getMaSinhVien() == autoId) {
				test = false;
				break;
			}
		}
		if (test) {
			SinhVien sv = new SinhVien(autoId, hoDem, ten, namSinh, gioiTinh);
			list.add(sv);
			autoId++;
		} else {
			System.out.println("Ma sinh vien bi trung");
		}
		
		
	}

	private static void suaSinhVien() {
		int chon = -1;
		System.out.println("\n----------------SUA THONG TIN SINH VIEN---------------");
		System.out.print("\tNhap ma sinh vien can sua: ");
		int maSv = Integer.parseInt(sc.nextLine());
//		Kiem tra sinh vien trong danh sach
		int index = indexOf(maSv);
		if (index == -1) {
			System.out.println("\nSinh vien co ma = " + index + " khong co trong danh sach");
			return;
		}
		do {
			System.out.println("Chon thong tin sinh vien can sua");
			System.out.println("\t1. Sua ho dem sinh vien");
			System.out.println("\t2. Sua ten sinh vien");
			System.out.println("\t3. Sua nam sinh");
			System.out.println("\t4. Sua gioi tinh");
			System.out.println("\t0. Quay lai");
			System.out.print("Lua chon cua ban?: ");
			
			try {
				chon = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			switch (chon) {
			case 1: suaHoDem(index); break;
			case 2: suaTen(index); break;
			case 3: suaNamSinh(index); break;
			case 4: suaGioiTinh(index); break;
			case 0: return;
			default:
				System.out.println("Error choice. Please select again!!!!!!!!!");
			}
		} while (true);
		
		
	}

	private static void suaHoDem(int index) {
		System.out.print("\tNhap ho dem moi cho sinh vien: ");
		String hoDem = sc.nextLine();
		
		if (hoDem.trim().length() == 0) {
			System.out.println("\nHo dem khong duoc de trong");
			return;
		}
		list.get(index).setHoDem(hoDem);
		System.out.println("\tSua thanh cong");
		
		
	}

	private static void suaTen(int index) {
		System.out.print("\tNhap ten moi cho sinh vien: ");
		String ten = sc.nextLine();
		
		if (ten.trim().length() == 0) {
			System.out.println("\nTen khong duoc de trong");
			return;
		}
		list.get(index).setTen(ten);
		System.out.println("\tSua thanh cong");
		
		
	}

	private static void suaNamSinh(int index) {
		System.out.print("\tNhap nam sinh moi cho sinh vien: ");
		int namSinh = Integer.parseInt(sc.nextLine());
		
		if (namSinh <= 0) {
			System.out.println("\nNam sinh khong am");
			return;
		}
		list.get(index).setNamSinh(namSinh);;
		System.out.println("\tSua thanh cong");
		
		
	}

	private static void suaGioiTinh(int index) {
		System.out.print("\tNhap gioi tinh moi cho sinh vien(Nam or Nu): ");
		String gioiTinh = sc.nextLine();
		if (gioiTinh.trim().length() == 0) {
			System.out.println("\tGioi tinh khong duoc de trong");
			return;
		}
		list.get(index).setGioiTinh(gioiTinh);
		System.out.println("\tSua thanh cong");
		
		
	}

	private static void xoaSinhVien() {
		System.out.println("\n----------------XOA THONG TIN SINH VIEN---------------");
		System.out.print("\tNhap ma sinh vien can xoa: ");
		int maSv = Integer.parseInt(sc.nextLine());
		
		int index = indexOf(maSv);
		if (index == -1) {
			System.out.println("\nSinh vien co ma = " + index + " khong co trong danh sach");
			return;
		}

		
		int i  = 0; 
		while ( i < QLDIEM.list.size() && QLDIEM.list.get(i).getMaSinhVien() != maSv) {
			i++;
		}
		if (i < QLDIEM.list.size()) {
			System.out.println("\tSinh vien da hoc, khong the xoa");
			return;
		}
		/*
		for (int i = 0; i < QLDIEM.list.size(); i++) {
			if (QLDIEM.list.get(i).getMaSinhVien() == list.get(index).getMaSinhVien()) {
				if ( QLDIEM.list.get(i).getDiem() >= 0) {
					System.out.println("\tKhong xoa duoc ma sinh vien");
					break;
				} else {					
					list.remove(index);
					System.out.println("\tXoa thanh cong!");
					break;
				}
			}
						
		}		
		*/
		list.remove(index);
		System.out.println("\tXoa thanh cong!");
			
	}

	private static void sapXepDs() {
		Collections.sort(list, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return o1.getTen().trim().compareToIgnoreCase(o2.getTen().trim());
			}
		});
		System.out.println("\tDa sap xep danh sach");
	}
	public static void sapXepDsTheoMaSv() {
		Collections.sort(list, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return o1.getMaSinhVien() - o2.getMaSinhVien();
			}
		});
	}

	public static int indexOf(int id) {
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).getMaSinhVien() == id) {
				return index;
			}
		}
		return -1;
	}

	
}
