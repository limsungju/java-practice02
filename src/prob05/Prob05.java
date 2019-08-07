package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		boolean coin = true;
		int minScore = 1;
		int maxScore = 100;
		int answer = 0;
		String chk;
		int cnt = 1;
		
		Scanner scanner = new Scanner( System.in );
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		Random r = new Random();
		int correctNumber = r.nextInt(100) + 1;
		
		while(coin) {
			
			System.out.println(correctNumber);
			System.out.println(minScore + " - " + maxScore);
			System.out.print(cnt + ">>");
			answer = scanner.nextInt();
			
			
			if(correctNumber == answer) {
				System.out.println("맞았습니다.");
				System.out.println("다시하시겠습니까(y/n)");
				System.out.print(">>");
				chk = scanner.next();
				cnt = 1;
				if(chk.equals("y")) {
					coin = true;
					correctNumber = r.nextInt(100) + 1;
				} else if(chk.equals("n")) {
					coin = false;
					System.out.println("종료하겠습니다.");
				}
				
			} else if (correctNumber > answer) {
				System.out.println("더 높게");
				minScore = answer;
				cnt = cnt + 1;
				
			} else if (correctNumber < answer) {
				System.out.println("더 낮게");
				maxScore = answer;
				cnt = cnt + 1;
			}
			
		}
		
		
		
		scanner.close();
	}

}