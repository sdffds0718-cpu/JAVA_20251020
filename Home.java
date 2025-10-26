package 연습하자;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		//오늘한걸 복습합니다
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("나이는?");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("주소는?");
		String adress = sc.nextLine();
		System.out.println("이름은?");
		String name = sc.nextLine();
		System.out.println("생년월일은?");
		int birth = Integer.parseInt(sc.nextLine());
		System.out.println("성별은?");
		String sex = sc.nextLine();
		
		System.out.println("END");
		System.out.println("나이" + age);
		System.out.println("주소" + adress);
		System.out.println("이름" + name);
		System.out.println("생년월일" + birth);
		System.out.println("성별은" + sex);

	}

}
