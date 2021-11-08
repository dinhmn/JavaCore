package vn.devpro.QuanLiBanHang.qlhh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import vn.devpro.QuanLiBanHang.qllh.LoaiHang;
import vn.devpro.QuanLiBanHang.qllh.QLLH;

public class QLHH {

	static int autoId = 1;
	
	static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<HangHoa> list = new ArrayList<>();
	
	public static void capNhat() {
		int chon;
		
		do {
			System.out.println("\n--------------CAP NHAT THONG TIN HANG HOA------------");
			System.out.println("Lua chon chuc nang cap nhat hang hoa");
			System.out.println("\t1. Them moi hang hoa");
			System.out.println("\t2. Hien thi danh sach hang hoa");
			System.out.println("\t3. Sua thong tin hang hoa");
			System.out.println("\t4. Xoa thong tin hang hoa");
			System.out.println("\t5. Sap xep danh sach hang hoa");
			System.out.println("\t0. Quay lai");
			
			
			System.out.print("Lua chon cap nhat: ");
			chon = Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1: themHangHoa(); break;
			case 2: hienThiDs(); break;
			case 3: suaHangHoa(); break;
			case 4: xoaHangHoa(); break;
			case 5: sapXepDs(); break;
			case 0: return;
			default: System.out.println("Lua chon khong hop le");
			}
		} while (true); 
	}
	
	
	private static void themHangHoa() {
		System.out.println("\n------------------THEM HANG HOA MOI VAO DANH SACH----------------");
		
		System.out.print("\tChon ma loai hang: ");
		int idlh = Integer.parseInt(sc.nextLine());
//		Kiem tra xem idlh co trong danh sach loai hang khong?
		int index = QLLH.indexOf(idlh);
		if (index == -1) {
			System.out.println("\tLoai hang khong co trong danh sach");
			return;
		}
		
		
		System.out.print("\tNhap ten hang hoa: ");
		String name = sc.nextLine();
		if (name.trim().length() == 0) {
			System.out.println("\tTen hang khong duoc de trong");
			return;
		}
		System.out.print("\tNhap so luong cua hang hoa: ");
		double amount = Double.parseDouble(sc.nextLine());
		if ( amount < 0) {
			System.out.println("\tSo luong phai khong am");
			return;
		}
		System.out.print("\tNhap don gia cua hang hoa: ");
		double price = Double.parseDouble(sc.nextLine());
		if ( price < 0) {
			System.out.println("\tDon gia phai khong am");
			return;
		}
		
//		Khoi tao doi tuong hang hoa moi va them vao list
		HangHoa hh = new HangHoa(autoId, idlh, name, amount, price);
		list.add(hh);
		autoId++;
		System.out.println("\nThem hang hoa thanh cong");
		
	}


	private static void hienThiDs() {
		System.out.println("\n------------DANH SACH HANG HOA-------------");
		System.out.printf("%3s %10s %-25s %-30s %8s %13s %14s %n",
				"STT", "Ma Hang", "Ten loai hang", "Ten hang hoa", "So luong", "Don gia", "Thanh tien");
		int stt = 1;
		for(HangHoa hh : list) {
			System.out.printf("%-3d ", stt++);
			hh.display();
		}
		if (stt == 1) {
			System.out.println("\nDanh sach hang hoa rong !");
		}
	}


	private static void suaHangHoa() {
		int chon;
		System.out.println("\n----------------SUA THONG TIN HANG HOA---------------");
		System.out.print("\tNhap id hang hoa can sua: ");
		int id = Integer.parseInt(sc.nextLine());
//		Kiem tra hang hoa trong danh sach
		int index = indexOf(id);
		if (index == -1) {
			System.out.println("\nHang hoa co id = " + index + " khong co trong danh sach");
			return;
		}
		do {
			System.out.print("\nChon thong tin hang can sua");
			System.out.println("\t1. Sua ma loai hang");
			System.out.println("\t2. Sua ten hang hoa");
			System.out.println("\t3. Sua so luong");
			System.out.println("\t4. Sua don gia");
			System.out.println("\n0. Quay lai");
			System.out.print("Lua chon cua ban?: ");
			chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: suaMaLoaiHang(index); break;
			case 2: suaTenHang(index); break;
			case 3: suaSoLuong(index); break;
			case 4: suaDonGia(index); break;
			case 0: return;
			default:
				System.out.println("Lua chon khong hop le");
			}
		} while (true);
		
	}


	private static void suaMaLoaiHang(int index) {
		System.out.print("\nNhap ma loai hang moi cho hang hoa: ");
		int idlh = Integer.parseInt(sc.nextLine());
		if (QLLH.indexOf(idlh) == -1) {
			System.out.println("Ma loai hang vua nhap khong co trong danh sach loai hang");
			return;
		}
		list.get(index).setIdlh(idlh);
		System.out.println("\tSua thong tin ma loai hang thanh cong!");
		
	}


	private static void suaTenHang(int index) {
		System.out.print("\nNhap ten moi cho hang hoa: ");
		String name = sc.nextLine();
		if (name.trim().length() != 0) {
			System.out.println("\tTen khong duoc de trong");
			return;
		}
		list.get(index).setName(name);
		System.out.println("\nSua ten thanh cong!");
		
	}


	private static void suaSoLuong(int index) {
		System.out.print("\tNhap so luong moi cho hang hoa: ");
		double amount = Double.parseDouble(sc.nextLine());
		if (amount < 0) {
			System.out.println("So luong phai khong am");
		}
		list.get(index).setAmount(amount);
		System.out.println("\nSua so luong thanh cong");		
	}


	private static void suaDonGia(int index) {
		// TODO Auto-generated method stub
		System.out.print("\tNhap don gia moi cho hang hoa: ");
		double price = Double.parseDouble(sc.nextLine());
		if (price < 0) {
			System.out.println("Don gia phai khong am");
		}
		list.get(index).setPrice(price);;
		System.out.println("\nSua so luong thanh cong");
		
	}


	private static void xoaHangHoa() {
		// TODO Auto-generated method stub
		System.out.println("\n----------------Xoa THONG TIN HANG HOA---------------");
		System.out.print("\tNhap id hang hoa can xoa: ");
		int id = Integer.parseInt(sc.nextLine());
//		Kiem tra hang hoa trong danh sach
		int index = indexOf(id);
		if (index == -1) {
			System.out.println("\nHang hoa co id = " + index + " khong co trong danh sach");
			return;
		}
		list.remove(index);
		System.out.println("\tXoa hang hoa thanh cong!");
	}


	private static void sapXepDs() {
		Collections.sort(list, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
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
