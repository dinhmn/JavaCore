package Test;

public class Employ {
//		String name;
//		int hoursWorked;
//		float hourlyRate;
//		float tax;
//		float grossPay;
//		float netPay;		
//		public Employ(String name, int hoursWorked, float hourlyRate){
//			this.name = name;
//			this.hoursWorked = hoursWorked;
//	        this.hourlyRate= hourlyRate;
//		}		
//		public String getName(){
//			return name;
//		}		
//		public void calculatePay(){
//			int payableHours;			
//			if( hoursWorked < 40){
//				payableHours = hoursWorked;
//			}else{
//				payableHours = 40 + (hoursWorked - 40)* 3/2;
//			}			
//			grossPay = payableHours * hourlyRate;
//			
//	        if(grossPay > 200){
//				tax = (grossPay - 200)* 20/100;
//
//			}			
//			netPay = grossPay - tax;
//			System.out.printf("Gross: %.2f%n", grossPay);
//			System.out.printf("Tax: %.2f%n", tax);
//			System.out.printf("Net: %.2f%n", netPay);
//			System.out.println("--------------------");
//		}// end calculatePay()
		String name;
		int hoursWorked;
		float hourlyRate;
		float tax;
		float grossPay;
		float netPay;
		
		public Employ(String name, int hoursWorked, float hourlyRate){
			this.name = name;
			this.hoursWorked = hoursWorked;
	           this.hourlyRate= hourlyRate;
		}
		
		public String getName(){
			return name;
		}
		
		public void calculatePay(){
			int payableHours;
			
			if( hoursWorked < 40){
				payableHours = hoursWorked;
			}else{
				payableHours = 40+(hoursWorked - 40)* 3/2;
			}
			
			grossPay = payableHours * hourlyRate;
			
	           if(grossPay > 200){
				tax = (grossPay -200) * 20/100;
			}
			
			netPay = grossPay - tax;
			System.out.printf("Gross: %.2f%n", grossPay);
			System.out.printf("Tax: %.2f%n", tax);
			System.out.printf("Net: %.2f%n", netPay);
			System.out.println("--------------------");
		}// end calculatePay()


}
