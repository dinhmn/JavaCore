package vn.devpro.ba6.bai01;

public class Car {

	private int id;
	private String brand;
	private String manufacturer;
	private String style;
	private double price;
	private String origin;
	
	public Car() {
		super();
	}
	public Car(int id, String brand, String manufacturer, String style, double price, String origin) {
		super();
		this.id = id;
		this.brand = brand;
		this.manufacturer = manufacturer;
		this.style = style;
		this.price = price;
		this.origin = origin;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", manufacturer=" + manufacturer + ", style=" + style + ", price="
				+ price + ", origin=" + origin + "]";
	}
	public void suaThongTin() {
		// TODO Auto-generated method stub
		int chon;
		do {
			System.out.println("\n-------------CHUC NANG SUA THONG TIN O TO-----------------");
			System.out.println("Chon thong tin o to can sua.");
			System.out.println("\t1. Sua nhan hieu.");
			System.out.println("\t2. Sua hang san xuat.");
			System.out.println("\t3. Sua kieu dang.");
			System.out.println("\t4. Sua gia tien.");
			System.out.println("\t5. Sua xuat xu.");
			System.out.println("\t0. Quay lai.");
			
			System.out.println("Nhap lua chon cua ban: ");
			chon = Integer.parseInt(CarManagement.sc.nextLine());
			
			switch (chon) {
			case 1:
				System.out.println("Nhap nhan hieu moi: ");
				setBrand(CarManagement.sc.nextLine());
				break;
			case 2:
				System.out.println("Nhap nha san xuat moi: ");
				setManufacturer(CarManagement.sc.nextLine());
				break;
			case 3:
				System.out.println("Nhap kieu dang moi: ");
				setStyle(CarManagement.sc.nextLine());
				break;
			case 4:
				System.out.println("Nhap gia tien moi: ");
				setPrice(Double.parseDouble(CarManagement.sc.nextLine()));
				break;
			case 5:
				System.out.println("Nhap xuat xu moi: ");
				setOrigin(CarManagement.sc.nextLine());
				break;
			case 0: return;
			default:
				System.out.println("Lua chon khong hop le");
//				break;
			}
			
			
		}while(true);
		
		
	}
	
	

	
	
	
	
	
	
}
