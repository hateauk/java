package scannerTest;

import java.util.Scanner;

public class ScannerConsoleEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("�Է� : ");
		Scanner scan =new Scanner(System.in);
		int number=scan.nextInt();
		System.out.printf("��ĵ: %d", number);
		
		scan.close();

	}

}
