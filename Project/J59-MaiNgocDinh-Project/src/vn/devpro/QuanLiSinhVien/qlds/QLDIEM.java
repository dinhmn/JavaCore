package vn.devpro.QuanLiSinhVien.qlds;

import java.util.ArrayList;
import java.util.Scanner;

import vn.devpro.QuanLiSinhVien.qlmh.MonHoc;
import vn.devpro.QuanLiSinhVien.qlmh.QLMH;
import vn.devpro.QuanLiSinhVien.qlsv.QLSV;

public class QLDIEM {

	public static ArrayList<Diem> list = new ArrayList<>();
	
	
	
	static Scanner sc = new Scanner(System.in);

	public static void capNhat() {
		int chon = -1;
		
		do {
			System.out.println("\n=============CAP NHAT DIEM==============");
			System.out.println("\t1. Them diem mot sinh vien hoc mot mon hoc.");
			System.out.println("\t2. Hien thi diem cac mon hoc de sua");
			System.out.println("\t3. Sua diem mot mon hoc cua mot sinh vien.");
			System.out.println("\t4. Xoa diem mot mon hoc cua mot sinh vien.");
			System.out.println("\t0. Quay lai.");
			
			
			System.out.print("Lua chon cap nhat: ");
			try {
				chon = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			switch(chon) {
			case 1: themDiem(); break;	
			case 2: hienThi(); break;
			case 3: suaDiem(); break;
			case 4: xoaDiem(); break;
			case 0: return;
			default: System.out.println("Error choice. Please select again!!!!!!!!!");
			}
		} while (true); 
		
	}

	private static void themDiem() {
		System.out.println("==============CHUONG TRINH THEM DIEM CUA SINH VIEN===========");
		int ma;
		String maMon = null;
		double diem = -1;
		do {
			System.out.print("\tNhap ma sinh vien: ");
			ma = Integer.parseInt(sc.nextLine());
			if (ma == 0) {
				System.out.println("\tMa sinh vien khong duoc de trong");
				return;
			}
			if (QLSV.indexOf(ma) == -1) {
				System.out.println("\tMa sinh vien khong co trong danh sach");
			}
		} while (QLSV.indexOf(ma) == -1);
		boolean next = false;
		
		do {
			System.out.print("\tNhap ma mon: ");
			maMon = sc.nextLine();
			if (maMon.trim().length() == 0) {
				System.out.println("\tMa mon hoc khong duoc de trong");
				return;
			}
			else if (QLMH.indexOf(maMon) == -1) {
				System.out.println("\tMa mon hoc khong co trong danh sach");
				maMon = "";
			}
			else if (indexOf(ma, maMon) != -1) {
				System.out.println("\tMon hoc nay da duoc nhap diem");
				maMon = "";
			}
			//next = true;
		} while (QLMH.indexOf(maMon) == -1 && indexOf(ma, maMon) != -1 && maMon == "");
		
		
		
		if (maMon.compareTo("") != 0) {
			do {
				System.out.print("\tNhap diem: ");
				diem = Double.parseDouble(sc.nextLine());
				
				if (diem < 0) {
					System.out.println("\tDiem so khong am.");
				} else if (diem > 10) {
					System.out.println("\tDiem so khong lon hon 10.");
				}
			}while (diem < 0 || diem >10);
			Diem d = new Diem(ma, maMon, diem);
			list.add(d);
		}
		
	}


	public static void hienThi() {
		System.out.println("\n------------DANH SACH DIEM-------------");
		System.out.printf("%3s %8s %8s %4s %n", "STT", "Ma SV", "Ma MH", "Diem");
		int stt = 1;
		for(Diem d : list) {
			System.out.printf("%-3d  ", stt++);
			d.display();
		}
		if (stt == 1) {
			System.out.println("\nDanh sach diem rong !");
		}
	}
	
	private static void suaDiem() {
		System.out.print("\tNhap ma sinh vien : ");
		int ma = Integer.parseInt(sc.nextLine());
		System.out.print("\tNhap ma mon: ");
		String maMon = sc.nextLine();
		
		int index = indexOf(ma, maMon);
		if (index == -1) {
			System.out.println("Khong ton tai diem " + maMon + " co ma sinh vien " + ma);
		} else {
			System.out.println("\tNhap diem moi: ");
			double diem = Double.parseDouble(sc.nextLine());
			
			list.get(index).setDiem(diem);
			System.out.println("\tSua thanh cong");
		}
		
	}

	private static void xoaDiem() {
		System.out.print("\tNhap ma sinh vien : ");
		int ma = Integer.parseInt(sc.nextLine());
		System.out.print("\tNhap ma mon: ");
		String maMon = sc.nextLine();
		
		int index = indexOf(ma, maMon);
		if (index == -1) {
			System.out.println("Khong ton tai diem " + maMon + " co ma sinh vien " + ma);
		} else {
		
			list.remove(index);
			System.out.println("\tXoa thanh cong");
		}
		
	}

	public static int indexOf(int maSV, String maMh) {
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).getMaMonHoc().trim().compareToIgnoreCase(maMh.trim()) == 0
					&& list.get(index).getMaSinhVien() == maSV
					) {
				return index;
			}
		}
		return -1;
	}
	
}
