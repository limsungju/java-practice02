package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		int cnt = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("금액: ");
		int money = scanner.nextInt();
		scanner.close();

		int[] won = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[] wallet = new int[won.length];
		
		for(int i=0; i<won.length; i++) {
			cnt = money/won[i];
			wallet[i] = cnt;
			money = money-(won[i]*wallet[i]);
			System.out.println(won[i] + "원 : " + wallet[i] + "개");
		}
	}
}