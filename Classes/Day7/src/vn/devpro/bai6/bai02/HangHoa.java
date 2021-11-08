package vn.devpro.bai6.bai02;

public class HangHoa {

	private int id;
	private String name;
	private double amount;
	private double price;
	
	public double money() {
		return amount * price;
	}
	
	public void display() {
		System.out.printf("%-5d %-25s %8.2f %,13.2f %15.2f %n", 
				id, name, amount, price, money());
	}
	

	public HangHoa() {
		super();
	}

	public HangHoa(int id, String name, double amount, double price) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
//	


	
	
}
