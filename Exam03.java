package º¸Ãæ¼ö¾÷;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int count2=0;
		for (int i=1;i<=5;i++) {     
			System.out.print("¼ýÀÚ ÀÔ·Â >> ");
			int num= sc.nextInt();
			if(num%2==0) {
				count++;
				System.out.println("È¦¼ö °³¼ö: "+count2);
				System.out.println("Â¦¼ö °³¼ö: "+count);
			}
			else {
				count2++;
				System.out.println("È¦¼ö °³¼ö: "+count2);
				System.out.println("Â¦¼ö °³¼ö: "+count);
			}
		}
	}
}
