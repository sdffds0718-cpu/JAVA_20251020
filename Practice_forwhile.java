package 연습하자;

import java.util.Scanner;

public class Practice_forwhile {

	public static void main(String[] args) {
		/*
		 * 1부터 10까지 숫자를 출력하는 프로그렘을 작성하시오
		 */
/*int sum = 0;
for (int i = 1; i<=10; i++) {
System.out.print(i + "  ");	
sum+=i;


}*/
		
		//1부터 100까지의 짝수만 출력하시오
		
		/*int sum = 0;
		for (int i = 1; i<=100; i++ ) {
		if (i % 2 == 0) {
			System.out.println(i);
			*/
				
	


	//1부터 10까지의 합을 구하시오
	/*int sum = 0;
	for(int i = 1; i <=10; i++) {
		sum+=i;
		
	}
System.out.println("1부터 10의 합은" + sum);
	*/
		//2단부터 9단까지 구구단을 출력
/*		for (int i = 2; i <= 9; i++) {
		    System.out.println("---- " + i + "단 ----");
		    
		    for (int j = 1; j <= 9; j++) {
		        System.out.println(i + " x " + j + " = " + i*j);
		    }

		    System.out.println(); // 한 단 끝나면 줄바꿈
		}
*/
		//while 1부터 5까지 출력하시오
		 
/*		int i = 1;
		
		while (i<=5) {
			
			System.out.println(i); 
			i++;
			
		}
	*/
		//1부터 10까지 합을 구하시오
		
		/*int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum+=i;
			i++;
			
			
		
		}
		System.out.println(sum);
		*/
		//1부터 100까지의 홀수만 출력
		
		/*int i = 1;
		
		while (i<=100) {
			i++;
			if (i % 2==1) {  
			
			
				System.out.println(i);}
			
			}
			*/
		
		//사용자가 입력한 숫자값  합을 구하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while (i <= num){
sum=sum + i;		 
		i++;
		}
		
	

	System.out.println("답은" + sum);
	}
}
