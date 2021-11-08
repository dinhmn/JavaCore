package vn.devpro.bai11FIle;

import java.io.File;
import java.io.IOException;

public class FIleDemo {

//	Tạo thư mục mới trên ổ đĩa
	public static void createFolder() {
		String path = "D:\\DevPro\\Java\\Classes\\Day13\\src\\vn\\devpro\\Java";
		File file = new File(path);
		String pathName = file.getName();
		if (file.exists()) {
			System.out.println("Thu muc " + pathName + " da ton tai tren dia");
		} else {
			file.mkdir();
			System.out.println("Thu muc " + pathName + " da duoc tao");
		}
	}
	
	public static void createFile() {
		String path = "D:\\DevPro\\Java\\Classes\\Day13\\src\\vn\\devpro\\Java\\INPUT.TXT";
		File file = new File(path);
		String fileName = file.getName();
		if (file.exists()) {
			System.out.println("Tep tin " + fileName + " da co trong thu muc");
		} else {
			try {
				file.createNewFile();
				System.out.println("Da tao file " + fileName + " trong thu muc");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Kich thuoc cua file " + fileName + " la: " + file.length());
	}
	
	public static void renameTo() {
		String source = "D:\\DevPro\\Java\\Classes\\Day13\\src\\vn\\devpro\\Java\\OUT.TXT";
		String destination = "D:\\DevPro\\Java\\Classes\\Day13\\src\\vn\\devpro\\Java\\INPUT.TXT";

		File sourceFile = new File(source);
		File destinationFile = new File(destination);
		String sourceName = sourceFile.getName();
		String destinationName = destinationFile.getName();
		if (!sourceFile.exists()) {
			System.out.println("Tep tin " + sourceName + " da co trong thu muc");
		} else {
			sourceFile.renameTo(destinationFile);
			System.out.println("File " + sourceName + " duoc doi thanh " + destinationName);
		}
//		System.out.println("Kich thuoc cua file " + fileName + " la: " + file.length());

	}
//	Liet ke cac thu muc con va cac file trong mot thu muc
	public static void readingDirectoryContents() {
		String path = "D:\\DevPro\\Java\\Classes";
		File file = new File(path);
		if (file.isDirectory() && file.exists()) {
			String[] contents = file.list();
			System.out.println("List of files and directories in " + file.getName() + " directory");
			for(String name : contents) {
				System.out.println(name);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		createFolder();
//		createFile();
		renameTo();
		readingDirectoryContents();
		
	}

}
