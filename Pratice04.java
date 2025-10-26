package 연습하자;

import java.util.Scanner;

public class Pratice04 {

	public static void main(String[] args) {
		/*//for 문 1부터 10까지 숫자를 출력하시오
		
		for (int i = 1; i<= 10; i++) {
			System.out.print(i + " ");
		}

	
	//while 문 1부터 100까지의 합을 구하시오.
		int i = 1;
		int sum = 0;
		while (i<= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		*/
		//if문 사용자로 부터 점수를 받아 60점 이상이면 합격 아니면 불합격을 출력
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("점수를입력하세요");
		
		int i = sc.nextInt();
		if ( i >= 60) { 
			
			System.out.println("합격입니다");
		}
		else {  
			System.out.println("불합격입니다");
		}
*/
		//삼항 연산자 사용자에게 정수를 입력받아 짝수면 even 홀수면 odd를 출력하세요
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int i = sc.nextInt();
		String result = ( i % 2 == 0) ? "Even" :  " ODD " ; 
		System.out.println(result);
	*/
		// 응용 for 문 구구단중 5단 부터 7단까지 출력
		
		
		
		/*for ( int i = 5; i <= 7 ; i++) { 
			System.out.println("-----" + i + "단 -----");
		for ( int j = 1; j <= 9 ; j++) 
			System.out.println(i + "X" + j + "=" + i * j);
		
		
		}
	 
	System.out.println();
	*/
		 // while문: 1부터 50까지 중 3과 5의 공배수(=15의 배수)만 출력
     /*   int i = 1;
        while (i <= 50) {
            if (i % 15 == 0) {
                System.out.println(i);
            }
            i++; // 반드시 while 문 "안"에서 증가!
        }
        //사용자로부터 나이를 입력받아 아래와 같이 출력하시오
        //0~12세 어린이
        //13-19세 청소년
        //20세이상 성인
        
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력해주세요");
        int age = sc.nextInt();
        if ( age <= 12) {
        	System.out.println("어린이");}
        	else if (age <= 19) {
        		System.out.println("청소년");}
        		else {
        			System.out.println("성인");
        		}
        */
        //사용자에게 두 개의 수를 입력받아 더큰 수를 출력하시오
        
    /*    Scanner sc = new Scanner(System.in);
        System.out.println("첫번 째 숫자를 입력하세요");
        int a = sc.nextInt();
        
        System.out.println("두번 째 숫자를 입력하세요");
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println(max);
    */
        // 사용자로부터 정수 하나를 입력받아 
        // 1부터 그 수까지의 합을 for문으로 구하고,
        //합이 100보다 크면 "100 초과",
        //그렇지 않으면 "100이하"를 if문 또는 삼항연산자로 출력하시오
        
        Scanner sc = new Scanner(System.in);
       System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        int sum = 0;
      
       for ( int i = 1; i<= num; i++) {
    	   sum+=i;
       }
    	   
    	   
    	   if ( sum > 100) {
    		   System.out.println("100 초과");}
    		   else {
    			   System.out.println("100 이하");
    	   
    		   }
       }
	
	
	
	
	}
	
        
        
    



