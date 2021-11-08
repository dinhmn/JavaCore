package vn.devpro.QuanLiSinhVien.qlht;

import java.util.ArrayList;
import java.util.Scanner;

import vn.devpro.QuanLiSinhVien.qlds.Diem;
import vn.devpro.QuanLiSinhVien.qlds.QLDIEM;
import vn.devpro.QuanLiSinhVien.qlmh.QLMH;
import vn.devpro.QuanLiSinhVien.qlsv.QLSV;
import vn.devpro.QuanLiSinhVien.qlsv.SinhVien;

public class QLHT {

	static Scanner sc = new Scanner(System.in);
	
	public static void hienThi() {
		int chon = -1;
		do {
			System.out.println("\n=============HIEN THI BANG DIEM==============");
			System.out.println("\t1. Hien thi bang diem tat ca sinh vien theo tung sinh vien.");
			System.out.println("\t2. Hien thi bang diem tat ca cac mon hoc theo tung mon hoc.");
			System.out.println("\t0. Quay lai.");
			
			
			System.out.print("Lua chon cap nhat: ");

			try {
				chon = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			switch(chon) {
			case 1: hienThiDiemTheoSinhVien(); break;			
			case 2: hienThiDiemTheoMon(); break;
			case 0: return;
			default: System.out.println("Error choice. Please select again!!!!!!!!!");
			}
		} while (true); 
		
	}

	private static void hienThiDiemTheoSinhVien() {
		
//		ArrayList<SinhVien> listClone = new ArrayList<SinhVien>();
//		listClone = (ArrayList<SinhVien>) QLSV.list.clone();
		
		// Sap xep danh sach theo ma sinh vien truoc khi hien thi
		QLSV.sapXepDsTheoMaSv();
				
		for (int i = 0; i < QLSV.list.size(); i++) {
			System.out.println("---------------------------------------------------------------------");
			String name = QLSV.list.get(i).getFullName(QLSV.list.get(i).getHoDem(), QLSV.list.get(i).getTen());
			System.out.println("\t\t\tBANG DIEM CUA SINH VIEN " + name);
			System.out.println("\tHo va ten:    " + name);
			System.out.println("\tMa sinh vien: " + QLSV.list.get(i).getMaSinhVien());
			
			int index = indexOf(QLSV.list.get(i).getMaSinhVien());
			
			
			if (index != -1) {
				hienThiDiemMotSinhVien(i);
			} else {
				System.out.println("\n\tSinh vien chua dang ky hoc mon nao!!");
			}
			
		}
		
	}
	public static void hienThiDiemMotSinhVien(int index) {
		double tongDiem = 0,tongHeSo = 0;
		int stt = 1;
		System.out.printf("%3s %8s %30s %5s %n", "STT", "Ma MH", "Ten Mon Hoc", "Diem");
		for (int j = 0; j < QLDIEM.list.size(); j++) {
			int indexSubject = QLMH.indexOf(QLDIEM.list.get(j).getMaMonHoc());
			if (QLSV.list.get(index).getMaSinhVien() == QLDIEM.list.get(j).getMaSinhVien()) {
				
				System.out.printf("%3d %8s %30s %5.2f %n",
						stt++, QLDIEM.list.get(j).getMaMonHoc().toUpperCase(),  QLMH.list.get(indexSubject).getTenMonHoc(), QLDIEM.list.get(j).getDiem());
				tongHeSo += QLMH.coefficient( QLDIEM.list.get(j).getMaMonHoc());
				tongDiem += QLMH.coefficient( QLDIEM.list.get(j).getMaMonHoc()) * QLDIEM.list.get(j).getDiem();
			}
		}
		System.out.print("\n\t\t\t\t");
		System.out.printf("Diem TB: %3.2f %n", tongDiem/tongHeSo);
	}
	
	private static void hienThiDiemTheoMon() {
		/*Hiển thị bảng điểm của tất cả các môn học theo từng môn học, mỗi môn học hiển thị Mã môn 
		học, tên môn học, điểm trung bình chung của môn học và danh sách sinh viên (gồm mã sv, họ 
		tên, điểm) học môn học đó. */


		for (int i = 0; i < QLMH.list.size(); i++) {
			System.out.println("---------------------------------------------------------------------");
			String nameSubject = QLMH.list.get(i).getTenMonHoc();
			System.out.println("\t\t\tBANG DIEM CUA MON " + nameSubject);
			System.out.println("\tMa mon:  " + QLMH.list.get(i).getMaMonHoc().toUpperCase());
			System.out.println("\tTen mon: " + nameSubject);
			
			
			int index = indexOf(QLMH.list.get(i).getMaMonHoc());

			if (index != -1) {
				hienThiDiemMotMonHoc(i);
			} else {
				System.out.println("\n\tMon hoc nay chua co sinh vien dang ky");
			}
			

		}	
		
		
	}
	
	public static void hienThiDiemMotMonHoc(int index) {
		double tongDiem = 0;;
		int stt = 1, count = 0;
		
		System.out.printf("%3s %8s %23s %5s %n", "STT", "Ma SV", "Ho va ten", "Diem");
		for (int j = 0; j < QLDIEM.list.size(); j++) {
			int indexStudent = QLSV.indexOf(QLDIEM.list.get(j).getMaSinhVien());
			String nameStudent = QLSV.list.get(indexStudent).getFullName(QLSV.list.get(indexStudent).getHoDem(), QLSV.list.get(indexStudent).getTen());
			if (QLDIEM.list.get(j).getMaMonHoc().trim().compareToIgnoreCase(QLMH.list.get(index).getMaMonHoc().trim()) == 0 ) {
				System.out.printf("%3d %8s %23s %5.2f %n", 
						stt++, QLDIEM.list.get(j).getMaSinhVien(),  nameStudent,QLDIEM.list.get(j).getDiem());
				tongDiem += QLDIEM.list.get(j).getDiem();
				count++;
			}
		}
		System.out.print("\n\t\t\t\t");
		System.out.printf("Diem TB: %3.2f %n", tongDiem/count);
	}
	
	public static int indexOf(int id) {
		for (int index = 0; index < QLDIEM.list.size(); index++) {
			if (QLDIEM.list.get(index).getMaSinhVien() == id) {
				return index;
			}
		}
		return -1;
	}
	public static int indexOf(String maMh) {
		for (int index = 0; index < QLDIEM.list.size(); index++) {
			if (QLDIEM.list.get(index).getMaMonHoc().trim().compareToIgnoreCase(maMh.trim()) == 0) {
				return index;
			}
		}
		return -1;
	}
}
