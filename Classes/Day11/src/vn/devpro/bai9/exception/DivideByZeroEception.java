package vn.devpro.bai9.exception;

public class DivideByZeroEception extends Exception{

	private String message;

	public DivideByZeroEception() {
		super();
	}

	public DivideByZeroEception(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
