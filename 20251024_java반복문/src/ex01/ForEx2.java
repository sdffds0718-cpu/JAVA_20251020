package ex01;

public class ForEx2 {

	public static void main(String[] args) {
		int sum = 0;
		/*
		 * for (초기값 ; 조건 ; 증가)
		 * 조건만 하면 실행될 코드 (실행코드)
		 * 실행순서
		 * 처음 : 초기값 > 조건 > 실행코드 > 증가값
		 * 이후 : 조건 > 실행코드 > 증가값
		 */
		for (int i = 1; i<=100; i++) {
			if (i % 2 == 0){
			sum += i;
			}
		}
System.out.println("1~100까지 짝수의 합 :" + sum);


System.out.println( sum);


	}

}
