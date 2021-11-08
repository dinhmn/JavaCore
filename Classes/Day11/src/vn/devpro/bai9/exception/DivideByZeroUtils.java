package vn.devpro.bai9.exception;

public class DivideByZeroUtils {

	public static void dividing(double a, double b) throws DivideByZeroEception {
		if (b==0) {
			throw new DivideByZeroEception("Loi: So chia bang 0");
		}
		double d = a / b;
		System.out.printf("Result: %.3f", d);
	}
	
	public static void main(String[] args) {
		double a = 4, b = 0;
		
		try {
			dividing(a, b);
		} catch (DivideByZeroEception e) {
			System.out.println(e.getMessage());
		}
	}
}
