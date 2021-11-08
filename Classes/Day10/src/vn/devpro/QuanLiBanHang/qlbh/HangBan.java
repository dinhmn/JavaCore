package vn.devpro.QuanLiBanHang.qlbh;

import vn.devpro.QuanLiBanHang.qlhh.QLHH;

public class HangBan {

	private int idhh;
	private double amount;
	
	public void display() {
		int index = QLHH.indexOf(idhh);
		if (index == -1) {
			return;
		}
		String name = QLHH.list.get(index).getName();
		double price = QLHH.list.get(index).getPrice();
		double total = amount * price;
		System.out.printf("%-30s %8.2f %13.2f %14.2f %n", 
				name, amount, price, total);
	}
	
	public double total() {
		int index = QLHH.indexOf(idhh);
		if (index == -1) {
			return 0;
		}
		return amount * QLHH.list.get(index).getPrice();
	}
	
	
	public HangBan() {
		super();
	}
	public HangBan(int idhh, double amount) {
		super();
		this.idhh = idhh;
		this.amount = amount;
	}
	public int getIdhh() {
		return idhh;
	}
	public void setIdhh(int idhh) {
		this.idhh = idhh;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
