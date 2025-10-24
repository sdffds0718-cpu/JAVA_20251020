package ex01;

public class ForEx3 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		/*
		 * for (초기값 ; 조건 ; 증가)
		 * 조건만 하면 실행될 코드 (실행코드)
		 * 실행순서
		 * 처음 : 초기값 > 조건 > 실행코드 > 증가값
		 * 이후 : 조건 > 실행코드 > 증가값
		 */
		for (; i<=100; i++) {
			if (i % 2 == 0){
			sum += i;
//초기값 i=1; 이 for구문 밖에 있어도 작동가능하다.
			}
		}
System.out.println("1~100까지 짝수의 합 :" + sum);


System.out.println( sum);


	}

}
