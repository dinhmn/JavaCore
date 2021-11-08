package vn.devpro.QuanLiBanHang.qllh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import vn.devpro.QuanLiBanHang.qlhh.QLHH;

public class QLLH {

	public static ArrayList<LoaiHang> list = new ArrayList<>();
	
	static int autoId = 1;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void capNhat() {
		int chon;
		
		do {
			System.out.println("\n--------------CAP NHAT THONG TIN LOAI HANG------------");
			System.out.println("Lua chon chuc nang cap nhat loai hang");
			System.out.println("\t1. Them moi loai hang");
			System.out.println("\t2. Hien thi danh sach loai hang");
			System.out.println("\t3. Sua thong tin loai hang");
			System.out.println("\t4. Xoa thong tin loai hang");
			System.out.println("\t5. Sap xep danh sach loai hang");
			System.out.println("\t0. Quay lai");
			
			
			System.out.print("Lua chon cap nhat: ");
			chon = Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1: themLoaiHang(); break;
			case 2: hienThiDs(); break;
			case 3: suaLoaiHang(); break;
			case 4: xoaLoaihang(); break;
			case 5: sapXepDs(); break;
			case 0: return;
			default: System.out.println("Lua chon khong hop le");
			}
		} while (true); 
	}

	private static void themLoaiHang() {
		System.out.println("\n----------------THEM LOAI HANG MOI-------------------");
		System.out.println("Nhap thong tin loai hang moi");
		System.out.print("\tNhap ten loai hang: ");
		String name = sc.nextLine();
		if (name.trim().length() == 0) {
			System.out.println("\tTen khong duoc de trong");
			return;
		}
		// Kiem tra xem tend a ton tai trong danh sach hay chua?
		int i = 0;
		while (i < list.size() && name.trim().compareToIgnoreCase(list.get(i).getName().trim()) != 0) {
			i++;
		}
		if (i < list.size()) {
			System.out.println("\tTen loai hang da co trong danh sach loai hang");
			return;
		}
//		Khoi tao doi tuong loai hang va add vao list
		LoaiHang lh = new LoaiHang(autoId, name);
		list.add(lh);
		autoId++;
		System.out.println("\nThem loai hang thanh cong!");
	}

	private static void hienThiDs() {
		System.out.println("\n------------DANH SACH LOAI HANG-------------");
		System.out.printf("%3s %-10s %-25s %n", "STT", "Ma LH", "Ten loai hang");
		int stt = 1;
		for(LoaiHang lh : list) {
			System.out.printf("%-3d  ", stt++);
			lh.display();
		}
		if (stt == 1) {
			System.out.println("\nDanh sachg loai hang rong !");
		}
	}

	private static void suaLoaiHang() {
		System.out.println("\n-------------SUA THONG TIN LOAI HANG--------------");
		System.out.print("\tNhap id loai hang can sua: ");
		int id = Integer.parseInt(sc.nextLine());
//		Tim xem loai hang voi id vua nhap co trong danh sach khong
		int index = indexOf(id);
		if (index == -1 ) {
			System.out.println("\tLoai hang khong co trong danh sach");
			return;
		}
		System.out.print("\tNhap ten moi cho loai hang: ");
		String name = sc.nextLine();
		if (name.trim().length() == 0) {
			System.out.println("\tTen khong duoc de trong");
			return;
		}
		// Kiem tra xem ten da ton tai trong danh sach hay chua?
		int i = 0;
		while (i < list.size() && name.trim().compareToIgnoreCase(list.get(i).getName().trim()) != 0) {
			i++;
		}
		if (i < list.size()) {
			System.out.println("\tTen loai hang da co trong danh sach loai hang");
			return;
		}
//		Sua theo ten moi
		list.get(index).setName(name);
		System.out.println("\tSua ten loai hang thanh cong");
	}

	private static void xoaLoaihang() {
		// TODO Auto-generated method stub
		System.out.println("\n-------------SUA THONG TIN LOAI HANG--------------");
		System.out.print("\tNhap id loai hang can xoa: ");
		int id = Integer.parseInt(sc.nextLine());
//		Tim xem loai hang voi id vua nhap co trong danh sach khong
		int index = indexOf(id);
		if (index == -1 ) {
			System.out.println("\tLoai hang khong co trong danh sach");
			return;
		}
//		Co thi kiem tra xem loai hang da su dung trong danh sach hang hoa chua
		int i  = 0; 
		while ( i < QLHH.list.size() && QLHH.list.get(i).getIdlh() != id) {
			i++;
		}
		if (i < QLLH.list.size()) {
			System.out.println("\tLoai hang da su dung trong danh sach hang hoa, khong the xoa");
			return;
		}
		// Khong the xoa
		list.remove(index);
		System.out.println("\nXoa loai hang thanh cong!");
		
	}

	private static void sapXepDs() {
		Collections.sort(list, new Comparator<LoaiHang>() {
			@Override
			public int compare(LoaiHang o1, LoaiHang o2) {
				// TODO Auto-generated method stub
				return o1.getName().trim().compareToIgnoreCase(o2.getName().trim());
			}
		});
		
	}
//	Ham nhan vao id, tra ve index neu id co trong danh sach, nguoc lai tra ve -1
	public static int indexOf(int id) {
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).getId() == id) {
				return index;
			}
		}
		return -1;
	}

	
	
}
