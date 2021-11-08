package vn.devpro.ba6.bai01;

import java.util.Scanner;

public class CarManagement {	
	

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car car = new Car(1, "Camry", "Toyota", "Sedan", 45000, "Thailand");
		int chon;
		do {
			System.out.println("\n-----------------THE CARS MANAGEMENT PROGRAMME--------------");
			System.out.println("Hay chon mot chuc nang quan ly");
			System.out.println("\t1. Hien thi o to");
			System.out.println("\t2. Sua cac thong tin cua o to");
			System.out.print("Nhap lua chon cua ban: ");
			chon = Integer.parseInt(sc.nextLine());
			
			switch (chon) {
			case 1:
				System.out.println("Thong tin ve o to ");
				System.out.println(car.toString());
				break;
			case 2:
//				System.out.println();
				car.suaThongTin();
				break;
			case 0: System.exit(0);
			default:
				break;
			}
		} while(true);
	}

}
