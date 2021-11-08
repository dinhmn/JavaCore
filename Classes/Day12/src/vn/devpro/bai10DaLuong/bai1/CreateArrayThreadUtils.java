package vn.devpro.bai10DaLuong.bai1;

public class CreateArrayThreadUtils {

	
	public static void main(String[] args) {
		CreateArrayThread oddIndex = new CreateArrayThread(1, 4);
		CreateArrayThread evenIndex = new CreateArrayThread(0, 7);
		oddIndex.start();
		evenIndex.start();
		
		try {
			while(oddIndex.isAlive() || evenIndex.isAlive()) {
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Mang vua tao: ");
		CreateArrayThread.display();
		
		
		
	}
}
