package vn.devpro.Bai6.Bai3;

//import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ThongTinSinhVien {

//	static DateTimeFormatter df = new DateTimeFormatter("dd/MM/yyyy");
	private String studentCode;
	private String studentName;
	private String studentDate;
	private String sector;
	private HocPhan[] subject;
	
//	public static LocalDate getDateFromString(String string, DateTimeFormatter format) {
//		return LocalDate.parse(string, format);
//	}
//	
	public void displayStudentInformation() {
//		LocalDate date;
//		try {
//			date = getDateFromString(studentDate, df);
//			
//		} catch (IllegalArgumentException e) {
// 
//            System.out.println("Exception: " + e);
//        }catch (DateTimeParseException e) {
// 
//            System.out.println("Exception: " + e);
//        }
		System.out.println("\n\t\t\t    BANG DIEM CA NHAN");
		System.out.println("Ma sinh vien: " + studentCode + "\t\tHo va ten: " + studentName);
		System.out.println("Ngay sinh: " + studentDate + "\t\tNganh: " + sector);
		System.out.printf("|%3s |%11s |%-30s |%10s |%13s |%n", "STT", "Ma hoc phan", "Ten hoc phan", "So tin chi", "Diem hoc phan");
	}
	
	public void display() {
		displayStudentInformation();
		for (int i = 0; i < subject.length; i++) {
			subject[i].setNumber(i);
			subject[i].showSubject();
		}
		System.out.printf("\t\t\t\t\t\t\t   Diem tong ket: %3.2f %n" , averageScore());
	}
	
	
	public ThongTinSinhVien() {
		super();
	}

	public ThongTinSinhVien(String studentCode, String studentName, String studentDate, String sector,
			HocPhan[] subject) {
		super();
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.studentDate = studentDate;
		this.sector = sector;
		this.subject = subject;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDate() {
		return studentDate;
	}

	public void setStudentDate(String studentDate) {
		this.studentDate = studentDate;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public HocPhan[] getSubject() {
		return subject;
	}

	public void setSubject(HocPhan[] subject) {
		this.subject = subject;
	}

	public void displayAStudyListUnderSix() {
		int dem = 0;
		System.out.println("Danh sach bang diem co mon duoi 6");
		displayStudentInformation();
		for (int i = 0; i < subject.length; i++) {
			if (subject[i].getSubjectPoint() < 6.0) {
				subject[i].setNumber(dem++);
				subject[i].showSubject();
			}
		}
		
	}
	public double averageScore() {
		double total = 0;
		double sumCreditNumber = 0;
		for (int i = 0; i < subject.length; i++) {
			total += subject[i].sumScore();
			sumCreditNumber += subject[i].getCreditNumber();
		}
		return total / sumCreditNumber;
	}


	public void suaThongTinSinhVien() {
		// TODO Auto-generated method stub
		int choose ;
		do {
			System.out.println("======================CHUC NANG SUA THONG TIN SINH VIEN==================");
			System.out.println(" 1. Sua ho ten");
			System.out.println(" 2. Sua ngay thang nam sinh");
			System.out.println(" 3. Sua nganh");
			System.out.println(" 0. Thoat");
			System.out.print("Nhap lua chon cua ban: ");
			choose = Integer.parseInt(QuanLiThongTin.scanner.nextLine());
			
			switch (choose) {
			case 1:
				System.out.print("Nhap ho ten moi cua sinh vien: ");
				setStudentName(QuanLiThongTin.scanner.nextLine());
				break;
			case 2: 
				System.out.print("Nhap ngay thang nam sinh moi: ");
				setStudentDate(QuanLiThongTin.scanner.nextLine());
				break;
			case 3: 
				System.out.print("Nhap nganh hoc moi: ");
				setSector(QuanLiThongTin.scanner.nextLine());
				break;
			case 0: return;
			default:
				System.out.println("Lua chon cua ban sai!");
			}
			
		} while (true);
	}

	public void suaThongTinTrongHocPhan() {
		// TODO Auto-generated method stub
		int choose;
		System.out.println("======================CHUC NANG SUA THONG TIN HOC PHAN==================");
		System.out.print("Nhap ma hoc phan can sua: ");
		String code = QuanLiThongTin.scanner.nextLine();
		int index = 0;
		while (index < subject.length && subject[index].getSubjectCode().compareTo(code) != 0) {
			index++;
		}
		
		if (index < subject.length) {
			do {
				System.out.println("Chon thong tin can sua");
				System.out.println(" 1. Sua ten hoc phan");
				System.out.println(" 2. Sua so tin chi");
				System.out.println(" 3. Sua diem hoc phan");
				System.out.println(" 0. Thoat");
				System.out.print("Nhap lua chon cua ban: ");
				choose = Integer.parseInt(QuanLiThongTin.scanner.nextLine());
				
				
				
				switch (choose) {
				case 1:
					System.out.print("Nhap ten hoc phan moi: ");
					subject[index].setSubjectName(QuanLiThongTin.scanner.nextLine());
					break;
				case 2:
					System.out.print("Nhap so tin chi moi: ");
					subject[index].setCreditNumber(Integer.parseInt(QuanLiThongTin.scanner.nextLine()));
					break;
				case 3:
					System.out.print("Nhap ten hoc phan: ");
					subject[index].setSubjectPoint(Double.parseDouble(QuanLiThongTin.scanner.nextLine()));
					break;
				case 0: return;
				default:
					System.out.println("Ban chon lai di");
				}
				
			} while (true);
		} else {
			System.out.println("Ma hoc phan khong ton tai trong danh sach");
		}
		

	}
	
	
	
	
}
