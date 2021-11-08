package vn.devpro.QuanLiBanHang.qlbh;

import java.util.ArrayList;
import java.util.Scanner;

import vn.devpro.QuanLiBanHang.qlhh.HangHoa;
import vn.devpro.QuanLiBanHang.qlhh.QLHH;
import vn.devpro.QuanLiBanHang.qlkh.QLKH;

public class GioHang {

	static Scanner sc = new Scanner(System.in);
	
	private int id;
	private int idkh;
	private ArrayList<HangBan> list = new ArrayList<>();
	public GioHang() {
		super();
	}
	public GioHang(int id, int idkh, ArrayList<HangBan> list) {
		super();
		this.id = id;
		this.idkh = idkh;
		this.list = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdkh() {
		return idkh;
	}
	public void setIdkh(int idkh) {
		this.idkh = idkh;
	}
	public ArrayList<HangBan> getList() {
		return list;
	}
	public void setList(ArrayList<HangBan> list) {
		this.list = list;
	} 
	
	public void themHangVaoGio() {
		System.out.println("\n------------THEM HANG VAO GIO-----------------");
		System.out.println("\tNhap ma hang hoa can them vao gio: ");
		int idhh = Integer.parseInt(sc.nextLine());
//		Kiem tra ma hang hoa co trong danh sach hang hoa khong?
		int index1 = QLHH.indexOf(idhh);
		if ( index1 == -1) {
			System.out.println("\tHang hoa khong co de ban");
			return;
		}
		
		System.out.print("\tNhap so luong muon mua: ");
		double amount = Double.parseDouble(sc.nextLine());
		if ( amount <= 0) {
			System.out.println("\tSo luong mua phai la so duong");
			return;
		}
//		Tim hang hoa trong gio?
		int index2 = indexOf(idhh);
		if (index2 == -1){//Truong hop hang vua chon chua con trong gio
			if (amount > QLHH.list.get(index1).getAmount()) {
				System.out.println("\tSo hang hien tai khong du de ban");
				return;
			}
			list.add(new HangBan(idhh, amount));
			System.out.println("\tThem hang hoa thanh cong!");
		}
		else {//Kiem tra so luong mua khong vuot qua so luong co trong danh sach hang ban
			double newAmount = amount + list.get(index2).getAmount();
			if ( newAmount > QLHH.list.get(index1).getAmount()) {
				System.out.println("\tSo hang hien tai khong du de ban");
				return;
			}
			list.get(index2).setAmount(newAmount);
			System.out.println("\tThem hang hoa thanh cong!");
		}
//		Truong hop hang vua chon da co trong gio
		
	}
	
//	Hien thi gio hang
	public void hienThiGioHang() {
		System.out.println("\n-----------GIO HANG CUA BAN-----------");
		/*
		System.out.println("\tMa hoa don: " + id); // tam su dung la ma gio hang
//		Truy van ten khach hang trong danh sach khach hang thong qua idkh
		int index = QLKH.indexOf(idkh);
		if ( index == -1) {
			return;
		}
		System.out.println("\tTen khach hang: " + QLKH.list.get(index).getName());
		*/
		System.out.println("Danh sach hang hoa");
		int stt = 1;
		double sumOfTotal = 0;
		System.out.printf("%3s %-30s %8s %13s %14s %n", "STT", "Ten khach hang", "So luong",
				"Don gia", "Thanh tien");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%-3d ", stt++);
			list.get(i).display();
			sumOfTotal += list.get(i).total();
		}
		System.out.printf("Cong thanh tin: %15.2f %n", sumOfTotal);
	}
//	Sua thong tin hang hoa trong gio
	public void suaHangTrongGio() {
		System.out.println("\n------------Sua so luong hang trong gio--------");
		System.out.print("\tNhap ma hang hoa can sua: ");
		int idhh = Integer.parseInt(sc.nextLine());
		int index = indexOf(idhh);
		if (index == -1) {
			System.out.println("\tHang hoa khong co trong gio");
			return;
		}
		System.out.print("\tNhap so luong moi cho hang: ");
		double newAmount = Double.parseDouble(sc.nextLine());
		if (newAmount <= 0) {
			System.out.println("\tSo luong hang hoa phai la so duong");
			return;
		}
		int index1 = QLHH.indexOf(idhh);
		if (newAmount > QLHH.list.get(index1).getAmount()) {
			System.out.println("\tSo luong hang hoa khong du ban");
			return;
		}
		
		list.get(index).setAmount(newAmount);
		System.out.println("\tSua thong tin hang trong gip thanh cong!");
		
	}
//	Xoa hang hoa trong gio
	public void xoaHangTrongGio() {
		System.out.println("\n------------Xoa hang trong gio--------");
		System.out.print("\tNhap ma hang hoa can xoa: ");
		int idhh = Integer.parseInt(sc.nextLine());
		int index = indexOf(idhh);
		if (index == -1) {
			System.out.println("\tHang hoa khong co trong gio");
			return;
		}
		list.remove(index);
		System.out.println("\tXoa hang trong gio thanh cong!");
	}
//	Hien thi hoa don 
	public void hienThiHoaDon() {
		System.out.println("\n-----------HOA DON BAN LE-----------");
		System.out.println("\tMa hoa don: " + id); // tam su dung la ma gio hang
//		Truy van ten khach hang trong danh sach khach hang thong qua idkh
		int index = QLKH.indexOf(idkh);
		if ( index == -1) {
			return;
		}
		System.out.println("\tTen khach hang: " + QLKH.list.get(index).getName());
		
		System.out.println("Danh sach hang hoa");
		int stt = 1;
		double sumOfTotal = 0;
		System.out.printf("%3s %-30s %8s %13s %14s %n", "STT", "Ten khach hang", "So luong",
				"Don gia", "Thanh tien");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%-3d ", stt++);
			list.get(i).display();
			sumOfTotal += list.get(i).total();
		}
		System.out.printf("Cong thanh tin: %15.2f %n", sumOfTotal);
	}

//	Ham kiem tra hang hoa da con trong gio hang hay chua
	public int indexOf(int idhh) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getIdhh() == idhh) {
				return i;
			}
		}	
		return -1;
	}
	
}
