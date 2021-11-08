package vn.devpro.Bai3CauTrucDieuKhien.Bai4;

import java.util.Scanner;

public class ThucThi {

	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choose;
		do {
			System.out.println("| =========Menu Bai Toan========== |");
			System.out.println("| Chon 1: Thuc hien bai toan 1.    |");
			System.out.println("| Chon 2: Thuc hien bai toan 2.    |");
			System.out.println("| Chon 3: Thuc hien bai toan 3.    |");
			System.out.println("| Chon 4: Thuc hien bai toan 4.    |");
			System.out.println("| Chon 5: Thuc hien bai toan 5.    |");
			System.out.println("| Chon 0: Thoat khoi chuong trinh. |");
			System.out.println("| -------------------------------- |");
			System.out.print("Nhap lua chon cua ban: ");
			choose = Integer.parseInt(scanner.nextLine());
			switch (choose) {
			case 1:
				BaiToan1.thucThi();
				break;
			case 2:
				BaiToan2.thucThi();
				break;
			case 3:
				BaiToan3.thucThi();
				break;
			case 4:
				BaiToan4.thucThi();
				break;
			case 5:
				BaiToan5.thucThi();
				break;
			case 0:
				System.out.println("Da thoat khoi chuong trinh");
				return;
			default:
				System.out.println("Lua chon cua ban khong hop le!\nVui long nhap lai.!!!!");
			}
			
		}while(true);
		
		
	}

}
