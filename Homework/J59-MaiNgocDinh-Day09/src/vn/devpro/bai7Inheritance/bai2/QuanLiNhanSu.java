package vn.devpro.bai7Inheritance.bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuanLiNhanSu {

	static Scanner scanner = new Scanner(System.in);
	static NhanSu[] list;
	
	public static void nhapDs() {
		int chon;
//		System.out.println("Nhap danh sach nhan vien (chon 1 - nhap Can Bo, 2 - nhap Cong Nhan)");
		for (int i = 0; i < list.length; i++) {
			System.out.println("Nhap nhan vien thu " + (i + 1));
			System.out.print("Chon 1: Nhap Can Bo, 2: Nhap Cong Nhan");
			chon = Integer.parseInt(scanner.nextLine());
			
			if (chon == 1) {
				list[i] = new CanBo();
			} else {
				list[i] = new CongNhan();
			}
			list[i].nhap();
		}
	}
	public static void tieuDe() {
		System.out.println("\n\t\tHien thi danh dach");
		System.out.printf("%3s %8s %-23s %8s %9s %15s %20s %7s %15s %12s %15s %n", "STT",
				"MaNS", "HoVaTen", "NamSinh", "GioiTinh", "TenPhong/Xuong", "TruongPhong/QuanDoc", "HSL/SCN", "ChucVu/CongViec", "XepLoai/SoNC", "Luong");

	}
	
	public static void hienThi() {

		int stt = 1;

		for(NhanSu ns : list) {
			System.out.printf("%3d", stt++);
			ns.hienThi();
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print("Nhap so luong nhan su: ");
		int n = Integer.parseInt(scanner.nextLine());
		list = new NhanSu[n];
		nhapDs();		
		int choose = 0;
		
		do {
			System.out.println("===========================MENU HIEN THI==========================");
			System.out.println(" Chon 1: Hien thi danh sach nhan su");
			System.out.println(" Chon 2: Hien thi danh sach cong nhan nam");
			System.out.println(" Chon 3: Hien thi danh sach can bo nu");
			System.out.println(" Chon 4: Hien thi danh sach can bo co luong cao nhat");
			System.out.println(" Chon 5: Hien thi danh sach cong nhan co luong thap nhat");
			System.out.println(" Chon 6: Tong luong tat ca can bo");
			System.out.println(" Chon 7: Tong luong tat ca cong nhan");
			System.out.println(" Chon 8: Chuyen cong nhan xuong cuoi ds, chon 3: Hien thi lai ds");
			System.out.println(" Chon 9: Sap xep nhan su theo ten, chon 3: Hien thi lai ds");
			System.out.println(" Chon 0: Tong luong tat ca can bo, chon 3: Hien thi lai ds");
			System.out.print("Nhap lua chon chua ban: ");
			choose = Integer.parseInt(scanner.nextLine());
			
			switch (choose) {
			case 1:
				tieuDe();
				hienThi();
				break;
			case 2:
				hienThiCongNhanNam();
				break;
			case 3:
				hienThiCanBoNu();
				break;
			case 4:
				hienThiCanBoLuongCaoNhat();
				break;
			case 5:
				hienThiCongNhanLuongThapNhat();
				break;
			case 6:
				System.out.printf("Tong luong can bo la: %,16.2f", tongLuongCanBo());
				break;
			case 7:
				System.out.printf("Tong luong cong nhan la: %,16.2f", tongLuongCongNhan());
				break;
			case 8:
				chuyenXuongCuoiDanhSach();
				break;
			case 9:
				sapXepTheoTen();
				break;
			case 0:
				System.out.println("Thoat khoi chuong trinh");
				break;
			default:
				System.out.println("Da thoat khoi chuong trinh");
				break;
			}
			
		} while (true);
	}
	private static void hienThiCongNhanNam() {
		// TODO Auto-generated method stub
		tieuDe();
		for(NhanSu nv : list) {
			if (nv instanceof CongNhan && nv.getGioiTinh().compareToIgnoreCase("nam") == 0) {
				nv.hienThi();
			}
		}
	}
	private static void hienThiCanBoNu() {
		tieuDe();
		for(NhanSu nv : list) {
			if (nv instanceof CanBo && nv.getGioiTinh().compareToIgnoreCase("nu") == 0) {
				nv.hienThi();
			}
		}
	}
	private static void hienThiCanBoLuongCaoNhat() {
		// TODO Auto-generated method stub
		double max = 0;
		for(NhanSu nv : list) {
			if (nv instanceof CanBo && max <  nv.luong()) {
				max = nv.luong();
			}
		}
		for(NhanSu nv : list) {
			if (nv instanceof CanBo && nv.luong() == max) {
				nv.hienThi();
			}
		}
		
	}
	private static void hienThiCongNhanLuongThapNhat() {
		// TODO Auto-generated method stub
		double min = 0;
		for(NhanSu nv : list) {
			if (nv instanceof CongNhan && min > nv.luong()) {
				min = nv.luong();
			}
		}
		for(NhanSu nv : list) {
			if (nv instanceof CongNhan && nv.luong() == min) {
				nv.hienThi();
			}
		}
	}
	private static double tongLuongCanBo() {
		// TODO Auto-generated method stub
		int tong = 0;
		for (NhanSu nv : list) {
			if(nv instanceof CanBo) {
				tong += nv.luong();
			}
		}
		return tong;
	}
	private static double tongLuongCongNhan() {
		// TODO Auto-generated method stub
		int tong1 = 0;
		for (NhanSu nv : list) {
			if(nv instanceof CongNhan) {
				tong1 += nv.luong();
			}
		}
		return tong1;
		
	}
	private static void chuyenXuongCuoiDanhSach() {
		// TODO Auto-generated method stub
		int i = 0, j = list.length - 1;
		while(i < j) {
			while( i < j && list[i] instanceof CanBo) {
				i++;
			}
			while (j > i && list[j] instanceof CongNhan) {
				j--;
			}
			if (i < j) {
				NhanSu ns = list[i];
				list[i] = list[j];
				list[j] = ns;
				i++;
				j--;
			}
		}
	}
	private static void sapXepTheoTen() {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i].getTen().substring(0, 1).compareToIgnoreCase(list[i+1].getTen().substring(0, 1)) ==0) {
				NhanSu temp = list[i];
				list[i] = list[i+1];
				list[i+1] = temp;
			}
		}
	}
}
