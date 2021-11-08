package vn.devpro.Bai4MangVaChuoi.Bai2;

import java.util.Iterator;
import java.util.Scanner;

public class Vocabulary {
	static Scanner scanner = new Scanner(System.in);
	static String[] str;
	
	public static void inputWords() {
		System.out.print("Enter the English number is: ");
		int n = Integer.parseInt(scanner.nextLine());
		str = new String[n];
		for (int i = 0; i < str.length; i++) {
			System.out.print("Type from the thing " + (i + 1) + ": ");
			str[i] = scanner.nextLine();
		}
	}
	public static void showWords() {
		System.out.println("\nShow the string array");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}
	public static boolean search(String a, String b) {
		if ( a.compareTo(b) == 0) {
			return true;
		} else {
			return false;
		}		
	}
	public static void searchOneWordInTheList() {
		String st;
		System.out.print("\nEnter the word one is: ");
		st = (scanner.nextLine()).replaceAll(" ", "");
		boolean b = false;
		for (int i = 0; i < str.length; i++) {
			if (search(str[i], st)) {
//				System.out.println("There is a word to search"+ st +" in the chain");
				b = true;
				break;
			}
			else {
				continue;
			}
		}
		if (b) {
			System.out.println("There is a word to search"+ st +" in the chain");
		}else {
			System.out.println("Not exists word to search" + st + " in the chain");
		}
	}
	public static void swap(String a, String b) {
		String temp = a;
				a = b;
				b = temp;
	}
	public static void sortWordList() {
		System.out.println("\nList after sorting");
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if ( (str[i].substring(0, 1)).compareTo(str[j].substring(0, 1)) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputWords();
		showWords();
		searchOneWordInTheList();
		sortWordList();
		showWords();
	}

}
