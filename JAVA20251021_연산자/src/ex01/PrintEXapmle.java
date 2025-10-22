package ex01;

/*작성자 최홍석
 * 2025년 10월 21일 연습용
 */
/* 1. 한 파일안에는 한 클래스만 있는 것이 일반적
 * 2. 두개 클래스가 존재하면, public 키워드는 한곳만 지정
 *   --> public 키워드가 있는 곳 클래스 명이 파일명
 * 3. public이 없는 클래스가 두 개 이상 존재할때는 파일명은 클래스명 아무거나 사용 가능
 *    단, main함수가 있다면 main함수가 있는 곳 클래스 명을 파일명으로 기입한다.
 */
public class PrintEXapmle// 이 이름과 파일의 이름은 같아야한다
{

	public static void main(String[] args) {
//이코드는 콘솔 출력시 사용하는 문구
		System.out.println("Hello,JAVA3");
		int age = 500;

		System.out.println("안녕하세요,"+ age +" 최홍석입니다");
		System.out.println("안녕하세요,"+ age +" 최홍석입니다");
		System.out.println("안녕하세요,"+ age +" 최홍석입니다");
		System.out.println("안녕하세요,"+ age +" 최홍석입니다");
		System.out.println("안녕하세요,"+ age +" 최홍석입니다");
		System.out.println("안녕하세요,"+ age +" 최홍석입니다");
		System.out.println("안녕하세요,"+ age +" 최홍석입니다");
		System.out.println("안녕하세요,"+ age +" 최홍석입니다");
		System.out.println("안녕하세요,"+ age +" 최홍석입니다");
		System.out.println("안녕하세요,"+ age +" 최홍석입니다");
		
		System.out.printf("hellow java");
		
		System.out.println();
		
		double f = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		System.out.println(f); //실수는 너무 많기 때문에 컴퓨터가 근사치를 정함 그래서 오류가 날 수 있음
		
		
		
		//sysout
		
		// 한줄 주석
		/*
		 * 여러줄 주석 주석은 설명문이거나, 쓸지도 모르는 코드를 막아놓는 용도
		 */

		/* 그냥 이렇게 쭉쓰고 드래그 컨트롤 시프트 슬래쉬 하면 다 주석이된다 */
//        한줄 주석은 드래그 컨트롤 슬래쉬다
		// 주석 해제는 컨트롤 쉬프트 \ 이것이다

		/*
		 * System.out.print(그냥프린트는 줄바꿈이 없다); System.out.println(ln은 줄바꿈이 있다);
		 */

	}

	class Tast {
	}

}

