package vn.devpro.bai10DaLuong.ex2;

public class SendOrRecieveMailsUtils {

	public static void main(String[] args) {
		SendOnRecieveMails runableSend = new SendOnRecieveMails("Sending", 10) ;
		SendOnRecieveMails runableReceive = new SendOnRecieveMails("Receiving", 12);
		Thread send = new Thread(runableSend);
		Thread receive = new Thread(runableReceive);
		send.start();
		receive.start();

	}

}
