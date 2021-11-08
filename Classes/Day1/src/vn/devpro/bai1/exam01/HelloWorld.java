package vn.devpro.bai1.exam01;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		int x = 5, y = 5, a, b, k, m;

		x++;y--;
		System.out.printf("\n%d %d", x, y);
		a = x++ ; b = y--;
		System.out.printf("\n%d %d", a, b);
		a = ++a ; b = --y;
		System.out.println("\n%d %d");
		k = x++ + --y;
		System.out.printf("\n%d", k);
		m = ++x + --y;
		System.out.printf("\n%d", m);
	}

}
