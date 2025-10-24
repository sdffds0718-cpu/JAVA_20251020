package ex01;

public class WhileEx6 {

	public static void main(String[] args) {
		
		
		/*
		 * 중첩 for문 - 구구단 출력
		 */
		/*for (int i = 1;  i<=5; i++) {
			System.out.println("----"+ i + "단----");
		for (int j = 1; j<=9; j++) {
			System.out.println(i+  "X" + j + "=" + i * j);}
*/
		int i = 2;
		int j = 1; 
		while (i <= 5) {
			j=1;
			System.out.println("-----" + i + "단 -----");
		}
			while (j<= 9) {
				System.out.println(i + "X" + j + "=" + i * j);
		j++;
}
i++;

	}

	
	
	
	}

