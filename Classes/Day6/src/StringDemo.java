
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Doi tuyen Vien Nam dang thi dau";
		System.out.println("Length of str: " + str.length());
		System.out.println("First character: " + str.charAt(0));
		System.out.println("Index of 'V': " + str.indexOf('V'));
		System.out.println("Index of 'Nam': " + str.indexOf("Nam"));
		String str1 = str.concat(" va dang thua 1-0");
		System.out.println("New string: " + str1);
		if (str1.compareTo(str) > 0) {
			System.out.println("str1 > str or str1 xep sau str theo thu tu tu dien");
		}
		if (str.equals(str1)) {
			
		}
	}

}
