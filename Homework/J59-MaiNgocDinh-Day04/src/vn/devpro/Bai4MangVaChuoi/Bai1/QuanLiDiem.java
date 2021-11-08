package vn.devpro.Bai4MangVaChuoi.Bai1;

import java.util.Scanner;

public class QuanLiDiem {

	static Scanner scanner = new Scanner(System.in);
	static double diemToan;
	static double diemVan;
	static double diemTa;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choose;
		do {
			System.out.println("|============== Menu Hien Thi ================|");
			System.out.println("| Chon 1: Nhap diem cac thi sinh.             |");
			System.out.println("| Chon 2: Hien thi tong diem chua sap xep.    |");
			System.out.println("| Chon 3: Hien thi tong diem theo chieu tang. |");
			System.out.println("| Chon 4: Hien thi 5 thi sinh tong diem max.  |");
			System.out.println("| Chon 0: Thoat khoi chuong trinh.            |");
			System.out.println("|---------------------------------------------|");
			System.out.print("Nhap tuy chon cua ban: ");
			choose = Integer.parseInt(scanner.nextLine());
			
			switch (choose) {
			case 1:

				Diem.nhap(Diem.a);
				break;
			case 2: 
				Diem.hienThiTongDiem(Diem.a);
				break;
			case 3: 
				Diem.hienThiSauKhiSapXep(Diem.a);
				break;
			case 4:
				Diem.hienThi5Max(Diem.a);
				break;
			case 0:
				System.out.println("Da thoat khoi chuong trinh.");
				return;
			default:
				System.out.println("Nhap sai tuy chon.\nVui long nhap lai!!!!");
				break;
			}
		}while (true);



	}
	

}
