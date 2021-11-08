package vn.devpro.bai8.arayListExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class QuanLyHocVien {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<HocVien> list = new ArrayList<HocVien>();
	
	// Ham tao mot so phan tu cho list su dung phuong thuc add
	public static void taoDs() {
		list.add(new HocVien(10001, "Tran Thi", "Lien", "20-10-2011", "Nu", "Lap trinh java"));
		list.add(new HocVien(10002, "Tran Thi", "Linh", "25-9-2011", "Nu", "Lap trinh java"));
		list.add(new HocVien(10003, "Tran Thi", "Lan", "20-9-2011", "Nu", "Lap trinh java"));
		list.add(new HocVien(10004, "Tran Thi", "Hoang", "16-5-2011", "Nu", "Lap trinh java"));
		list.add(new HocVien(10005, "Tran Thi", "Nam", "30-5-2011", "Nu", "Lap trinh java"));
		list.add(new HocVien(10006, "Tran Thi", "Chung", "12-03-2011", "Nu", "Lap trinh java"));
		list.add(new HocVien(10007, "Tran Thi", "Thuy", "6-7-2011", "Nu", "Lap trinh java"));
		list.add(new HocVien(10008, "Tran Thi", "Phuong", "8-1-2011", "Nu", "Lap trinh java"));
		
	}
	
	public static void hienThi() {
		for(HocVien hv : list) {
			hv.hienThi();
		}
	}
	
	public static void chen() {
		int k;
		System.out.print("Nhap vi tri chen: ");
		k = Integer.parseInt(sc.nextLine());
			
		list.add(k - 1, new HocVien(10009, "Nguyen Van", "Thanh", "21-12-2002", "Nam", "Lap trinh Web"));
	}
	// xoa
	
	public static void xoa() {
		int k;
		System.out.print("Nhap vi tri xoa: ");
		k = Integer.parseInt(sc.nextLine());
			
//		list.add(k - 1, new HocVien(10009, "Nguyen Van", "Thanh", "21-12-2002", "Nam", "Lap trinh Web"));
		list.remove(k - 1);
	}
	
	// thay the
	public static void thayThe() {
		int k;
		System.out.print("Nhap vi tri thay the: ");
		k = Integer.parseInt(sc.nextLine());
			
		list.set(k - 1, new HocVien(100010, "Nguyen Van", "Hung", "21-12-2002", "Nam", "Lap trinh Web"));
	}
	
	public static void sapXep() {
		Collections.sort(list, new Comparator<HocVien>() {
			@Override
			public int compare(HocVien o1, HocVien o2) {		
				return o1.getTen().compareToIgnoreCase(o2.getTen());
			}
		});
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		taoDs();
		System.out.println("Danh sach vua duoc khoi tao");
		hienThi();
		System.out.println();
		chen();
		System.out.println();
		hienThi();
		System.out.println();
		xoa();
		System.out.println();
		hienThi();
		
		System.out.println();
		thayThe();
		System.out.println();
		hienThi();
		
		System.out.println();
		sapXep();
		System.out.println();
		hienThi();
	}

}
