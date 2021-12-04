package 보충수업;

import java.util.Random;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int num1 = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("1~10 정수 입력 : ");
			int num = sc.nextInt();
			num1 = random.nextInt(10) + 1;
			if (num1 == num) {
				System.out.println("랜덤 수 : " + num1);
				System.out.println("정답 입력 수: " + num);
				break;
			}
			
		}
	}
}
