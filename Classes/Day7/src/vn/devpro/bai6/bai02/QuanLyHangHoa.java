package vn.devpro.bai6.bai02;

import java.util.Scanner;

public class QuanLyHangHoa {

	public static void main(String[] args) {
		// Khoi tao danh sach hang hoa
		HangHoa[] list = {
				new HangHoa(101, "My tom", 10, 6500),
				new HangHoa(102, "Bim bim", 20, 7000),
				new HangHoa(103, "Bot giat Omo", 15, 15000),
				new HangHoa(104, "Coca Cola", 30, 5000),
				new HangHoa(105, "Gao lut", 20, 20000)
		};
		
		Phieu phieu = new Phieu(10001, "Hoang A Ma", "0987513452", "Hoang Mai - Ha Noi", list

				);
		
		// Dung menu
		int chon;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n================CHUONG TRINH QUAN LI BAN HANG=================");
			System.out.println("Chon mot chuc nang quan ly");
			System.out.println("\t1. Hien thi phieu mua hang");
			System.out.println("\t2. Sua thong tin phieu mua hang");
			System.out.println("\t3. Sua thong tin hang hoa trong phieu mua hang");
			System.out.println("\t0. Thoat");
			System.out.print("Nhap lua chon cua ban: ");
			chon = Integer.parseInt(sc.nextLine());
			
			switch (chon) {
			case 1:
				phieu.display();
				break;
			case 2:
				phieu.suaThongTinPhieu();
				break;
			case 3:
				phieu.suaThongTinHangTrongPhieu();
				break;
			case 0: System.exit(0);
			default:
				System.out.println("Lua chon khong hop le!!");
			}
		} while (true);

	}

}
