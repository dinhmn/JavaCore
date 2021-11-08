package vn.devpro.bai7keThua.app01;

public class TamGiac extends DoanThang {

	private Diem C = new Diem();

	public void nhap() {
		super.nhap();
		System.out.println("Nhap toa do diem C");
		C.nhapDiem();
	}

	public void hienThi() {
//		Tinh do dai 3 canh cua tam giac
		double a = B.khoangCach(C);
		double b = A.khoangCach(C);
		double c = A.khoangCach(B);

		if (a > 0 && b > 0 && c > 0 && a + b > c && c + b > a && a + c > b) {
			double p = (a + b + c) / 2;
			double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			System.out.printf("Dien tich tam giac la %.3f %n", s);
		} else {
			System.out.println("Ba diem thang hang");
		}

	}

	public TamGiac() {
		super();
	}

	public TamGiac(Diem a, Diem b, Diem c) {
		super(a, b);
		C = c;
	}

	public Diem getC() {
		return C;
	}

	public void setC(Diem c) {
		C = c;
	}

}
