package 연습하자;

public class Pratice03 {

	public static void main(String[] args) {
		//1부터 20까지의 숫자중 3의 배수 if구문
		
		/*int sum = 0;
		for (int i = 1; i<21; i++) {
			if (i % 3 == 0)
				sum= i;
			System.out.println(sum);
			
		}
*/
		
		
		//5단부터 7단까지 구구단을 출력하시오
		
	/*	int sum = 0;
		for (int i= 5; i <= 7; i++) {
			System.out.println( "-----" + i +"단 -----");
			for (int j = 1; j <= 9; j++) {
			
				System.out.println(i + "X" + j + "=" + i * j);
			}
			
		}*/
		// 1부터 10까지의 합을 while로 구하시오
		/*
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
*/
	
		//1부터 시작해서 누적합이 처음으로 100을 넘는 숫자는 14입니다.
		
		int i = 1;
		int sum = 0;
		while(sum<100) {
			i++;
			sum+=i;
		}
		System.out.print("누적합이 처음으로 100을 넘는 숫자는"+ i + "입니다");		
		
		
	}


}
