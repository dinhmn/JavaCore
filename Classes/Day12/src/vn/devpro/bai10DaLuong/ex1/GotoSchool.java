package vn.devpro.bai10DaLuong.ex1;

import java.util.Iterator;

public class GotoSchool extends Thread {

	private int amount;

	public GotoSchool(int amount) {
		super();
		this.amount = amount;
	}
	
	@Override
	public void run() {
		
		try {
			for (int i = 1; i <= amount; i++) {
				System.out.println("Hoc vien thu " + i + " lop " + getName() + " den");
			}
			Thread.sleep(50);
		} catch (InterruptedException e) {
			System.out.println("Thread " + getName() + " is interrupted");
		}		
	}	
}
