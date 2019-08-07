package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("금액: ");
		int money = scanner.nextInt();
		scanner.close();

		int[] won = new int[10];

		int s1 = money / 50000;

		if (s1 != 0) {
			money = money - (s1 * 50000);
			won[0] = s1;
		}

		int s2 = money / 10000;

		if (s2 != 0) {
			money = money - (s2 * 10000);
			won[1] = s2;
		}

		int s3 = money / 5000;

		if (s3 != 0) {
			money = money - (s3 * 5000);
			won[2] = s3;
		}

		int s4 = money / 1000;

		if (s4 != 0) {
			money = money - (s4 * 1000);
			won[3] = s4;
		}

		int s5 = money / 500;

		if (s5 != 0) {
			money = money - (s5 * 500);
			won[4] = s5;
		}

		int s6 = money / 100;

		if (s6 != 0) {
			money = money - (s6 * 100);
			won[5] = s6;
		}

		int s7 = money / 50;

		if (s7 != 0) {
			money = money - (s7 * 50);
			won[6] = s7;
		}

		int s8 = money / 10;

		if (s8 != 0) {
			money = money - (s8 * 10);
			won[7] = s8;
		}

		int s9 = money / 5;

		if (s9 != 0) {
			money = money - (s9 * 5);
			won[8] = s9;
		}
		
		int s10 = money / 1;

		if (s9 != 0) {
			money = money - (s10 * 1);
			won[9] = s10;
		}
		
		System.out.println("50000원 : " + won[0] + "개");
		System.out.println("10000원 : " + won[1] + "개");
		System.out.println("5000원 : " + won[2] + "개");
		System.out.println("1000원 : " + won[3] + "개");
		System.out.println("500원 : " + won[4] + "개");
		System.out.println("100원 : " + won[5] + "개");
		System.out.println("50원 : " + won[6] + "개");
		System.out.println("10원 : " + won[7] + "개");
		System.out.println("5원 : " + won[8] + "개");
		System.out.println("1원 : " + won[9] + "개");

	}
}