package vn.devpro.Bai6ClassAnhObject;

public class Car {

	private int id;
	private String brand;
	private double price;
	private String manufacturer;
	
	public Car(int id, String brand, double price, String manufacturer) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.manufacturer = manufacturer;
	}

	public Car() {
		this.id = 1;
		this.brand = "Vios";
		this.price = 25000;
		this.manufacturer = "Toyota";
	}
	
	public void display() {
		System.out.println("\tId: " + id);
		System.out.println("\tBrand: " + brand);
		System.out.println("\tPrice: " + price);
		System.out.println("\tManufacturer: " + manufacturer);
	}
	
	//Bam giu Alt + Shift bam S bam O
	
	
}
