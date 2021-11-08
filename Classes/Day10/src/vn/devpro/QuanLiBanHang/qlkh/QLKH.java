package vn.devpro.QuanLiBanHang.qlkh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import vn.devpro.QuanLiBanHang.qlhh.QLHH;
import vn.devpro.QuanLiBanHang.qllh.LoaiHang;
import vn.devpro.QuanLiBanHang.qllh.QLLH;

public class QLKH {

	public static ArrayList<KhachHang> list = new ArrayList<>();
	
	public static int autoId = 1;
	
	static Scanner sc = new Scanner(System.in);

	
	public static void capNhat() {
		int chon;
		
		do {
			System.out.println("\n--------------CAP NHAT THONG TIN KHACH HANG------------");
			System.out.println("Lua chon chuc nang cap nhat khach hang");
			System.out.println("\t1. Them moi khach hang");
			System.out.println("\t2. Hien thi danh sach khach hang");
			System.out.println("\t3. Sua thong tin khach hang");
			System.out.println("\t4. Xoa thong tin khach hang");
			System.out.println("\t5. Sap xep danh sach khach hang");
			System.out.println("\t0. Quay lai");
			
			
			System.out.print("Lua chon cap nhat: ");
			chon = Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1: themKhachHang(); break;
			case 2: hienThiDs(); break;
			case 3: suaKhachHang(); break;
			case 4: xoaKhachhang(); break;
			case 5: sapXepDs(); break;
			case 0: return;
			default: System.out.println("Lua chon khong hop le");
			}
		} while (true); 
	}
	private static void themKhachHang() {
		System.out.println("\n----------------THEM KHACH HANG MOI-------------------");
		System.out.println("Nhap thong tin khach hang moi");
		System.out.print("\tNhap ten khach hang: ");
		String name = sc.nextLine();
		if (name.trim().length() == 0) {
			System.out.println("\tTen khong duoc de trong");
			return;
		}

//		Khoi tao doi tuong khach hang va add vao list
		KhachHang kh = new KhachHang(autoId, name);
		list.add(kh);
		autoId++;
		System.out.println("\nThem khach hang thanh cong!");
	}

	private static void hienThiDs() {
		System.out.println("\n------------DANH SACH KHACH HANG-------------");
		System.out.printf("%3s %-10s %-25s %n", "STT", "Ma KH", "Ten khach hang");
		int stt = 1;
		for(KhachHang kh : list) {
			System.out.printf("%-3d  ", stt++);
			kh.display();
		}
		if (stt == 1) {
			System.out.println("\nDanh sachg khach hang rong !");
		}
	}
	private static void suaKhachHang() {
		System.out.println("\n-------------SUA THONG TIN KHACH HANG--------------");
		System.out.print("\tNhap id khach hang can sua: ");
		int id = Integer.parseInt(sc.nextLine());
//		Tim xem loai hang voi id vua nhap co trong danh sach khong
		int index = indexOf(id);
		if (index == -1 ) {
			System.out.println("\tKhach hang khong co trong danh sach");
			return;
		}
		System.out.print("\tNhap ten moi cho khach hang: ");
		String name = sc.nextLine();
		if (name.trim().length() == 0) {
			System.out.println("\tTen khong duoc de trong");
			return;
		}		
//		Sua theo ten moi
		list.get(index).setName(name);
		System.out.println("\tSua ten loai hang thanh cong");
	}

	private static void xoaKhachhang() {
		// TODO Auto-generated method stub
		System.out.println("\n-------------SUA THONG TIN KHACH HANG--------------");
		System.out.print("\tNhap id khach hang can xoa: ");
		int id = Integer.parseInt(sc.nextLine());
//		Tim xem loai hang voi id vua nhap co trong danh sach khong
		int index = indexOf(id);
		if (index == -1 ) {
			System.out.println("\tKhach hang khong co trong danh sach");
			return;
		}
//		Co thi kiem tra xem loai hang da su dung trong danh sach hang hoa chua
//		int i  = 0; 
//		while ( i < QLHH.list.size() && QLHH.list.get(i).getIdlh() != id) {
//			i++;
//		}
//		if (i < QLLH.list.size()) {
//			System.out.println("\tLoai hang da su dung trong danh sach hang hoa, khong the xoa");
//			return;
//		}
		// Khong the xoa
		list.remove(index);
		System.out.println("\nXoa loai hang thanh cong!");
		
	}
	private static void sapXepDs() {
		Collections.sort(list, new Comparator<KhachHang>() {
			@Override
			public int compare(KhachHang o1, KhachHang o2) {
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
