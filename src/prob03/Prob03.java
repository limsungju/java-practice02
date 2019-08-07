package prob03;

public class Prob03 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		
		// 원래 배열 원소 출력
		printCharArray(c);

		// 공백 문자 바꾸기
		replaceSpace(c);

		// 수정된 배열 원소 출력
		printCharArray(c);
	}

	public static void replaceSpace(char c[]) {
		String str = new String(c);
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				c[i] = ',';
			}
		}
		//System.out.println(str2);
	}

	public static void printCharArray(char c[]) {
		
		String str = new String(c);
		System.out.println(str);
	}
}
