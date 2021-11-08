package vn.devpro.Bai4MangVaChuoi.Bai1;

public class Diem {

	static double diemToan;
	static double diemVan;
	static double diemTa;
	static Diem[] a = new Diem[10];
	static int n;
	
	
	
	public static void nhap(Diem[] a) {
		System.out.print("Nhap so thi sinh: ");
		n = Integer.parseInt(QuanLiDiem.scanner.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap diem thi sinh thu: " + (i + 1));
			System.out.print("Diem Toan = "); a[i].diemToan = Double.parseDouble(QuanLiDiem.scanner.nextLine());
			System.out.print("Diem Van = "); a[i].diemVan = Double.parseDouble(QuanLiDiem.scanner.nextLine());
			System.out.print("Diem Anh = "); a[i].diemTa = Double.parseDouble(QuanLiDiem.scanner.nextLine());
		}
		
	}
	
	public static double total() {
		return diemToan + diemVan + 2 * diemTa;
	}
	
	public static void hienThiTongDiem(Diem[] a) {
		System.out.println(n);
		// TODO Auto-generated method stub
		System.out.println("============Hien thi tong diem==========");
		System.out.printf("%-3s %-8s %n", "STT", "TongDiem");
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d %.2f %n", (i + 1), a[i].total());
		}
	}
	public static void hienThi(Diem[] a) {
		System.out.println("=========== Hien thi ===========");
		System.out.printf("%-3s %-5s %-5s %-5s %-5s %n", "STT", "Toan", "Van", "Anh", "Tong");
		for (int i = 0; i < n ; i++) {
			System.out.printf("%-3d %5.2f %5.2f %5.2f %5.2f %n",
					(i + 1), a[i].diemToan, a[i].diemVan, a[i].diemTa, a[i].diemToan + a[i].diemVan + a[i].diemTa * 2);
		}
	}


	public static Diem swap(Diem a, Diem b) {
		Diem temp = a;
			 a = b;
			 return b = temp;
	}
	public static void hienThiSauKhiSapXep(Diem[] a) {
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n - i; j++) {
				if (a[j].total() > a[j+1].total()) {
					Diem temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			
		}
		hienThi(a);
	}
	public static void hienThi5Max(Diem[] a) {
		int dem = 1;
		System.out.printf("%-3s %-8s %n", "STT", "TongDiem");
		for (int i = n ; i > 0 ; i--) {
			if ( i < n - 5) {
				break;
			}else {
				System.out.printf("%3d %.2f %n", (dem++), a[i].total());
			}
		}
	}
	
		
	
}
