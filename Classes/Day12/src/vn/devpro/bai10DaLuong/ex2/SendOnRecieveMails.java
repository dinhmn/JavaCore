package vn.devpro.bai10DaLuong.ex2;

public class SendOnRecieveMails implements Runnable {

	private String action;
	private int times;
	
		
	public SendOnRecieveMails(String action, int times) {
		super();
		this.action = action;
		this.times = times;
	}

	@Override
	public void run() {
		for (int i = 1; i <= times; i++) {
			System.out.println("You are " + action + " an email");
		}
		
	}
}
