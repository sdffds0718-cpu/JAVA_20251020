package ex04;

public class 입력O출력X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1 = new student();
s1.name = "최홍석";
s1.age = 33;
s1.address = "강동구 천호동";
System.out.println(s1.name);
System.out.println(s1.age);
System.out.println(s1.address);
s1.study();



System.out.println("------------------");

student s2 = new student();
s2.name = "선아영";
s2.age = 28;
s2.address = "강동구 암사동";
s1.address = "강동구 천호동";
System.out.println(s2.name);
System.out.println(s2.age);
System.out.println(s2.address);
s2.study();
s1.add(5,2);


s2.add(10, 29);

	}
}
	/*
	 * 클래스 - 맴버변수(속성), 맴버 메소드(함수)
	 * 맴버변수 - 정적인것(상태)
	 *  멤버메소드는 -동적(행동)
	 *  class 는 설계도 그래서 메인에 집을 지을 수 있다.
	 */
class student {
	String name;
	int age ;
	String address;
 void study() {
	 System.out.println(name +" Java 공부 중 입니다."  );
 }
 //함수명 add , 반환타입(리턴값): void(없다는소리), 매개변수(입력값): 정수 2개(int형)
 void add(int n1 , int n2) {
	 int sum = n1 + n2;
	System.out.println("두수 합:" + sum);
 }
}
