package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("나이는?");
	int age = Integer.parseInt(sc.nextLine());
    System.out.println("주소는?");
    String adress = sc.nextLine();   
	System.out.println("이름은?");
    String name = sc.nextLine();
    System.out.println("몸무게는?");
    double weight = Double.parseDouble(sc.nextLine());
    
    System.out.println("나이는" + age);
    System.out.println("주소는" + adress);
    System.out.println("이름은" + name);
    System.out.println("몸무게는" + weight);

	}

}
