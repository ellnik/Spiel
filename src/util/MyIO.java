package util;


import java.util.Scanner;

/**
 * Die Klasse beinhaltet Methoden zur Konsoleneingabe/Ausgabe
 */
public class MyIO {
 
	public static Scanner scan = new Scanner(System.in);
	
	public static void write(String arg) {
		System.out.println(arg);
	}
	
	public static String read() {
		String text = scan.next();
		return text;
	}
	
	public static int readInt() {
		int number = scan.nextInt();
		return number;
	}
	
	public static int readInt(String info) {
		 write(info);
		int number = scan.nextInt();
		return number;
	}
}
