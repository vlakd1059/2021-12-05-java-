package 爾醱熱機;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int count2=0;
		for (int i=1;i<=5;i++) {     
			System.out.print("璋濠 殮溘 >> ");
			int num= sc.nextInt();
			if(num%2==0) {
				count++;
				System.out.println("�汝� 偃熱: "+count2);
				System.out.println("礎熱 偃熱: "+count);
			}
			else {
				count2++;
				System.out.println("�汝� 偃熱: "+count2);
				System.out.println("礎熱 偃熱: "+count);
			}
		}
	}
}
