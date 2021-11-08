package vn.devpro.bai3CauTrucDieuKhien;

import java.util.Scanner;

public class Problem2 {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose;

		do {
		System.out.println("=============Program to solve problems=============");
		System.out.println("\t--------------------------------");
		System.out.println("\t|Choose 1: Perform problem 1.   |");
		System.out.println("\t|Choose 2: Perform problem 2.   |");
		System.out.println("\t|Choose 3: Perform problem 3.   |");
		System.out.println("\t|Choose 4: Perform problem 4.   |");
		System.out.println("\t|Choose 0: Get out of the show. |");
		System.out.println("\t--------------------------------");
		System.out.println("===================================================");
		System.out.print("Enter your choice: ");
		choose = Integer.parseInt(scanner.nextLine());
	
			switch (choose) {
			case 1: 
				ReadNumber.thucThi();
				break;
			case 2: problem2(); break;
			case 3: 
				
				break;
			case 4: problem4(); break;
			case 0:
				System.out.println("\nExited the program.");
				return;
			default:
				System.out.println("\nYour choice is wrong.");
			}
		}while(true);
		
		
		
	}

	private static void problem1() {
		// TODO Auto-generated method stub
		int x;
		do {
			System.out.println("Enter a natural number (0 -> 9): ");		
			x = Integer.parseInt(scanner.nextLine());
		} while (x < 0 || x > 9);

		if ( x == 1) {
			System.out.println("So mot");
		}
		else if ( x == 2) {
			System.out.println("So hai");
		}
		else if ( x == 3) {
			System.out.println("So ba");
		}
		else if ( x == 4) {
			System.out.println("So bon");
		}
		else if ( x == 5) {
			System.out.println("So nam");
		}
		else if ( x == 6) {
			System.out.println("So sau");
		}
		else if ( x == 7) {
			System.out.println("So bay");
		}
		else if ( x == 8) {
			System.out.println("So tam");
		}
		else if ( x == 9) {
			System.out.println("So chin");
		}
		else{
			System.out.println("So khong");
		}
		
		
	}

	private static void problem2() {
		double y = 0;
		double x;
		System.out.println("Enter the value: ");
		x = Double.parseDouble(scanner.nextLine());
		
		if ( x > 2 && x < 3) {
			y = 5 * Math.cos(3 * x + 2) - Math.log(Math.pow(x, 2) + 2);
		} 
		else if ( x >= 3) {
			y = Math.pow((x + 2), 2);
		}
		else {
			y = 1;
		}
		
		System.out.printf("\nThe value of y is: %.2f %n", y);
		
	}

	private static void problem4() {
		// TODO Auto-generated method stub
		double xA, yA;
		double xB, yB;
		double xC, yC;
		double xAB, yAB, xAC, yAC, xBC, yBC;
		double AB, AC, BC, C, p, S1;
		System.out.print("\nEnter point coordinates A: ");
		xA = Double.parseDouble(scanner.nextLine());
		yA = Double.parseDouble(scanner.nextLine());
		System.out.print("\nEnter point coordinates B: ");
		xB = Double.parseDouble(scanner.nextLine());
		yB = Double.parseDouble(scanner.nextLine());
		System.out.print("\nEnter point coordinates C: ");
		xC = Double.parseDouble(scanner.nextLine());
		yC = Double.parseDouble(scanner.nextLine());
		
		if ((xA == xB && yA == yB) || (xB == xC && yB == yC) || (xA == xC && yA == yC)) {
			System.out.println("A, B, C can overlap so they don't form a triangle.!");
			System.out.println("Please check again.");
		}
		xAB = xB - xA;
		yAB = yB - yA;
		xAC = xC - xA;
		yAC = yC - yA;
		xBC = xC - xB;
		yBC = yC - yB;
		if ((xAB / xBC) == (yAB / yBC))
		{
			System.out.println("A, B, C can overlap so they don't form a triangle.!");
			System.out.println("Please check again.");
		}
		System.out.println("Abc's triangle coordinates are");
		System.out.printf("A(%2.1f %2.1f) B(%2.1f %2.1f) C(%2.1f %2.1f) %n", xA, yA, xB, yB, xC, yC);
		AB = Math.sqrt(xAB*xAB + yAB*yAB);
		AC = Math.sqrt(xAC*xAC + yAC*yAC);
		BC = Math.sqrt(xBC*xBC + yBC*yBC);
		
		System.out.printf("AB = %2.1f %nAC = %2.1f %nBC = %2.1f %n", AB, AC, BC);
		C = AB + AC + BC;
		p = C / 2;
		S1 = Math.sqrt(p* (p - AB) * (p - AC) * (p - BC));
		double R = (AB * AC * BC) / (4 * S1);
		System.out.printf("The triangular circumference is: C = %2.2f%n", C);
		System.out.printf("The triangular area is: S1 = %2.2f%n", S1);
		System.out.printf("The radius of the outer circle is: R = %2.2f%n", R);
		
		
	}

}
