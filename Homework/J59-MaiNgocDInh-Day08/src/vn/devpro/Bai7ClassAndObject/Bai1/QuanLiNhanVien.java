package vn.devpro.Bai7ClassAndObject.Bai1;

import java.util.ArrayList;
import java.util.Arrays;

public class QuanLiNhanVien {

	static int stt = 1;
	
	static Teacher[] tc = {
			new Teacher(001, "Lucasta", "Nam", new Date(15, 07, 2021), 2016,new Subject(112, "Louisa"), 3.5, 76),
			new Teacher(002, "Ladonna", "Nam", new Date(06, 03, 2021), 2013,new Subject(132, "Artemis"), 2.5,  0),
			new Teacher(003, "Mai", "Nam", new Date(14, 10, 2021), 2021,new Subject(114, "Xavia"), 1.8,  16),
			new Teacher(004, "Peter", "Paker", new Date(24, 06, 2021), 2020,new Subject(123, "Calantha"), 2.6,  26),
			new Teacher(001, "Cris", "Charmaine", new Date(31, 03, 2021), 2019,new Subject(146, "Myrna"), 2.4,  23),
			new Teacher(005, "Donna", "Cosima", new Date(26, 11, 2021), 2019,new Subject(156, "Edana"), 3.1,  24),
			new Teacher(006, "Kaylin", "Dilys", new Date(24, 12, 2021), 2018,new Subject(175, "Oriana"), 2.8,  36),
			new Teacher(007, "Jezebel", "Edana", new Date(15, 10, 2021), 2017,new Subject(162, "Sophronia"), 3.2,  45),
			new Teacher(011, "Hebe", "Fiona", new Date(16, 01, 2021), 2016,new Subject(133, "Theodora"), 2.6, 31),
			new Teacher(011, "Cristiano", "Lionel", new Date(13, 02, 2021), 2014,new Subject(799, "Lingardinho"), 3.6, 0)
	};
	
	public static void tieuDe() {
		System.out.printf("%3s %-8s %-23s %-10s %12s %12s %12s %19s %15s %13s %n",
				"STT", "Code", "Full Name", "Date", "Year Working", "Code Subject", "Subject","Coefficients Salary", "Salary", "Teaching Time");
	}
//	Hien thi danh sach
	public static void hienThi(Teacher[] tc) {
		System.out.println("\n\t\t===============HIEN THI DANH SACH TEACHER=============");
		tieuDe();
		for (Teacher tea : tc) {
			System.out.printf("%3d ", stt++);
			tea.hienThi();
		}
	}
//	Hien thi danh sach giao vien luong duoi 5000000
	public static void hienThiLuongThapHon5tr() {
		System.out.println("\n\t\t===============HIEN THI DANH SACH TEACHER=============");
		tieuDe();
		for (Teacher tea : tc) {
			if (tea.calcuSalary() < 5000000) {
				System.out.printf("%3d ", stt++);
				tea.hienThi();
			}
		}
		
	}
//	Them giao vien moi
	public static void insertTeacher() {
		int k;
		System.out.print("Nhap vi tri can them trong danh sach: "); k = Integer.parseInt(Employee.scanner.nextLine());
		// Chuyen mang thanh List
		ArrayList<Teacher> list = new ArrayList<Teacher>(Arrays.asList(tc));
		
		Teacher teaNew = new Teacher();
		teaNew.nhap();
		
		list.add(k, teaNew);
		
		Teacher[] tc = new Teacher[list.size()];
		list.toArray(tc);
		
		hienThi(tc);
	}
	
	
//	Tinh tong luong cua tat ca nhan vien
	public static double tongLuongTatCaTeacher() {
		double tong = 0;
		for(Teacher tea : tc) {
			tong += tea.calcuSalary();
		}
		return tong;
	}
//	Chuyen giao vien khong co gio day xuong cuoi danh sach
	public static void chuyenXuongCuoi() {
			
		for (int i = 0; i < tc.length; i++) {
			if (tc[i].getNumberOfTeachingHours() == 0) {
				for (int j = i; j < tc.length - 1; j++) {
					sort(tc, j, j + 1);
				}
			}
		}
		hienThi(tc);
		
	}
//	Sap xep danh sach them ten va hien thi danh sach
	public static void sort(Teacher[] a, int i, int j) {
		Teacher temp = a[i];
			a[i] = a[j];
			a[j] = temp;
	}
	public static void sapXepTheoTen() {
		
		for (int i = 0; i < tc.length - 1; i++) {
			for (int j = i + 1; j < tc.length; j++) {
				if (tc[i].getName().substring(0, 1).compareTo(tc[j].getName().substring(0, 1)) > 0) {
					sort(tc, i, j);
				}
			}
		}
		hienThi(tc);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Cau 1:");
		hienThi(tc);
		
		System.out.println("=========================================================");
		System.out.println("Cau 2:");
		System.out.println("Danh sach giao vien co luong thap hon 5 cu");
		hienThiLuongThapHon5tr();

		System.out.println("=========================================================");
		System.out.println("Cau 3:");
		System.out.println("Hien thi danh sach sau khi them");
		insertTeacher();

		System.out.println("=========================================================");
		System.out.println("Cau 4:");
		System.out.printf("Tong luong tat ca cac teacher: %,15.2f %n" , tongLuongTatCaTeacher());

		System.out.println("=========================================================");
		System.out.println("Cau 5");
		chuyenXuongCuoi();

		System.out.println("=========================================================");
		System.out.println("Cau 6:");
		sapXepTheoTen();
//		
	}

}
