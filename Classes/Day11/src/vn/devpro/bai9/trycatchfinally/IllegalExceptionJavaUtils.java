package vn.devpro.bai9.trycatchfinally;

public class IllegalExceptionJavaUtils {

	public static void buy(Sach s, int buyAmount) {
		if (buyAmount > s.getAmount()) {
			throw new IllegalArgumentException("So luong sach khong du ban");
		}
		System.out.println("Ban da dat mua " + buyAmount + " cuon sach");
		s.setAmount(s.getAmount() - buyAmount);
	}

	public static void main(String[] args) {
		Sach s = new Sach("Java in application", 3);
		
		try {
			buy(s, 2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Cam on ban!");
		}
	}
	
}
