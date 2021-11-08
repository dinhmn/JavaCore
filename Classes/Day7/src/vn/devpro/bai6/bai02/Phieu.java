package vn.devpro.bai6.bai02;

import java.util.Scanner;
	
public class Phieu {
	
	private int id;
	private String customerName;
	private String phone;
	private String address;
	private HangHoa[] list;
	
	public void display() {
		System.out.println("\t\tPHIEU MUA HANG");
		System.out.println("\tMa phieu: " + id + "\tKhach hang: " + customerName);
		System.out.println("\tDien thoat: " + phone + "\tDia chi: " + address);
		System.out.println("\tDANH SACH HANG HOA");
		System.out.printf("%3s %-5s %-25s %8s %-13s %15s %n", "STT", "id", "Ten hang", "So luong",
				"Don gia", "Thanh tien");
		double tongTT = 0;
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%-3d ", i + 1);
			list[i].display();
			tongTT += list[i].money();
		}
		System.out.printf("\nTong thanh tien: %.2f %n", tongTT);
	}

	public void suaThongTinPhieu() {
		// TODO Auto-generated method stub
		
		int chon;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n-----------------CHUC NANG SUA THONG TIN PHIEU MUA HANG--------------------");
			System.out.println("Chon thong tin can sua tren phieu");
			System.out.println("\t1. Sua ten khach hang");
			System.out.println("\t2. Sua so dien thoai khach hang");
			System.out.println("\t3. Sua dia chi khach hang");
			System.out.println("\t0. Quay lai");
			System.out.print("Nhap lua chon cua ban: ");
		
			chon = Integer.parseInt(sc.nextLine());
			
			switch (chon) {
			case 1:
				System.out.print("Nhap ten moi cho khach hang: ");
				setCustomerName(sc.nextLine());
				break;
			case 2:
				System.out.print("Nhap SDT moi cho khach hang: ");
				setPhone(sc.nextLine());
			case 3:
				System.out.print("Nhap dia chi moi cho khach hang: ");
				setAddress(sc.nextLine());
			case 0:
				return;
			default:
				System.out.println("Nhap sai lua chon");
			}
			
			
		} while (true);
	}

	public void suaThongTinHangTrongPhieu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n--------------CHUC NANG SUA THONG TIN HANG HOA TRONG PHIEU--------------");
		System.out.print("Nhap ma hang can sua: ");
		int id = Integer.parseInt(sc.nextLine());
		// Tim trong danh sach hang cua phieu co hang hoa nao voi id vua nhap khum
		int index = 0;
		while (index < list.length && list[index].getId() != id) {
			index++;
		}
		if (index < list.length) {
			// co hang trong danh sach
			do {
				System.out.println("Chon thong tin can sua");
				System.out.println("\t1. Sua ten hang");
				System.out.println("\t2. Sua so luong");
				System.out.println("\t3. Sua don gia");
				System.out.println("\t0. Quay lai");
				System.out.print("Nhap lua chon cua ban: ");
				int chon = Integer.parseInt(sc.nextLine());
				
				switch (chon) {
				case 1:
					System.out.print("Nhap ten moi cua hang: ");
					list[index].setName(sc.nextLine());
					break;
				case 2:
					System.out.print("Nhap so luong moi cua hang: ");
					list[index].setAmount(Double.parseDouble(sc.nextLine()));
					break;
				case 3:
					System.out.print("Nhap don gia moi cua hang: ");
					list[index].setPrice(Double.parseDouble(sc.nextLine()));
					break;
				case 0: return;
				default:System.out.println("Lua chon cua ban sai!");
				
			}
			}while (true);
		}else {
			System.out.println("Hang hoa khong co trong danh sach");
		}
	}
	
	public Phieu() {
		super();
	}
	
	public Phieu(int id, String customerName, String phone, String address, HangHoa[] list) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.phone = phone;
		this.address = address;
		this.list = list;
	}

	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public HangHoa[] getList() {
		return list;
	}

	public void setList(HangHoa[] list) {
		this.list = list;
	}



}
