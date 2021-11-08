package vn.devpro.bai10DaLuong.ex1;

public class GotoSchoolUtils {

	public static void main(String[] args) {
//		Khai báo 3 luồng
		GotoSchool java = new GotoSchool(7);
		GotoSchool php = new GotoSchool(8);
		GotoSchool test = new GotoSchool(6);
		java.setName("Java web");
		php.setName("Lap trinh PHP");
		test.setName("Auto test 30");

		java.start();
		php.start();
		test.start();
		
	}

}
