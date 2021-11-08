package vn.devpro.Bai3_4.Bai3;

import java.util.Scanner;

public class ThucThiCacBaiToan {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choose;

		do {
		System.out.println("=============Program to solve problems=============");
		System.out.println("\tChoose 1: Perform problem 1.");
		System.out.println("\tChoose 2: Perform problem 2.");
		System.out.println("\tChoose 3: Perform problem 3.");
		System.out.println("\tChoose 4: Perform problem 4.");
		System.out.println("\tChoose 0: Get out of the show.");
		System.out.print("Enter your choice: ");
		choose = Integer.parseInt(scanner.nextLine());
	
			switch (choose) {
			case 1:
				GiaiThua.thucHien();
				break;
			case 2: 
				SoDaoNguoc.thucHien();
				break;
			case 3:
				ImuX.thucHien();
				break;
			case 4:  break;
			case 0:
				System.out.println("\nExited the program.");
				return;
			default:
				System.out.println("\nYour choice is wrong.");
			}
		}while(true);
		
	}

}
