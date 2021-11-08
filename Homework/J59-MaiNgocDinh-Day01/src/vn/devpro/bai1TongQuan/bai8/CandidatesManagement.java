package vn.devpro.bai1TongQuan.bai8;

public class CandidatesManagement {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Candidate candidate = new Candidate();
		Subject subject1 = new Subject();
		Subject subject2 = new Subject();
		Subject subject3 = new Subject();
		
		candidate.inputInformationOfCandidate();
		subject1.inputInformationOfSubject();
		subject2.inputInformationOfSubject();
		subject3.inputInformationOfSubject();

		double s = subject1.totalPoints() + subject2.totalPoints() + subject3.totalPoints();
		System.out.printf("%-8s %-23s %-10s %n", "Code", "Name", "DaOB");
		
		candidate.showInformationOfCandidate();
		
		System.out.printf("Total points: %3.2f", s);
		

	}

}
