package vn.devpro.bai7TruuTuong.app05;

import java.util.Scanner;

public abstract class NhanVien {

	protected String maNv;
	protected String hoTen;
	protected int namVaoLam;
	
	static Scanner sc = new Scanner(System.in);
	
	public void nhap() {
		System.out.print("\tMa nv: "); maNv = sc.nextLine();
		System.out.print("\tHo ten: "); hoTen = sc.nextLine();
		System.out.print("\tNam va lam: "); namVaoLam = Integer.parseInt(sc.nextLine());
	}
	
	public void hienThi() {
		System.out.printf("%-12s %-25s %11d ", maNv, hoTen, namVaoLam);
	}
	
	
	public NhanVien() {
		super();
	}

	public abstract double luong();
	
	public NhanVien(String maNv, String hoTen, int namVaoLam) {
		super();
		this.maNv = maNv;
		this.hoTen = hoTen;
		this.namVaoLam = namVaoLam;
	}

	public String getMaNv() {
		return maNv;
	}

	public void setMaNv(String maNv) {
		this.maNv = maNv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamVaoLam() {
		return namVaoLam;
	}

	public void setNamVaoLam(int namVaoLam) {
		this.namVaoLam = namVaoLam;
	}
	
	
	
}
