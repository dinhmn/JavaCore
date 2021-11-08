package vn.devpro.Bai6.Bai3;

import java.util.Scanner;

public class QuanLiThongTin {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HocPhan[] hocPhan = {new HocPhan("0503127", "CSDL", 3, 7.5),
							new HocPhan("0503130", "Ky thuat lap trinh", 4, 6.6),
							new HocPhan("0503174", "Lap trinh huong doi tuong", 3, 8.2),
							new HocPhan("0503164", "Toan roi rac", 4, 9.5),
							new HocPhan("0503168", "Tri tue nhan tao", 3, 9.5),
							new HocPhan("0503146", "He quan tri", 3, 5),
							new HocPhan("0503189", "Thiet ke phan mem", 4, 5.7)};
		ThongTinSinhVien sinhVien = new ThongTinSinhVien("1001222", "Nguyen Van B", "21/08/1998", "Khoa hoc may tinh", hocPhan);

		int chon;
		do {
			System.out.println("=========================MENU LUA CHON=========================");
			System.out.println(" 1. Hien thi bang diem.");
			System.out.println(" 2. Hien thi danh sach hoc phan duoi 6.0 .");
			System.out.println(" 3. Sua thong tin sinh vien. ");
			System.out.println(" 4. Sua thong tin hoc phan. ");
			System.out.println(" 0. Thoat khoi chuong trinh.");
			System.out.print("Nhap lua chon cua ban: ");
			chon = Integer.parseInt(scanner.nextLine());
			
			switch (chon) {
			case 1:
				sinhVien.display();
				break;
			case 2:
				sinhVien.displayAStudyListUnderSix();
				break;
			case 3:
				sinhVien.suaThongTinSinhVien();
				break;
			case 4:
				sinhVien.suaThongTinTrongHocPhan();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Lua chon cua ban sai.");
				break;
			}
		} while (true);
		
	}

}
