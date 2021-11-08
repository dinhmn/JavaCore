package vn.devpro.Bai6ClassAnhObject;

public class CarManagement {

	public static void main(String[] args) {
		// Su dung constructor khong doi
		Car toy = new Car();
		System.out.println("Caf of Toyota");
		toy.display();
		
		
//		Su dung constructor co doi
		Car maz = new Car(2, "CX5", 32000, "Mazda");
		System.out.println("Mazda car");
		maz.display();
		
	}

}
