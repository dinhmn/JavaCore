package Test;

public class Main {
	public static void main(String[] args) {
		Employ admas = new Employ("ADAMS", 35, 5);
		Employ baker = new Employ("BAKER", 40, 5);
		Employ cairns = new Employ("CAIRNS", 44, 5);
		Employ donald = new Employ("ADAMS", 20, 6);
		
		
		admas.calculatePay();
		baker.calculatePay();
		cairns.calculatePay();
		donald.calculatePay();
	}
}
